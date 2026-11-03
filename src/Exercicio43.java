public class Exercicio43 {
    public static void main(String[] args) {
        String[] produtos = {"Caneta", "Caderno", "Mochila", "Borracha"};
        int[] estoques = {3, 12, 4, 15};
        int contadorReposicao = 0;

        for (int i = 0; i < produtos.length; i++) {
            String status;
            if (estoques[i] < 5) {
                status = "REPOR";
                contadorReposicao++;
            } else if (estoques[i] < 10) {
                status = "ATENÇÃO";
            } else {
                status = "OK";
            }
            System.out.println(produtos[i] + " (Stock: " + estoques[i] + ") -> " + status);
        }
        System.out.println("Total de produtos que precisam de reposição: " + contadorReposicao);
    }
}