package ar.edu.unahur.obj2.ejercicio1;

import javax.swing.*;
import java.util.Random;


public class Ejercicio7 {
    public static void main(String[] args) {

        Random r = new Random();
        int matriz[] [], nroFilas,nroColumnas;

        nroFilas= Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de filas:"));
        nroColumnas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de columnas:"));

        matriz = new int [nroFilas] [nroColumnas];

        System.out.println("Digite la matriz:  ");
        for (int i=0; i<nroFilas ; i++) {
            for (int j=0; j<nroColumnas; j++) {
                System.out.print("Matriz ["+ i +"] ["+ j +"]: ");
                matriz[i] [j] = r.nextInt(100);
            }

        }

        System.out.println("\nLa matriz es :");
        for (int i=0; i < nroFilas ; i++){
            for (int j=0 ; j < nroColumnas ;j++){
                System.out.print(matriz[i] [j]+ "\t");
            }
            System.out.println("");
        }


    }
}

