public class Exercicio34 {
    public static void main(String[] args) {
        String status = "PAGO";

        String mensagem = switch (status) {
            case "NOVO" -> "Aguardando pagamento";
            case "PAGO" -> "Enviar para separação";
            case "ENVIADO" -> "Acompanhar entrega";
            case "CANCELADO" -> "Encerrar pedido";
            default -> "Status desconhecido";
        };

        System.out.println(mensagem);
    }
}