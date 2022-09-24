from asyncio.windows_events import NULL
from django.shortcuts import render
from .models import Producto,Carrito

# Create your views here.
def verProductos(request, id= NULL):

    if not id:
        listaProductos = Producto.objects.all()
        context = {
            'productos': listaProductos,
        }
        return render(request, 'productos/productos.html', context)
    else:
        id = int(id)
        regProducto = Producto.objects.get(id=id)
        context = {
            'producto': regProducto,
        }        
        return render(request, 'productos/unProducto.html', context)

"""
 Funcion para el manejo de los productos en el carrito
"""
def agregar (request, id= NULL):
    id = int(id)
    user = request.user
    regProducto = Producto.objects.get(id=id)
    existe= Carrito.objects.filter(cliente = user, producto = regProducto, estado ='carrito').exists()
    if existe:
        regCarrito = Carrito.objects.get(producto = regProducto, estado ='carrito')
        regCarrito.cantidad += 1
        regCarrito.save()
    else:
        regCarrito = Carrito(cliente = user, producto =regProducto, precio =regProducto.precio)
        regCarrito.save()   

    listaProductos = Producto.objects.all()
    context = {
            'productos': listaProductos,
        }
    return render(request, 'productos/productos.html', context)

def verCarrito(request):
    regUser = request.user
    carrito = Carrito.objects.filter(cliente=regUser, estado='carrito')
    # Recorrer elementos del carrito para calcular totales

    listaCarrito = []
    total = 0
    for prod in carrito:
        unProducto={
			'cantidad': prod.cantidad,
			'icono': prod.producto.imagen,
			'nombre': prod.producto.nombre,
			'valor': prod.producto.precio,
			'total': int(prod.cantidad)	* int(prod.producto.precio),
			'id': prod.id,
	    }
 
        listaCarrito.append(unProducto) 
        total += unProducto['total']

    #ensamblar datos para la plantilla
    context = {
        'carrito':  listaCarrito,
        'subtotal': total,
        'iva': total * 0.19,
        'envio': 8000,
        'total': total * 1.19 + 8000,
    }
    print('pppp')
    print(context)
    return render(request, 'productos/carrito.html', context)

def eliminarItemCarrito(request,id):
    regCarrito=Carrito.objects.get(id=id)
    regCarrito.estado='cancelado'
    regCarrito.save()
    return verCarrito(request)

