import abb.ArbolBinariodeBusqueda;

public class Main {
    public static void main (String [] args ) {
        ArbolBinariodeBusqueda abb = new ArbolBinariodeBusqueda();

        abb.insertar(3);
        abb.insertar(2);
        abb.insertar(4);
        abb.insertar(1);
        abb.insertar(3);
        abb.insertar(5);
        abb.insertar(7);
        abb.insertar(6);

        abb.mostrarInOrden();

        abb.insertar(3);
        abb.insertar(2);
        abb.insertar(4);
        abb.insertar(10);
        abb.insertar(15);
        abb.insertar(20);
        abb.insertar(25);
        abb.insertar(30);

        abb.mostrarInOrden();
    }
}
