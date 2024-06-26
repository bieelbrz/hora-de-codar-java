//Escreva um programa em Java em que o usuário informe o seu nome e exiba a mensagem "Olá, [NomeDoUsuario]".



import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");

        String nomeUsuario = scanner.nextLine();
        scanner.close();

        System.out.println("Olá, " + nomeUsuario + "!");
    }
}