package edu.caio.doublePeculiaridades;

public class DoublePeculiaridades {
    public static void main(String[] args) throws Exception {


        //Declarando variaveis
        int idade; //Tipo "int", nome "idade", com nenhum valor atribuído. 
        int anoFabricacao = 2021; //tipo "int", nome "anoFabricacao", com valor 2021.


        /*  deve-se  tomar cuidado como inicializamos valores fracionarios nesse caso da variavel
        salarioMinimo era pra ser um valor de 2500 porém por causa do ponto o valor fica 2.5 o certo
        deve ser 2500 isso é só padronização, mas é bom tomar cuidado.*/

        //Jeito errado
        double salarioMinimo = 2.500; //tipo "double", nome "salarioMinimo", valor 2.500.

        //jeito certo
        double salario = 2500;
    }
}
