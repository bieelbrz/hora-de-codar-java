import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[4];

        System.out.println("Digite as notas das 4 avaliações:");
        for (int i = 0; i < 4; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double media = soma / 4;

        if (media >= 6.0) {
            System.out.println("\nMédia do semestre: " + media);
            System.out.println("PARABÉNS! Você foi aprovado!");
        } else {
            System.out.println("\nMédia do semestre: " + media);
            System.out.println("Infelizmente você não foi aprovado. Estude mais para as próximas avaliações.");
        }

        sc.close();
    }
}

