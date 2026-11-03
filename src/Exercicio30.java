public class Exercicio30 {
    public static void main(String[] args) {
        char prioridade = 'A';

        switch (prioridade) {
            case 'A':
                System.out.println("Alta");
                break;
            case 'M':
                System.out.println("Média");
                break;
            case 'B':
                System.out.println("Baixa");
                break;
            default:
                System.out.println("Prioridade desconhecida");
                break;
        }
    }
}