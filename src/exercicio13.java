import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = sc.nextInt();
        System.out.print("Digite o segundo número inteiro (maior que o primeiro): ");
        int numero2 = sc.nextInt();

        double media = (numero1 + numero2) / 2.0;
        System.out.println("A média aritmética dos números é: " + media);

        System.out.println("Números inteiros entre " + numero1 + " e " + numero2 + ":");
        for (int i = numero1; i <= numero2; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        sc.close();
    }
}

