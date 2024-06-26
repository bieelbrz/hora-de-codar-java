import java.util.Scanner;
public class exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double valor1 = sc.nextDouble();

        System.out.print("Digite o segundo valor (não pode ser zero ou negativo): ");
        double valor2 = sc.nextDouble();

        while (valor2 <= 0) {
            System.out.println("Valor inválido. O segundo valor não pode ser zero ou negativo.");
            System.out.print("Digite um novo valor para o segundo número: ");
            valor2 = sc.nextDouble();
        }

        double resultado = valor1 / valor2;

        System.out.println("Resultado da divisão de " + valor1 + " por " + valor2 + " é: " + resultado);

        sc.close();
    }
}

