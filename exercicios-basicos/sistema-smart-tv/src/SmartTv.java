public class SmartTv {
   boolean ligada = false;
   int canal = 1;
   int volume = 25;

   public void aumentarVolume() {
      volume++;
      System.out.println("Aumentando volume para: " + volume);
   }

   public void diminuirVolume() {
      volume--;
      System.out.println("Dimnuindo volume para: " + volume);
   }

   public void ligar() {
      ligada = true;
   }

   public void desligar() {
      ligada = false;
   }

   public void aumentarCanal() {
      canal++;
      System.out.println("Mudando para o canal: " + canal);
   }

   public void diminuirCanal() {
      canal--;
      System.out.println("Mudando para o canal: " + canal);
   }

   public void mudarCanal(int novoCanal) {
      canal = novoCanal;
      System.out.println("Mudando para o canal: " + canal);
   }
}
