import java.util.Scanner;


public class PositiveAndNegative {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número");

        int n1 = input.nextInt();

        if(n1 >= 0 ){
            System.out.println("Seu número é positivo");
        }
        else{
            System.out.println("Seu número é negativo");
        }
        input.close();
    }
}
