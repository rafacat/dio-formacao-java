public class Metodos {

    public double somar(int num1, int num2) {
        // LOGICA - finalidade do metodo
        return num1 + num2;
    }

    public void imprimir(String texto) {
        // LOGICA - finalidade do metodo
        // AQUI NÃO PRECISA DE RETURN
        // POIS NÃO SERÁ RETORNADO NENHUM RESULTADO
    }

    public double dividir(int dividendo, int divisor) throws Exception {
        return dividendo / divisor;
        // throws Exception - Indica que o metodo a ser utilizado pode
        // gerar uma exceção.
    }

    private void metodoPrivado() {
        // Este metodo não pode ser visto por outras classes
    }

    public static void main(String[] args) {

    }
}
