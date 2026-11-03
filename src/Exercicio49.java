public class Exercicio49 {
    public static void main(String[] args) {
        String[] nomes = {"Ana", "Bruno", "Carla", "Diego"};
        double[] notas = {6.5, 8.0, 4.5, 9.2};
        double somaNotas = 0.0;
        int aprovados = 0;
        double maiorNota = 0.0;

        for (int i = 0; i < nomes.length; i++) {
            somaNotas += notas[i];
            maiorNota = Math.max(maiorNota, notas[i]);
            String situacao = notas[i] >= 7.0 ? "Aprovado" : "Reprovado";
            if (notas[i] >= 7.0) {
                aprovados++;
            }
            System.out.println(nomes[i] + " - Nota: " + notas[i] + " -> " + situacao);
        }

        double mediaTurma = somaNotas / nomes.length;
        System.out.println("Média da turma: " + mediaTurma);
        System.out.println("Total de aprovados: " + aprovados);
        System.out.println("Maior nota da turma: " + maiorNota);
    }
}