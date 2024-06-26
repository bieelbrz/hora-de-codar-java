import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] valores = new int[10];


        System.out.println("Digite 10 valores:");
        for (int i = 0; i < 10; i++) {
            valores[i] = sc.nextInt();
        }

        int soma = 0;
        for (int valor : valores) {
            soma += valor;
        }
        double media = (double) soma / 10;


        System.out.println("\nNúmeros informados:");
        for (int valor : valores) {
            System.out.print(valor + " ");
        }

        System.out.println("\n\nMédia aritmética dos valores: " + media);

        sc.close();
    }
}

