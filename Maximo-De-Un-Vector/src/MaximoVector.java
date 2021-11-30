public class MaximoVector {

    public static String invertircadena(String cadena, int indice){
        if (indice == 0){
            return cadena.charAt(indice)+ " ";
        }else{
            return cadena.charAt(indice) + (invertircadena(cadena, indice - 1));
        }
    }
    public static String invertircadena (String cadena ){
        return invertircadena(cadena, cadena.length() -1 );
    }


    private static int compararvectores(int[] vector1, int[] vector2, int indice){
        int sumadiferencias;
        if(indice == vector1.length - 1){
            sumadiferencias = Math.abs(vector1[indice] - vector2[indice]);
        }else{
            sumadiferencias = Math.abs(vector1[indice] - vector2[indice]) + compararvectores(vector1, vector2, indice + 1);
        }
        return sumadiferencias;
    }


    public static boolean compararvectores(int[] vector1, int[] vector2) {
        return compararvectores(vector1, vector2, 0) == 0;
    }


    private static int maximovector (int [] vector, int indice, int maximo){
        if(indice == vector.length - 1 ){
            if (vector[indice] > maximo){
                maximo = vector[indice];
            }
        }else {
            if(vector[indice] > maximo){
                    maximo = vector[indice];
            }
            maximo = maximovector(vector, indice + 1, maximo);
        }
        return maximo;
    }
    public static int maximovector(int[] vector) {
        return maximovector(vector, 0, 0);
    }
}