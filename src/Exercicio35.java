public class Exercicio35 {
    public static void main(String[] args) {
        int pedidosPendentes = 8;
        int pedidoAtual = 1;

        while (pedidosPendentes > 0) {
            System.out.println("Processando pedido número " + pedidoAtual);
            pedidosPendentes--;
            pedidoAtual++;
        }
        System.out.println("Fila concluída.");
    }
}