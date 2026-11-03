public class Exercicio42 {
    public static void main(String[] args) {
        double salarioBase = 3500.0;
        int horasExtras = 8;
        double valorHoraExtra = 35.0;

        double salarioBruto = salarioBase + (horasExtras * valorHoraExtra);
        double percentualDesconto = salarioBruto >= 4000.0 ? 0.08 : 0.05;
        double desconto = salarioBruto * percentualDesconto;
        double salarioLiquido = salarioBruto - desconto;

        System.out.println("Salário Bruto: R$ " + salarioBruto);
        System.out.println("Desconto aplicado: R$ " + desconto);
        System.out.println("Salário Líquido: R$ " + salarioLiquido);
    }
}