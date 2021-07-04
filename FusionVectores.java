//FUSION DE DOS VECTORES ------01
public class Formulario {

    public static void main(String[] args) {

        int[] a = {11, 13, 14, 17, 20};
        int[] b = {12, 15, 16, 18, 19, 21, 22};

        int m = a.length;
        int n = b.length;

        int[] c = fusion(a, b, m, n);

        for (int i = 0; i < 12; i++) {
            System.out.print(c[i] + "  ");
        }
    }

    private static int[] fusion(int[] a, int[] b, int m, int n) {
        int[] c = new int[a.length + b.length];

        int i = 0;
        int j = 0;
        int k = 0;
        int x;

        while (i < m && j < n) {

            if (a[i] <= b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }

        if (i < m) {

            for (x = i; x < m; x++) {
                c[k] = a[x];
                k++;
            }
        }

        if (j < n) {

            for (x = j; x < n; x++) {
                c[k] = b[x];
                k++;
            }

        }

        return c;
    }
}



//FUSION DE DOS VECTORES ------02

/*
public static void main(String[] args) {

        int[] a = {10,20,30,40,50,60,70,80,90,100,110,120};
        int[] b = {1,2,3,4,5,6,7,8,9,10,11,12};
        int m = a.length;
        int n = b.length;
       
      int [] c=  fusion(a, b, m, n);
        
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + "  ");
        }
       
    }

    private static int[] fusion(int[] a, int[] b, int m, int n) {

        int i=0;
        int j=0;
        //int p = a.length + b.length;
        int[] c = new int[a.length + b.length];
        
        
        
        while (i<12) {
            
            for (int k = 0; k < 3; k++) {
                
                c[j]= a[k+i];
                
                j++;
            }
            
            for (int k = 0; k < 3; k++) {
                
                c[j] = b[i+k];
                
                j++;
            }
            
            i+=3;
        }
        
        return c;
    }


*/
