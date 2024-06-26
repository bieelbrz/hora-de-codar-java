import java.util.Scanner;

public class exercicio6ponto1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando que o usuário informe os quatro valores
        System.out.print("Informe o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Informe o segundo valor: ");
        double valor2 = scanner.nextDouble();

        System.out.print("Informe o terceiro valor: ");
        double valor3 = scanner.nextDouble();

        System.out.print("Informe o quarto valor: ");
        double valor4 = scanner.nextDouble();

        // Fechando o Scanner após a leitura
        scanner.close();

        // Encontrando o maior valor entre os quatro
        double maiorValor = valor1; // Assume que valor1 é o maior inicialmente

        if (valor2 > maiorValor) {
            maiorValor = valor2;
        }

        if (valor3 > maiorValor) {
            maiorValor = valor3;
        }

        if (valor4 > maiorValor) {
            maiorValor = valor4;
        }

        // Exibindo o maior valor encontrado
        System.out.println("O maior valor é: " + maiorValor);
    }
}

