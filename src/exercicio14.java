import java.util.Scanner;

public class exercicio14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alunosAprovados = 0;

        do {
            // Leitura das 6 notas do aluno
            System.out.println("Digite as 6 notas do aluno:");
            double somaNotas = 0;
            for (int i = 1; i <= 6; i++) {
                System.out.print("Nota " + i + ": ");
                double nota = sc.nextDouble();
                somaNotas += nota;
            }

            double mediaFinal = somaNotas / 6;

            if (mediaFinal >= 6.5) {
                alunosAprovados++;
            }

            System.out.println("Média final do aluno: " + mediaFinal);

            System.out.print("Calcular a média de outro aluno (S/N)? ");
            String resposta = sc.next();

            if (!resposta.equalsIgnoreCase("S")) {
                break;
            }

        } while (true);

        System.out.println("Quantidade de alunos aprovados: " + alunosAprovados);

        sc.close();
    }
}
