public class Exercicio40 {
    public static void main(String[] args) {
        String email = "aluno@faculdade.edu.br";

        boolean contemArroba = email.contains("@");
        boolean terminaComBr = email.endsWith(".br");

        if (contemArroba && terminaComBr) {
            System.out.println("Formato básico válido");
        } else {
            System.out.println("Formato inválido");
        }
    }
}