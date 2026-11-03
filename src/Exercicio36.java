public class Exercicio36 {
    public static void main(String[] args) {
        int tentativa = 1;
        int maximo = 4;
        boolean sucesso;

        do {
            sucesso = (tentativa == 3);
            System.out.println("Tentativa " + tentativa + " - Sucesso: " + sucesso);
            tentativa++;
        } while (!sucesso && tentativa <= maximo);

        System.out.println("Processo encerrado.");
    }
}