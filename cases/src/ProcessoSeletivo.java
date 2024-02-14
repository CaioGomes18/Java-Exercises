import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class ProcessoSeletivo {
    

    public static void main(String []args)
    {
        selecaoCandidatos();
    }

    static void imprimirSelecionados(String [] candidat)
    {
        for(int i = 0; i < candidat.length; i++)
        {
            if(candidat[i] == null)
            {
                continue;
            }
            System.out.println("O candidato de n° " + (i+1) + " é o candidato(a) " + candidat[i]);
        }
    }

    static void ligarParaCandidatos(String [] cand){
        for(String c : cand)
        {
            ligando(c);
        }
    }

    static void ligando(String candidatos)
    {
        int tentativasRealizadas = 1;
        boolean atendeu = false;
        boolean continuarTentando = true;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasRealizadas++;
            }
            else{
                System.out.println("contato realizado com sucesso.");
            }

        }while(continuarTentando && tentativasRealizadas < 3);

        if(atendeu){
            System.out.println("O candidato " + candidatos + " foi contactado em " + tentativasRealizadas + " tentativas.");
        }
        else{
            System.out.println("Não conseguimos contato com o candidato " + candidatos);
        }
    }
    static void selecaoCandidatos()
    {
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        double valorBase = 2000.0;
        int candidatoAtual = 0;
        int candidatosSelecionados = 0;
        String [] escolhidos = new String[5];
       

        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length)
        {
            
            String candidato = candidatos[candidatoAtual];
            double valorCandidato = valorPretendido();
            
            if(valorCandidato <= valorBase)
            {
                escolhidos[candidatosSelecionados]  = candidato;
                System.out.println("O(a) candidato : " + candidato + " foi selecionado.");
                candidatosSelecionados++;
                
            }
            candidatoAtual++;
           
        }
        imprimirSelecionados(escolhidos);
        ligarParaCandidatos(escolhidos);

    }

    static double valorPretendido() 
    {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

	static boolean atender() {
		return new Random().nextInt(3)==1;	
	}
}
