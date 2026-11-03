public class Exercicio44 {
    public static void main(String[] args) {
        String[] vendedores = {"Ana", "Bruno", "Carla", "Diego"};
        double[] vendas = {12000.0, 8500.0, 15600.0, 9900.0};
        double meta = 10000.0;
        double totalEquipa = 0.0;
        double maiorVenda = 0.0;

        for (int i = 0; i < vendedores.length; i++) {
            totalEquipa += vendas[i];
            maiorVenda = Math.max(maiorVenda, vendas[i]);
            boolean bateuMeta = vendas[i] >= meta;
            System.out.println(vendedores[i] + " vendeu R$ " + vendas[i] + " | Atingiu a meta? " + bateuMeta);
        }

        System.out.println("Total vendido pela equipa: R$ " + totalEquipa);
        System.out.println("Maior venda registada: R$ " + maiorVenda);
    }
}