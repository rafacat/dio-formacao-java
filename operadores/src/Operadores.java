public class Operadores {
    public static void main(String[] args) {

        // Atribuição - Utilizado para atribuir um valor a variavel.

        String nome = "Rafael";
        int idade = 22;
        double peso = 87.4;
        char sexo = 'M';
        boolean doardorOrgao = false;
        // Date dataNascimento = new Date(); --- Comentado para ter erro por não estar
        // declarado

        // Aritméticos - Utilizado para realizar operações matemáticas.

        double soma = 15.7 + 47.1;

        /*
         * Se por acaso o sinal de "+" for utilizado com uma string o sistema fará
         * uma concatenacao.
         */

        int subtracao = 10 - 87;
        int multiplicacao = 13 * 2;
        int divisao = 47 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) - (20 / 3);

        // Operadores unários

        // Negando um numero - "variavel"
        System.out.println(resultado);
        System.out.println(-resultado);

        // Positivando um numero * - "variavel"
        System.out.println(subtracao);
        System.out.println(subtracao * -1);

        // Incrimentando um numero ++
        System.out.println(multiplicacao++);

        // Decrementando um numero --
        System.out.println(multiplicacao--);
    }

}
