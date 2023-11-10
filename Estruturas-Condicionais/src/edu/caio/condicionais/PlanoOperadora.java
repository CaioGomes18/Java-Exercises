package edu.caio.condicionais;

public class PlanoOperadora {
    
    public static void main(String[] args) {
        String plano = "M";

        if(plano == "B"){
            System.out.println("100 minutos de ligação");
        }
        else if(plano == "M"){
            System.out.println("100 minutos de ligação");
			System.out.println("WhatsApp e Instagram grátis");
        }
        else if(plano == "T"){
            System.out.println("100 minutos de ligação");
			System.out.println("WhatsApp e Instagram grátis");	
			System.out.println("5Gb Youtube");
        }

        System.out.println();
        
        //Agora com o exemplo do switch case em que dependendo do plano ele já diz o que a pessoa tem direito
        //com base com a funcionalidade do switch onde quando ele encontra a condição verdadeira ele executa 
        //o bloco verdadeiro e todos que estão abaixo dele 
        //plano = "T";

        switch(plano){
            case "T":{
                System.out.println("5Gb Youtube");
            }
            case "M":{
                System.out.println("WhatsApp e Instagram grátis");
            }
            case "B":{
                System.out.println("100 minutos de ligação");
            }
        }
    }
}
