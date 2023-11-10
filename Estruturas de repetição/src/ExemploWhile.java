
import java.util.concurrent.ThreadLocalRandom;
//Biblioteca para fazer a criação de números randomicos
public class ExemploWhile 
{
    
    public static void main(String[] args) 
    {
        double mesada = 50;
        double valorDoce;
        while(mesada > 0 )
        {
            valorDoce = valorAleatorio();

            if(valorDoce > mesada)
            {
                valorDoce = mesada;
            }

            System.out.printf("O doce de valor %.2f foi adicionado ao carrinho\n", valorDoce);

            mesada -= valorDoce;

        }
        System.out.println("Valor da mesada : "+ mesada);
        System.out.println("JoaoZinho gastou toda sua mesada.");
    }

    private static double valorAleatorio()
    {
        return ThreadLocalRandom.current().nextDouble(2, 15);
    }
}
