import java.util.Scanner;

public class exercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Informe o segundo valor: ");
        double valor2 = scanner.nextDouble();

        System.out.print("Informe o terceiro valor: ");
        double valor3 = scanner.nextDouble();

        scanner.close();

        if (valor1 > valor2 && valor1 > valor3) {
            System.out.println("O maior valor é: " + valor1);
        } else if (valor2 > valor1 && valor2 > valor3) {
            System.out.println("O maior valor é: " + valor2);
        } else {
            System.out.println("O maior valor é: " + valor3);
        }
    }
}
