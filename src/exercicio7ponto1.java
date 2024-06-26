import java.util.Scanner;

public class exercicio7ponto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] valores = new int[5];

        System.out.println("Digite 5 valores diferentes:");
        for (int i = 0; i < 5; i++) {
            valores[i] = sc.nextInt();
        }

        int maior1 = Integer.MIN_VALUE;
        int maior2 = Integer.MIN_VALUE;

        for (int valor : valores) {
            if (valor > maior1) {
                maior2 = maior1;
                maior1 = valor;
            } else if (valor > maior2) {
                maior2 = valor;
            }
        }

        int somaDosMaiores = maior1 + maior2;

        System.out.println("A soma dos dois maiores valores é: " + somaDosMaiores);

        sc.close();
    }
}

