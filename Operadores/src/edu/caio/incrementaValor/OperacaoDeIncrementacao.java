package edu.caio.incrementaValor;

public class OperacaoDeIncrementacao 
{
    public static void main(String [] args){

        int numero = 5;

        //numero = numero++;
        //numero = numero + 1 



        //Jeito errado
        System.out.println(numero++);//nesse caso não irá funcionar pois o java printa e depois incrementa.

        //Jeito certo
        System.out.println(++ numero);//nesse caso incrementará antes e depois printará.

        //mesma coisa acontece com o valor para decrementar 
        

        //jeito errado
        System.out.println(numero--);

        //jeito certo
        System.out.println(--numero);
    }   
}
