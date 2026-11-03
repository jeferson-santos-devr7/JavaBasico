public class Exercicio48 {
    public static void main(String[] args) {
        int meta = 250;
        int produzido = 0;
        int porCiclo = 37;
        int ciclos = 0;

        while (produzido < meta) {
            produzido += porCiclo;
            ciclos++;
            if (produzido > meta) {
                produzido = meta;
            }
            System.out.println("Ciclo " + ciclos + " -> Produzido até agora: " + produzido);
        }

        System.out.println("Meta atingida em " + ciclos + " ciclos.");
    }
}