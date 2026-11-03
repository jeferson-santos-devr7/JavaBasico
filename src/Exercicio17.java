public class Exercicio17 {
    public static void main(String[] args) {
        double subtotal = 500.00;
        double desconto = subtotal * 0.15;
        double total = subtotal - desconto;

        System.out.println("Subtotal: R$ " + subtotal);
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Total: R$ " + total);
    }
}