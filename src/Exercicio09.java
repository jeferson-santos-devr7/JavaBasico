public class Exercicio09 {
    public static void main(String[] args) {
        double original = 9.8;
        int convertido = (int) original; // Narrowing casting explícito

        System.out.println("Double original: " + original);
        System.out.println("Int convertido: " + convertido);
        // O casting explícito de double para int descarta inteiramente a parte decimal (não arredonda).
    }
}