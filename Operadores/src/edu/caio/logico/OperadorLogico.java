package edu.caio.logico;

public class OperadorLogico {
    
    public static void main(String [] args){

        boolean condicao1=true;

        boolean condicao2=false;

        //todos 2 necessitam ser verdadeiros para que seja verdadeiro.
        if(condicao1 && condicao2){
            System.out.println("As duas opções são verdadeiras");
        }


        //Só um precisa ser verdadeiro para a condição ser verddeira.
        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");
        }
    }

}
