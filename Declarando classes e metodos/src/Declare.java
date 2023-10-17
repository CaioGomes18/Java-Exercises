public class Declare {
    public static void main(String [] args)  
    {
       String primeiroNome = "nelson";
       String segundoNome = "paretto";

       String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

       System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome)
    {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
