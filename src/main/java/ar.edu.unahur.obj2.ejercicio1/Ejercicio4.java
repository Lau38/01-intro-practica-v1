package ar.edu.unahur.obj2.ejercicio1;

import javax.swing.JOptionPane;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Ejercicio4 {
    public static void main(String[] args) {
        List  nombresyApellidos = new ArrayList();
        nombresyApellidos.add(JOptionPane.showInputDialog("Ingresar los nombres y apellido"));


        char letra;
        letra = JOptionPane.showInputDialog("Ingrese una letra:").charAt(0);
        ArrayList personasQueEmpiezanConEsaLetra = new ArrayList<>();



        for (int e =0 ; e < nombresyApellidos.size() ;e++){
            if( nombresyApellidos.get(e).charAt(0) == letra){
                personasQueEmpiezanConEsaLetra.add(nombresyApellidos.get(e));
            }

        }

        System.out.print("Los nombres que empiezan con la letra ingresada son:" +"  " +personasQueEmpiezanConEsaLetra );
    }

}
