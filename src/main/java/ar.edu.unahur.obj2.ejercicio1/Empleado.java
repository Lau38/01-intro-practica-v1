package ar.edu.unahur.obj2.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Empleado {

    int dni;
    String nombre;
    String apellido;
    String email;
    float  sueldoBase;
    String tipo;

     public Empleado(int dni, String nombre, String apellido, String email, float sueldoBase, String tipo){
         this.dni= dni;
         this.email=email;
         this.apellido=apellido;
         this.nombre=nombre;
         this.sueldoBase=sueldoBase;
         this.tipo=tipo;
     }








}

class Administrativo extends Empleado{
    float hsExtra;
    float hsMes;

  public Administrativo(int dni, String nombre, String apellido, String email, float sueldoBase,String tipo, float hsExtra, float hsMes) {

      super(  dni,  nombre, apellido, email,  sueldoBase, tipo);

      this.hsExtra = hsExtra;
        this.hsMes = hsMes;
        this.sueldoBase= sueldoBase * ((hsExtra * 1.5f) + hsMes) / hsMes;
    }




}

class Vendedor extends Empleado{
    float porcentajeComision;
    float totalVentas;


    public Vendedor(int dni, String nombre, String apellido, String email,float sueldoBase,String tipo, float porcentajeComision,float totalVentas) {
        super(dni, nombre, apellido, email, sueldoBase,tipo);
        this.porcentajeComision = porcentajeComision;
        this.totalVentas = totalVentas;
        this.sueldoBase= sueldoBase + (porcentajeComision*totalVentas/100);
    }


}
