 
//////////////////////////INDICE DE MAYOR Y MENOR DATO DEL ARREGLO///////////////////////////

int[] vector = {3, 54, 1, 32, 9, 58, 31,315, 90, 23, 67, 72, 112,26};

        int min=1;
        int max=1;

        for (int i = 0; i < vector.length; i++) {

            if (vector[i] < vector[min]) {

                min = i;
            }else
            
            if(vector[i]>vector[max]){
                
                max = i;
            }
            

        }
        
        System.out.println("MIN: "+ min);
        System.out.println("MAX: "+ max);



//////////////////////////VALOR DE MAYOR Y MENOR DATO DEL ARREGLO///////////////////////////

public static void main(String[] args) {

        int[] vector = {3, 54, 2, 32, 9, 58, 31, 90, 23, 67, 72, 112};

        int min = 1000;
        int max = -1;

        for (int i = 0; i < vector.length; i++) {

            if (vector[i] < min) {

                min = vector[i];
            }

            if (vector[i] > max) {

                max = vector[i];
            }

        }

        System.out.println("MINIMO: " + max);
        System.out.println("MAXIMO: " + min);

    }

