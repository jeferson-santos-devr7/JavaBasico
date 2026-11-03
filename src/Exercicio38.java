public class Exercicio38 {
    public static void main(String[] args) {
        int fileiras = 4;
        int assentosPorFileira = 6;

        for (int f = 1; f <= fileiras; f++) {
            for (int a = 1; a <= assentosPorFileira; a++) {
                System.out.print("F" + f + "A" + a + " ");
            }
            System.out.println();
        }
    }
}