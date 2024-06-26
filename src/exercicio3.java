import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nomeUsuario = scanner.nextLine();

        System.out.print("Agora, informe sua idade: ");
        int idadeUsuario = scanner.nextInt();

        scanner.close();

        System.out.println("Olá, " + nomeUsuario + ", sua idade é " + idadeUsuario + ".");
    }
}

