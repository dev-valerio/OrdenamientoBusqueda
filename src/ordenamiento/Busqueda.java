///////////////////////// DEVUELVE LA POSICION///////////////////////////
 public int buscar() {
        
       int clave = Integer.parseInt(txtNumero.getText());
        int bajo, central, alto;
        int valorCentral;        
        bajo = 0;
        alto = codigo.length - 1;

        
        while (bajo <= alto) {

            central = (bajo + alto) / 2;
            valorCentral = codigo[central];

            if (clave == valorCentral) {
                return central;

            } else if (clave < valorCentral) {

                alto = central - 1;
            } else {
                bajo = central + 1;
            }

        }

        return -1;
        
    }
    
    
    ////////////////////////////////CONDICION O TRUE////////////////////////
    
    
        int bajo, central, alto;
        int valorCentral;
        bajo = 0;
        alto = numero.length - 1;
        boolean condicion = false;
        int e = 0;

        while (!condicion && bajo <= alto) {

            central = (bajo + alto) / 2;
            valorCentral = numero[central];

            if (clave == valorCentral) {
                condicion = true; // return central (indice o posicion del numero)   
                e = central;
            } else {
                if (clave < valorCentral) {

                    alto = central - 1;
                } else {
                    bajo = central + 1;
                }

            }

        }

        if (condicion == true) {
            System.out.println("\n" + clave + "----> Encontrado en la posicion " + e + "\n");
        } else {
            System.out.println("\n" + clave + "----> Valor NO encontrado\n");
        }

    }
