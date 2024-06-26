import java.util.Scanner;

public class exercicio7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Informe o segundo valor: ");
        double valor2 = scanner.nextDouble();

        System.out.print("Informe o terceiro valor: ");
        double valor3 = scanner.nextDouble();

        scanner.close();

        double maior, segundoMaior;

        maior = valor1;
        segundoMaior = valor2;

        if (valor2 > maior) {
            maior = valor2;
            segundoMaior = valor1;
        }


        if (valor3 > maior) {
            segundoMaior = maior;
            maior = valor3;
        } else if (valor3 > segundoMaior) {
            segundoMaior = valor3;
        }

        double somaDosMaiores = maior + segundoMaior;

        System.out.println("A soma dos dois maiores valores é: " + somaDosMaiores);
    }
}

