public class MinhaClasse {
   public static void main(String[] args) {
      String primeiroNome = "Rafael";
      String SegundoNome = "Simião";

      String nomeCompleto = nomeCompleto(primeiroNome, SegundoNome);

      System.out.println(nomeCompleto);
   }

   public static String nomeCompleto(String primeiroNome, String SegundoNome) {
      return "Resultado do metodo: " + primeiroNome.concat(" ").concat(SegundoNome);
   }
}
