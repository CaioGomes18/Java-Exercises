public class UsandoForEach {
    

    public static void main(String [] args){


        int [][] arr = {{4, 7, 9}, {34, 56}, {11, 22,45, 89}};

         for(int [] arrayDeDentro : arr){
            for (int a : arrayDeDentro) {
                System.out.println(a);
            }
         }
    }
}
