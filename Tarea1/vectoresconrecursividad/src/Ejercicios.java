public class Ejercicios {
    private static  int compararVectores(int[] vector1, int[] vector2, int indice)
    {
        int sumadiferencias;

        if (indice == vector1.length -1)
        {
            sumadiferencias = Math.abs(vector1[indice] - vector2[indice]);
        }else
        {
            sumadiferencias = Math.abs(vector1[indice] - vector2[indice]) + compararVectores( vector1 , vector2, indice + 1);
        }

        return sumadiferencias;
    }
    private static   boolean compararVectores(int[] vector1, int[] vector2)
    {
        return  compararVectores(vector1,vector2,  indice:0) == 0;
    }
}
