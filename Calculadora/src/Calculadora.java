import java.util.Scanner;

public class  Calculadora{
    public static void main(String[] args) throws Exception {



        float valorFinal;

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("\n\naperte o caracter referente a operação que deseja realizar: \n");
        System.out.println("\tSoma : + \n\tSubtração : - \n\tMultiplicação : * \n\tDivisão : / \n");


        /*Nota importante se utilizar o tipo string para pegar o caracter, não vai funcionar
         * deve se usar o tipo char e no caso do next line colocar um .chartAt(0); se não ele não le o 
         * caracter.
         */

        char operador = teclado.nextLine().charAt(0);
        

        float n1 = teclado.nextFloat();

        float n2 = teclado.nextFloat();

        valorFinal = cal(operador, n1, n2);

        System.out.println(valorFinal);

    }

   
    public static float cal(char operador, float n1, float n2)
    {
        switch (operador){
            case '/':
                return n1/n2;
            case '+':
                return n1 + n2;
            case '-':
                return n1 - n2;
            case '*':
                return n1*n2;
        }

        return 0;
    }
}
