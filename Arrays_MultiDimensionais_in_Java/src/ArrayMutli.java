public class ArrayMutli 
{
    public static void main(String [] args)
    {
        /**Nos arrays multidimensionais o primeiro colchete significa a linha do array e o segundo colchete significa para ditar o
         * valor
        das colunas**/
        //int [][] arr = new int[4][9];
        int [][] a = {{1, 2, 3}, {4, 5, 6, 9}, {7}};

        System.out.println("O tamanho da primeira linha do array bidimensional é : " + a[0].length);
        System.out.println("O tamanho da segunda linha do array bidimensional é : " + a[1].length);
        System.out.println("O tamanho da terceira linha do array bidimensional é : " + a[2].length);
    }
}
