/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package banco;

abstract class Persona{
    protected String nombre;
    protected String numero;
    public void guardarNombre(String nombre){
        this.nombre=nombre;
    }
    public void guardarNumero(String numero){
        this.numero=numero;
    }
}

class Cliente extends Persona{
    protected int saldo;
    protected double porcentajeAnual;
    protected double porcentajeMensual;
    protected String tipoCuenta;
    public void guardarSaldo(int saldo){
        this.saldo=saldo;
    }
    public void guardarPorcentajeAnual(double porcentajeAnual){
        this.porcentajeAnual=porcentajeAnual;
        this.porcentajeMensual=this.porcentajeAnual/12;
    }
    public void guardarTipoCuenta(String tipoCuenta){
        this.tipoCuenta=tipoCuenta;
    }
    public void retirar(int monto){
        System.out.println("Nombre Cliente = " +this.nombre);
        System.out.println("Numero Cliente = " + this.numero);
        System.out.println("Saldo = " + this.saldo);
        System.out.println("Tipo Cuenta = " + this.tipoCuenta);
        System.out.println("Interes Anual = " + this.porcentajeAnual);
        System.out.println("Interesa Mensual = " + this.porcentajeMensual);
        
        if(this.tipoCuenta=="Ahorros"){
            if(this.saldo-monto<500){
                System.out.println("Retiro no autorizado por monto menor de 500$");
            }else{
            this.saldo=this.saldo-monto;
                System.out.println("Nuevo saldo $ " +this.saldo);
        }
        }
        else{
             if(this.saldo-monto<10000){
                System.out.println("Retiro no autorizado por monto menor de 10000$");
            }else{
            this.saldo=this.saldo-monto;
                System.out.println("Nuevo saldo $ " +this.saldo);
        }
        }
    }
}
class Empleado extends Persona{
    protected int salario;
    protected int antiguedad;
    protected int diasVacaciones;
    public void guardarSalario(int salario){
        this.salario=salario;
    }
    public void guardarAntiguedad(int antiguedad){
        this.antiguedad=antiguedad;
    }
    public void guardarVacaciones(int diasVacaciones){
        this.diasVacaciones=diasVacaciones;
    }
    public void datosEmpleado(){
        System.out.println("*******************DATOS DE EMPLEADO*************  ");
        System.out.println("Nombre empleado = " + this.nombre);
        System.out.println("Numero empleado = " + this.numero);
        System.out.println("Salario = " + this.salario);
        System.out.println("Antiguedad en meses = " + this.antiguedad);
        System.out.println("Dias de vacaciones = " + this.diasVacaciones);
        
    }
}

public class Banco{
    public static void main(String[] args) {
        Cliente cliente1= new Cliente();
        
        cliente1.guardarNombre("Francisco Lozano");
        cliente1.guardarNumero("2-001");
        cliente1.guardarSaldo(25000);
        cliente1.guardarTipoCuenta("Inversion");
        cliente1.guardarPorcentajeAnual(18);
        cliente1.retirar(10000);
        //******************************************
        Empleado empleado1= new Empleado();
        empleado1.guardarNombre("German Fernandez");
        empleado1.guardarNumero("1-001");
        empleado1.guardarSalario(5000);
        empleado1.guardarAntiguedad(89);
        empleado1.guardarVacaciones(15);
        empleado1.datosEmpleado();
       
    }
}
