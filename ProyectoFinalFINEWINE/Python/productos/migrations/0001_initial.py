# Generated by Django 4.1.1 on 2022-09-14 16:54

from django.db import migrations, models


class Migration(migrations.Migration):

    initial = True

    dependencies = [
    ]

    operations = [
        migrations.CreateModel(
            name='Producto',
            fields=[
                ('id', models.BigAutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('nombre', models.CharField(max_length=100)),
                ('descripcion', models.CharField(max_length=300, null=True)),
                ('precio', models.DecimalField(decimal_places=2, max_digits=8)),
                ('unidad', models.CharField(max_length=10)),
                ('imagen', models.ImageField(upload_to='')),
            ],
        ),
    ]
