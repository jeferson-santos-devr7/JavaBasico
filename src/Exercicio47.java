public class Exercicio47 {
    public static void main(String[] args) {
        int fileiras = 5;
        int assentos = 4;
        int ocupados = 0;

        for (int f = 1; f <= fileiras; f++) {
            for (int a = 1; a <= assentos; a++) {
                boolean ehPar = (f + a) % 2 == 0;
                String estado = ehPar ? "OCUPADO" : "LIVRE";
                if (ehPar) {
                    ocupados++;
                }
                System.out.println("Fileira " + f + ", Assento " + a + " -> " + estado);
            }
        }
        System.out.println("Total de assentos ocupados: " + ocupados);
    }
}