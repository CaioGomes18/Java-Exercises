package edu.caio.tipagemJava;

public class Casting {

    public static void main(String[]args){
        /*short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = numeroNormal;*/

        //Nesse caso não é possível passar número 
        //numeroCurto para a variavel numeroCurto2, pois são de tipos diferentes.



        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        //Para resolver isso vamos usar um recurso chamado casting, o que ele faz é,
        //ele pega um tipo mais abrangente e transforma a variável em um tipo mais específico.



    }
}
