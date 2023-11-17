import java.util.Scanner;

public class MultipleIfNotZero {
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1 = 0;
        int n2 = 0;
        System.out.println("Digite o seu um número");
        n1 = Integer.parseInt(input.nextLine());

        if(n1 == 0){
            System.out.println("Seu número é zero");
        }
        else{
            System.out.println("Digite o segundo número");
            n2 = Integer.parseInt(input.nextLine());
            System.out.println("O produto dos dois número é " + n1 * n2 );
        }
        input.close();
    }
}
