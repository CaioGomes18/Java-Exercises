public class CalculandoASomaeAMediaArray {
    

    public static void main(String []args)
    {
        int sum= 0;
        int[] num = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        double media;

        for(int i =0; i<num.length; i++){
            sum = sum + num[i];
        }
        //No caso estamos passando as variaveis inteiras para double, nesse caso estamos usando o casting
        media = ((double)sum / (double)num.length);

        System.out.println("A soma dos elemnetos dentro do array é : " + sum);
        System.out.println("A media dos valores que estão dentro do array é : " + media);
    }
}
