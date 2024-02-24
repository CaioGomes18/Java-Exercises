import java.util.Scanner;
public class LoginTensteException {
    
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        int idade = 0;
        do{

            System.out.println("Digite a sua idade");
            idade = input.nextInt();

            try{
                calcularIdade(idade);
            }catch(NaoEntrarExeception e){
            System.out.println("Você não tem mais de 18 anos");
            }
 
        }while(idade < 18);
        

        input.close();
    }

    public static void calcularIdade(int idade) throws NaoEntrarExeception{

        if(idade < 18){
            throw new NaoEntrarExeception();
        }
        
    }
}
