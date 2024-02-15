import java.util.InputMismatchException;
import java.util.Scanner;
public class TratamentoDeExcecao_1 {
    

    public static void main(String[] args) {
        
        try{
        Scanner input = new Scanner(System.in);

        System.out.println("DIgite seu Nome : ");
        String nome = input.next();

        System.out.println("Digite seu sobrenome : ");
        String sobreNome = input.next();

        System.out.println("Digite sua idade : ");
        int idade = input.nextInt();

        System.out.println("Digite sua altura");
        double altura = input.nextDouble();

        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobreNome.toUpperCase());
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");

        input.close();

        }
        catch(InputMismatchException e){
            System.out.println("Os campos devem ser preechidos de acordo");
        }
    }
}
