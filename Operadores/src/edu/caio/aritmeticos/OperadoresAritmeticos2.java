package edu.caio.aritmeticos;

public class OperadoresAritmeticos2 {
    
    public static void main(String [] args)
    {
        //classe Operadores.java
        String nomeCompleto = "LINGUAGEM" + "JAVA";
		
        System.out.println(nomeCompleto);
        //qual o resultado das expressoes abaixo?
       String concatenacao ="?"; 

        concatenacao = 1+1+1+"1";/*Nesse caso a string aparece depois do números por isso ele vira 31, se
        se o "1 " tivesse sido no começo ele realizaria a concatenação*/

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;  

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";

        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;/*Nesse caso ele encontra um "1 " primeiro, por mais que depois
        seja todos números e não string, ele realiza concatenação */

        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);/*Nesse caso existe uma evidencia nesse caso o resultado é 13 */

        System.out.println(concatenacao);
    }

}
