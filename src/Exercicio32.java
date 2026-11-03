public class Exercicio32 {
    public static void main(String[] args) {
        boolean pagamentoAprovado = true;
        int estoque = 10;
        int quantidade = 2;
        boolean enderecoValido = true;

        boolean podeEnviar = pagamentoAprovado && (estoque >= quantidade) && enderecoValido;

        System.out.println("Pedido pode ser enviado? " + podeEnviar);
    }
}