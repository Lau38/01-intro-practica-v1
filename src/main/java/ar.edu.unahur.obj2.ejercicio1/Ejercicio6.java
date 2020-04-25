package ar.edu.unahur.obj2.ejercicio1;

import javax.swing.*;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[] [], nroFilas,nroColumnas;

        nroFilas= Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de filas:"));
        nroColumnas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de columnas:"));

        matriz = new int [nroFilas] [nroColumnas];

        System.out.println("Digite la matriz:  ");
        for (int i=0; i<nroFilas ; i++) {
            for (int j=0; j<nroColumnas; j++) {
                System.out.print("Matriz ["+ i +"] ["+ j +"]: ");
                 matriz[i] [j] = entrada.nextInt();
            }
        }

            System.out.println("\nLa matriz es :");
        for (int i=0; i < nroFilas ; i++){
            for (int j=0 ; j < nroColumnas ;j++){
                System.out.print(matriz[i] [j]);
            }
          System.out.println("");
        }


        }
}
