import java.util.Scanner;

public class exercicio20{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nomeProduto = sc.nextLine();
        System.out.print("Digite a quantidade adquirida do produto: ");
        int quantidade = sc.nextInt();
        System.out.print("Digite o preço unitário do produto: R$ ");
        double precoUnitario = sc.nextDouble();

        double valorVenda = quantidade * precoUnitario;

        double percentualDesconto = 0.0;
        if (quantidade <= 5) {
            percentualDesconto = 2.0;
        } else if (quantidade > 5 && quantidade <= 10) {
            percentualDesconto = 3.0;
        } else {
            percentualDesconto = 5.0;
        }

        double valorDesconto = (percentualDesconto / 100.0) * valorVenda;

        double imposto = 0.2 * valorVenda;

        double totalPagar = valorVenda - valorDesconto + imposto;

        System.out.println("\n===== Recibo =====");
        System.out.println("Produto: " + nomeProduto);
        System.out.println("Quantidade: " + quantidade);
        System.out.printf("Preço unitário: R$ %.2f\n", precoUnitario);
        System.out.printf("Valor da venda: R$ %.2f\n", valorVenda);
        System.out.printf("Desconto (%.2f%%): R$ %.2f\n", percentualDesconto, valorDesconto);
        System.out.printf("Imposto (20%%): R$ %.2f\n", imposto);
        System.out.printf("Total a pagar: R$ %.2f\n", totalPagar);

        sc.close();
    }
}