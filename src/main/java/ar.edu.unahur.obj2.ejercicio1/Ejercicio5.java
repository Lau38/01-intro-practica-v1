package ar.edu.unahur.obj2.ejercicio1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

class ContadorLetras {
    List<Integer> respuesta = new ArrayList();
    public static void main(String[] args) {
        String texto;

        //String[] alfabeto ={"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "x", "y", "z"};
        //alfabeto =new String[26];
        ContadorLetras contador = new ContadorLetras();
            contador.contarLetras(texto = JOptionPane.showInputDialog("Ingrese una texto:"));
            contador.visualizarRecuento();
    }

    public void contarLetras(String texto){
    int contador = 0;

        for (int i = 0; i < texto.length(); i++){
          for( int j=0; j < texto.length(); j++){
                if(texto.charAt(i) == texto.charAt(j) ){

                    contador++;
                }
          }
            respuesta.add(contador);
            contador = 0;

        }


    }

    public void visualizarRecuento(){

        System.out.print(respuesta);
    }
}


