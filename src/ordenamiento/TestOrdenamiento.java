package ordenamiento;

public class TestOrdenamiento {

    public static void main(String[] args) {

        int[] array = {70, 50, 30, 2, 10};
        int[] array2 = {45, 15, 14, 7, 23};
        int[] array3 = {17, 48, 4, 117, 25};
        int[] array4 = {17, 32, 16, 7, 24};

        seleccion(array);
        imprimirArray(array);

        System.out.println("");
        insercion(array2);
        imprimirArray(array2);

        System.out.println("");
        burbuja(array3);
        imprimirArray(array3);
        
        System.out.println("");
        quickSort(array4,0,array4.length-1);
        imprimirArray(array4);

    }

    //ORDENAMIENTO POR SELECCION
    private static void seleccion(int[] array) {

        for (int i = 0; i < array.length; i++) {

            int valor = i;

            for (int j = i + 1; j < array.length; j++) {

                if (array[valor] > array[j]) {

                    valor = j;
                }
            }
            int aux = array[i];
            array[i] = array[valor];
            array[valor] = aux;
        }

    }

    //ORDENAMIENTO POR INSERCION
    private static void insercion(int[] array) {

        for (int i = 1; i < array.length; i++) {

            int aux = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > aux) {

                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = aux;
        }

    }

    //ORDENAMIENTO POR BURBUJA
    private static void burbuja(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }

        }
    }

    //ORDENAMIENTO POR QUICKSORT
    private static void quickSort(int[] num, int izq, int der) {

        int pivote = num[izq];

        int i = izq;
        int j = der;
        int aux;

        while (i < j) {

            while (num[i] <= pivote && i < j) {
                //4
                i++;
                //5
            }

            while (num[j] > pivote) {
                //5
                j--;
                //4        
            }

            if (i < j) {

                aux = num[i];
                num[i] = num[j];
                num[j] = aux;
            }

        }

        num[izq] = num[j];
        num[j] = pivote;

        if (izq < j - 1) {
            quickSort(num, izq, j - 1);
        }
        if (j + 1 < der) {
            quickSort(num, j + 1, der);
        }

    }

    //MOSTRAR ELEMENTOS DEL ARRAY
    private static void imprimirArray(int[] var) {

        for (int i = 0; i < var.length; i++) {

            System.out.print(var[i] + "  ");
        }
    }

}
