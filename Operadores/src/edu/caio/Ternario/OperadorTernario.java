package edu.caio.Ternario;

public class OperadorTernario {
    
    public static void main(String [] args){
         
        int a, b;

        a = 5;
        b = 6;

        String resultado = a == b ? "verdaderio" : "falso";

        System.out.println(resultado);

        //Não se limita a só sring.

        b = 5;

        int result = a == b ? 1 : 0;

        System.out.println(result);





    }


}
