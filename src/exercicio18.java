import java.util.Scanner;

public class exercicio18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salarioFixo = 5000.0; // R$ 5.000,00

        System.out.print("Digite o número de carros vendidos: ");
        int numeroCarros = sc.nextInt();

        System.out.print("Digite o valor total das vendas: R$ ");
        double valorTotalVendas = sc.nextDouble();

        double comissaoFixaPorCarro = 500.0; // Comissão de R$ 500,00 por carro vendido

        double comissaoTotal = numeroCarros * comissaoFixaPorCarro;

        double bonusVendas = 0.05 * valorTotalVendas;

        double salarioFinal = salarioFixo + comissaoTotal + bonusVendas;

        System.out.println("\nDetalhes da venda:");
        System.out.println("------------------------------");
        System.out.println("Número de carros vendidos: " + numeroCarros);
        System.out.printf("Comissão por carro vendido: R$ %.2f\n", comissaoFixaPorCarro);
        System.out.printf("Bônus de vendas (5%%): R$ %.2f\n", bonusVendas);
        System.out.println("------------------------------");

        System.out.printf("Salário final do vendedor: R$ %.2f\n", salarioFinal);

        sc.close();
    }
}
