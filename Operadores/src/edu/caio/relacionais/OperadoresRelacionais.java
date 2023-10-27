package edu.caio.relacionais;

public class OperadoresRelacionais {
    
    public static void main(String [] args){


        String nomeUm = "Caio";

        String nomeDois = new String("Caio");
        
        if(nomeUm == nomeDois)
        {
            System.out.println("Suas Strings são iguais");
        }


        if(nomeDois.equals(nomeUm))
        {
            System.out.println("Suas Strings são iguais");
        }





        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("numero 1 é igual ao numero 2? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numero 1 é diferente do numero 2? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numero 1 é maior do numero 2? "+ simNao);


        //Usando if

        if(numero1 < numero2)
        {
            System.out.println("A nossa condição é verdadeira");
        }
    }
}
