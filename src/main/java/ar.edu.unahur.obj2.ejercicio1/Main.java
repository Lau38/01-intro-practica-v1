package ar.edu.unahur.obj2.ejercicio1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    List<Empleado> empleado = new ArrayList<>();
    Scanner entrada = new Scanner(System.in);
    int dni;
    String nombre;
    String apellido;
    String email;
    float  sueldoBase;
    String tipo;


    public static void main(String[] args) {



    }

    public void ingresaDatos(){
        int cantidadEmpleados; // pregunto cuantos empleados voy a ingresar para saber el largo del for
        cantidadEmpleados=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de empleados"));
        for(int i=0;i<cantidadEmpleados;i++ ) {
            tipo = entrada.nextLine();
            if (tipo=="administrativo"){
                System.out.print("cargar datos de administrativo");
               // preungo de que tipo es SI ES ADMNISTRATIVO QUIERO CARGAR LOS DATOS EXTRAS QUE TIENE ADMINISTRATIVO

            }
            else {
                // SI ES VENDEDOR LO MISMO
            }
            // Y DESPUES CARGAR LOS DATOS QUE TIENEN EN COMUN TODOS
            System.out.print("Ingrese DNI");
            dni = entrada.nextInt();
            System.out.print("Ingrese nombre");
            nombre = entrada.nextLine();
            System.out.print("Ingrese apellido");
            apellido = entrada.nextLine();
            System.out.print("Ingrese email");
            email = entrada.nextLine();
            System.out.print("Ingrese sueldo base");
            sueldoBase = entrada.nextInt();
            System.out.print("Ingrese tipo administrativo o empleado");
            // Y AL FINAL DE tod agregarlo a la lista que cree arriba de tod en la clase
        }



    }
}
