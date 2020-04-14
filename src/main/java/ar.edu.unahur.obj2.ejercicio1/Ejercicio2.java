package ar.edu.unahur.obj2.ejercicio1;

public class Ejercicio2 {
    public int[] compararMayores(){
        int valorIngreso = 10;
        int [] listaNumeros = { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int[] respuestaMayores = new int[20];
        int posicion =0;
        for (int i = 0 ; i < listaNumeros.length ; i++  ){
            if (listaNumeros[i] > valorIngreso ){
                respuestaMayores[posicion] = listaNumeros[i] ;
                System.out.println(respuestaMayores[posicion]);
                posicion = posicion +1;
            }
        }
        return respuestaMayores;
    }
}
