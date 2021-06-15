package ordenamiento;

public class TestOrdenamiento {

    public static void main(String[] args) {

        int[] array = {70, 50, 30, 2, 10};

        int[] array2 = {45, 15, 14, 7, 23};

        seleccion(array);
        imprimirArray(array);

        System.out.println("");

        insercion(array2);
        imprimirArray(array2);

    }

    //ARRAY DE SELECCION
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

    //ARRAY DE INSERCION
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

    //MOSTRAR ELEMENTOS DEL ARRAY
    private static void imprimirArray(int[] var) {

        for (int i = 0; i < var.length; i++) {

            System.out.print(var[i] + "  ");
        }
    }

}