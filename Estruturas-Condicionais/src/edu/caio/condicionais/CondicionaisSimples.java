package edu.caio.condicionais;

public class CondicionaisSimples {
    public static void main(String[] args) {
        double saldo = 25;
        double valorSolicitado = 17;

        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
        }
        System.out.println("o seu novo saldo é : " + saldo);
    }
}
