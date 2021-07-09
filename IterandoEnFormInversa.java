public static void main(String[] args) {

        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int total = numeros.length;
                          //total
        for (int i = 0; i < total/2; i++) {
            
            int inicio = numeros[i];  
            int ultimo = numeros[total-1-i];
            
             numeros[total-1-i]=inicio;        
            numeros[i]=ultimo;            
            //total--
        }
        

    }
