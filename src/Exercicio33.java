public class Exercicio33 {
    public static void main(String[] args) {
        int impacto = 8;

        if (impacto >= 9) {
            System.out.println("Prioridade crítica");
        } else if (impacto >= 7) {
            System.out.println("Prioridade alta");
        } else if (impacto >= 4) {
            System.out.println("Prioridade média");
        } else {
            System.out.println("Prioridade baixa");
        }
    }
}