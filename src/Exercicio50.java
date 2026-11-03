public class Exercicio50 {
    public static void main(String[] args) {
        String produto = "Teclado Mecânico";
        int quantidade = 3;
        double precoUnitario = 150.0;
        boolean pagamentoAprovado = true;
        int stockDisponivel = 10;
        boolean stockSuficiente = stockDisponivel >= quantidade;

        double totalBruto = quantidade * precoUnitario;
        double desconto = totalBruto >= 400.0 ? totalBruto * 0.10 : 0.0;
        double totalFinal = totalBruto - desconto;

        String statusPedido;
        if (!pagamentoAprovado) {
            statusPedido = "NOVO";
        } else if (!stockSuficiente) {
            statusPedido = "CANCELADO";
        } else {
            statusPedido = "PAGO";
        }

        String acao = switch (statusPedido) {
            case "NOVO" -> "Aguardando confirmação de pagamento";
            case "PAGO" -> "Enviar pedido para o setor de separação";
            case "ENVIADO" -> "Acompanhar código de rastreio da transportadora";
            case "CANCELADO" -> "Encerrar pedido por falta de stock ou pagamento";
            default -> "Estado desconhecido";
        };

        System.out.println("Produto: " + produto);
        System.out.println("Total Bruto: R$ " + totalBruto);
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Total Final: R$ " + totalFinal);
        System.out.println("Status do Pedido: " + statusPedido);
        System.out.println("Ação recomendada: " + acao);
    }
}