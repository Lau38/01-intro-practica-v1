package ar.edu.unahur.obj2.ejercicio1;

import javax.swing.JOptionPane;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;



public class Ejercicio4 {
    public static void main(String[] args) {

        int cantidadCompañeros;
        cantidadCompañeros= Integer.parseInt(JOptionPane.showInputDialog("Ingresar cantidad de compañeros"));

        List<String> nombresyApellidos = new ArrayList();

        for (int e=0 ; e < cantidadCompañeros ; e++  ) {
            nombresyApellidos.add(JOptionPane.showInputDialog("Ingresar los nombres y apellido"));
        }


          String letra;
            letra = JOptionPane.showInputDialog("Ingrese una letra:");
            List<String> personasQueEmpiezanConEsaLetra = new ArrayList<>();



                for (int e = 0; e < nombresyApellidos.size(); e++) {
                if (nombresyApellidos.get(e).charAt(0) == letra.charAt(0)) {
                    personasQueEmpiezanConEsaLetra.add(nombresyApellidos.get(e));
                }

            }

            System.out.print("Los nombres que empiezan con la letra ingresada son:" + "  " + personasQueEmpiezanConEsaLetra);


        }

}
