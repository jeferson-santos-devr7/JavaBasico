public class Exercicio45 {
    public static void main(String[] args) {
        double totalCompra = 250.0;
        boolean assinante = false;
        double distanciaKm = 15.0;
        double frete;

        if (totalCompra >= 300.0 || assinante) {
            frete = 0.0;
        } else {
            frete = 15.0 + (0.80 * distanciaKm);
        }

        System.out.println("Valor do frete: R$ " + frete);
    }
}