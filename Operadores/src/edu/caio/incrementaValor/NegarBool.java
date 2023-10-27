package edu.caio.incrementaValor;

public class NegarBool {
    
    public static void main(String [] args)
    {
        boolean variavel = true;

        System.out.println(!variavel); 

        /*Nesse caso ele irá inverter para fazer a mostragem mas na memoria continuará true */

        //para resolver isso basta modificar o valor da variavel.

        variavel = !variavel;

        System.out.println(variavel);

    }


}
