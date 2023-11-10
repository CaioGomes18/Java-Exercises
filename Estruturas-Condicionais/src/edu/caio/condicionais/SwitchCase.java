package edu.caio.condicionais;
//sistema de medida
public class SwitchCase{

    public static void main(String[] args) {
        

        String sigla = "M";

        if(sigla == "P"){
            System.out.println("PEQUENO");
        }
        else if(sigla == "M"){
            System.out.println("MEDIO");
        }
        else if(sigla == "G"){
            System.out.println("Grande");
        }
        else{
            System.out.println("INDEFINIDO");
        }

        //agora no Switch case
        sigla = "A";

        switch (sigla){
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
            case "M":{
                System.out.println("MEDIO");
                break;
            }
            case "G":{
                System.out.println("Grande");
            }
            default:{
                System.out.println("INDEFINIDO");
            }

        }
    }
}