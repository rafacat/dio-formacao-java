public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarCanal();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Volume atual: " + smartTv.volume);

        System.out.println("A TV esta ligada ??? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> TV ligada ? " + smartTv.ligada);

        smartTv.mudarCanal(11);

        smartTv.desligar();
        System.out.println("Novo status -> TV ligada ? " + smartTv.ligada);

    }
}
