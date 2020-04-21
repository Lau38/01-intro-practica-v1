package ar.edu.unahur.obj2.ejercicio1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;


public class Ejercicio4 {
    public static void main(String[] args) {


        List nombreyApellido = new ArrayList<>();
        nombreyApellido.add(JOptionPane.showInputDialog("Ingrese los nombres y apellidos:"));

        char letra;
        letra = JOptionPane.showInputDialog("Ingrese una letra:").charAt(0);
        ArrayList personasQueEmpiezanConEsaLetra = new ArrayList<>();


        for (int e =0 ; e <  nombreyApellido.size();e++){
            if( nombreyApellido.get(e).charAt(0)== letra){
                personasQueEmpiezanConEsaLetra.add(nombreyApellido.get(e));
            }

        }

        System.out.print("Los nombres que empiezan con la letra ingresada son:" +"  " +personasQueEmpiezanConEsaLetra );
    }

}
