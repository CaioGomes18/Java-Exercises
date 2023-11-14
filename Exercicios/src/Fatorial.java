import java.util.Scanner;
public class Fatorial{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fatorial = 0;

        System.out.println("Digite o número em que deseja realizar o fatorial");
        fatorial = input.nextInt();
        int operador = fatorial;
        for(int i = 1 ; i < operador; i++){
            fatorial *= i;
        }

        System.out.println(fatorial);
    }
}