package ar.edu.unahur.obj2.ejercicio1;


import java.util.ArrayList;

public class Ejercicio3 {
        public static void main(String[] args) {
            ArrayList temperatura = new ArrayList<>();
            double[] t;
            t =new double[24];
            t[0] = 15.0d;
            t[1] = 15.2d;
            t[2] = 15.1d;
            t[3] = 15.2d;
            t[4] = 15.1d;
            t[5] = 15.1d;
            t[6] = 14.9d;
            t[7] = 16.1d;
            t[8] = 16.5d;
            t[9] = 17.2d;
            t[10] = 19.5d;
            t[11] = 20.0d;
            t[12] = 22.1d;
            t[13] = 23.3d;
            t[14] = 25.2d;
            t[15] = 26.3d;
            t[16] = 25.9d;
            t[17] = 25.8d;
            t[18] = 24.2d;
            t[19] = 24.1d;
            t[20] = 20.7d;
            t[21] = 19.6d;
            t[22] = 17.3d;
            t[23] = 16.5d;
            double menor=0;
            double mayor=0;
            double sum=0.0f;
            String asteriscos = "";
            for(int i=0;i<t.length;i++){
                if(t[i]<menor){menor=t[i];}
                if( t[i]>mayor){mayor=t[i];}
                sum+=t[i];
            }


            for(int i=0;i<t.length;i++) {
                asteriscos="";
                for(int j=1;j<=t[i];j++){
                    asteriscos+="*";
                }
                if(t[i]==menor) {
                    temperatura.add(i +" " + asteriscos + " "+ t[i]+" --> MIN \n");

                }
                if(t[i]==mayor) {
                    temperatura.add(i + " " + asteriscos + " "+ t[i]+" --> MAX \n");
                }
                temperatura.add(i +" " + asteriscos + " "+ t[i]+"\n");
            }
            temperatura.add("Media: "+ sum/24+"\n");
            System.out.println(temperatura);
        }

    }






