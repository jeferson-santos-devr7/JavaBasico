public class Exercicio41 {
    public static void main(String[] args) {
        String[] produtos = {"Teclado", "Rato", "Monitor"};
        int[] quantidades = {2, 1, 1};
        double[] precos = {150.0, 80.0, 899.90};
        double totalCarrinho = 0.0;

        for (int i = 0; i < produtos.length; i++) {
            double subtotal = quantidades[i] * precos[i];
            totalCarrinho += subtotal;
            System.out.println(produtos[i] + " - Qtd: " + quantidades[i] + " - Subtotal: R$ " + subtotal);
        }

        if (totalCarrinho >= 500.0) {
            double desconto = totalCarrinho * 0.10;
            totalCarrinho -= desconto;
            System.out.println("Desconto de 10% aplicado: R$ " + desconto);
        }

        System.out.println("Total final do carrinho: R$ " + totalCarrinho);
    }
}