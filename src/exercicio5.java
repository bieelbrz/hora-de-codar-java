import java.util.Scanner;

public class exercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        double valor = scanner.nextDouble();

        scanner.close();


        if (valor > 0) {
            System.out.println("O valor informado é positivo.");
        } else if (valor < 0) {
            System.out.println("O valor informado é negativo.");
        } else {
            System.out.println("O valor informado é neutro (zero).");
        }
    }
}
