//import java.util.Scanner;

public class SmartTv 
{
    public static void main(String[] args)
    {
        Metodos smartTv = new Metodos();

        System.out.println("\tVolume atual : "+ smartTv.volume);
        System.out.println("\tCanal atual : " + smartTv.canal);
        System.out.println("\tTv ligada ?  : " + smartTv.ligada);


        smartTv.ligarTv();
        smartTv.desligarTv();

        smartTv.aumentaVolume();
        smartTv.diminuiVolume();


        smartTv.mudarCanal(13);
        smartTv.aumentaCanal();
        smartTv.diminuirCanal();
    }
}
