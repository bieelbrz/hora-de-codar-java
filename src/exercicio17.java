import java.util.Scanner;

public class exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o custo de fábrica do carro: ");
        double custoFabrica = sc.nextDouble();

        double percentualDistribuidor = 0.28;
        double valorDistribuidor = percentualDistribuidor * custoFabrica;

        double percentualImpostos = 0.45;
        double valorImpostos = percentualImpostos * custoFabrica;

        double custoFinalConsumidor = custoFabrica + valorDistribuidor + valorImpostos;

        System.out.printf("O custo final ao consumidor é: R$ %.2f\n", custoFinalConsumidor);

        sc.close();
    }
}
