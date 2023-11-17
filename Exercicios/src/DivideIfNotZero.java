import java.util.*;
public class DivideIfNotZero {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1;
        double num2;

        System.out.println("Digite um número : ");

        num1 = Double.parseDouble(input.next());
        if(num1 == 0){
            System.out.println("Seu número é zero , ERRO");
        }
        else{
            System.out.println("Digite o segundo número");
            num2 = Double.parseDouble(input.next());
            System.out.println("A divisão entre esses dois número é : " + (num1 / num2));
        }
        input.close();
    }
}
