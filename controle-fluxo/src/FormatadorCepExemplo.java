public class FormatadorCepExemplo {
   public static void main(String[] args) {

      try {
         String cepFormatado = formatarCep("4897812");
         System.out.println(cepFormatado);

      } catch (CepInvalidoException e) {
         System.out.println("O CEP não cumpre com as regras de negocio.");
      }

   }
   static String formatarCep (String cep) throws CepInvalidoException{
      if(cep.length() != 8)
         throw new CepInvalidoException();

         return "13.492-492";
   }
}
