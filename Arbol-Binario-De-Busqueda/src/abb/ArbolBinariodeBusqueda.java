package abb;

public class ArbolBinariodeBusqueda {
    private Nodo raiz;

    public ArbolBinariodeBusqueda(){
        raiz = null;

    }

    public boolean estaVacio() {
        return raiz == null;
    }

    public void insertar(Nodo padre, Nodo hijo, int dato) {
        if (hijo == null) {
            Nodo nuevo = new Nodo(null, dato, null);
            if (dato >= padre.getDato()) {
                padre.setDerecho(nuevo);
            } else {
                padre.setIzquierdo(nuevo);
            }
        }
        else {
                if(dato >= padre.getDato()) {
                    insertar(hijo, hijo.getDerecho(), dato);
                }
                else {
                    insertar(hijo, hijo.getIzquierdo(), dato);
                }
        }
    }
    public void insertar(int dato){
        if (estaVacio()) {
            Nodo nuevo = new Nodo (null, dato, null);
            raiz = nuevo;
        }else {
            if(dato >= raiz.getDato()) {
                insertar(raiz, raiz.getDerecho(), dato);
            }else {
                insertar(raiz, raiz.getIzquierdo(), dato);
            }
        }
    }
    private void mostrarInOrden (Nodo nodo){
        if (nodo == null){

        }else {
            mostrarInOrden(nodo.getIzquierdo());
            System.out.print(nodo.getDato() + "  ");
            mostrarInOrden(nodo.getDerecho());
        }
    }
    public void mostrarInOrden(){
        Nodo temp = raiz;
        mostrarInOrden(raiz);
        System.out.println();
    }
}

