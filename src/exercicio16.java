import java.util.Scanner;

public class exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número total de eleitores do município: ");
        int totalEleitores = sc.nextInt();

        System.out.print("Digite o percentual de votos brancos: ");
        double percentualBrancos = sc.nextDouble();
        System.out.print("Digite o percentual de votos válidos: ");
        double percentualValidos = sc.nextDouble();
        System.out.print("Digite o percentual de votos nulos: ");
        double percentualNulos = sc.nextDouble();

        int votosBrancos = (int) Math.round((percentualBrancos / 100) * totalEleitores);
        int votosValidos = (int) Math.round((percentualValidos / 100) * totalEleitores);
        int votosNulos = (int) Math.round((percentualNulos / 100) * totalEleitores);

        System.out.println("\nResultados da Eleição:");
        System.out.println("------------------------------");
        System.out.println("Número total de eleitores: " + totalEleitores);
        System.out.println("------------------------------");
        System.out.println("Votos Brancos: " + votosBrancos + " votos");
        System.out.println("Votos Válidos: " + votosValidos + " votos");
        System.out.println("Votos Nulos: " + votosNulos + " votos");
        System.out.println("------------------------------");
        System.out.println("Percentual de votos Brancos: " + percentualBrancos + "%");
        System.out.println("Percentual de votos Válidos: " + percentualValidos + "%");
        System.out.println("Percentual de votos Nulos: " + percentualNulos + "%");
        System.out.println("------------------------------");

        sc.close();
    }
}
