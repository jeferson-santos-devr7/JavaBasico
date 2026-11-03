public class Exercicio08 {
    public static void main(String[] args) {
        int valorInteiro = 25;
        double valorDecimal = valorInteiro; // Widening casting automático

        System.out.println("Valor inteiro: " + valorInteiro);
        System.out.println("Valor convertido para double: " + valorDecimal);
    }
}