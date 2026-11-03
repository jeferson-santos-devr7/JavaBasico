public class Exercicio46 {
    public static void main(String[] args) {
        // Cenário 1: Utilizador comum ativo
        boolean ativo = true;
        boolean senhaValida = true;
        boolean bloqueado = false;
        boolean administrador = false;

        boolean acessoComum = ativo && senhaValida && !bloqueado;
        boolean acessoPermitido1 = acessoComum || (administrador && !bloqueado);

        System.out.println("Cenário 1 (Comum ativo): Acesso permitido? " + acessoPermitido1);

        // Cenário 2: Administrador com utilizador inativo mas não bloqueado
        boolean ativo2 = false;
        boolean senhaValida2 = true;
        boolean bloqueado2 = false;
        boolean administrador2 = true;

        boolean acessoComum2 = ativo2 && senhaValida2 && !bloqueado2;
        boolean acessoPermitido2 = acessoComum2 || (administrador2 && !bloqueado2);

        System.out.println("Cenário 2 (Admin não comum): Acesso permitido? " + acessoPermitido2);
    }
}