import java.util.Random;

public class Case_1 
{
    

    public static void main(String []args)
    {
        Random gerador = new Random();

        int [] candidatos = new int[10];
        int j = 0;
        double valorBase = 2000;

        for(int i = 0 ; i < candidatos.length ; i++)
        {
            double valorPretendido = (gerador.nextInt(1600,3000));
            System.out.println(valorPretendido);

            if(valorPretendido < valorBase)
            {
                System.out.println(" LIGAR PARA O CANDIDATO");
                candidatos[j] = i;
                j++;

            }
            else if(valorPretendido == valorBase)
            {
                System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA;");
                candidatos[j] = i;
                j++;
            }
            else
            {
                System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS.");
            }
        } 

        System.out.println("O total de candidatos que seram chamados é : " + j);
        System.out.println("Os cadidatos que passaram foram :");
        for(int x = 0 ; x < candidatos.length; x++){
            if(candidatos[x] == 0){
                continue;
            }
            else{
                System.out.print(candidatos[x]);
                System.out.print(", ");
            }
        }
    }
}
