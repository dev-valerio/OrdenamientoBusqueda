//METODO EQUALS DE LA CLASE OBJECT

public boolean equals(Object object) {

        if (this == object) {
            return true;
        }

        if (!(object instanceof Automovil)) {

            return false;
        }

        Automovil a = (Automovil) object;

        return ((this.marca != null && this.direccion != null && this.marca.equals(a.getMarca())) && (this.direccion.equals(a.getDireccion())));
    }
