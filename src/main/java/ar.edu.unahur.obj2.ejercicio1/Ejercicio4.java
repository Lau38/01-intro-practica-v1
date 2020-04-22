package ar.edu.unahur.obj2.ejercicio1;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int cantidadCompañeros;
        cantidadCompañeros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de compañeros"));
        char[] nombreyApellido = new char [cantidadCompañeros];
        List<Character> personasQueEmpiezanConEsaLetra= new ArrayList();

        for (int e =0 ; e <cantidadCompañeros ;e++){
            System.out.print((e+1)+ ". Digite los nombres de tus compañeros");
            nombreyApellido[e] = entrada.next().charAt(0);
        }


        char letra;
        letra = JOptionPane.showInputDialog("Ingrese una letra:").charAt(0);


        //nombreyApellido.forEach(e -> e.charAt(0) == letra);
        for (int e =0 ; e < cantidadCompañeros ;e++){
            if( nombreyApellido.get(e).charAt(0) == letra){
                personasQueEmpiezanConEsaLetra.add(nombreyApellido.get(e));
            }

        }

        System.out.print("Los nombres que empiezan con la letra ingresada son:" +"  " +personasQueEmpiezanConEsaLetra );
    }

}
