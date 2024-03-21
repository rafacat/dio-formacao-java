public class TiposVariaveis {
    public static void main(String[] args) {

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        /*
         * Para atribuir um variavel que possue um armazenamento maior que a outra
         * Nós utilizamos o "cast" mas, é necessario tomar muito cuidado para
         * utiliza-lo pois, é uma ferramenta perigosa.
         *
         * Cast - Utilizado para atribuir um armazenamento de dado superior em um
         * inferior.
         */

         final double VALOR_DE_PI = 3.14;
         System.out.println(VALOR_DE_PI);

         /*
          * Para transformar uma variavel em uma constante na linguagem Java
          * nós utilizamos a palavra reservada "final". Dessa forma ficamos
          * restrito de fazer qualquer mudança na variavel.
          */
    }
}
