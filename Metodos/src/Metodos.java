public class Metodos {
    

    boolean ligada = false;
    int canal = 1;
    int volume = 25;


    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Canal atual : " + canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("Canal atual : " + canal);
    }

    public void aumentaCanal(){
        canal++;
        System.out.println("Canal Atual : " + canal);
    }

    public void aumentaVolume(){
        volume++;
        System.out.println("Volume atual : " + volume);
    }

    public void diminuiVolume(){
        volume--;
        System.out.println("Volume atual : " + volume);
    }

    public void ligarTv(){
        ligada = true;
        System.out.println("tv ligada ? " + ligada);
    }

    public void desligarTv(){
        ligada = false;
        System.out.println("Tv ligada ? " + ligada);
    }
}
