import java.util.Scanner;

public class exercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os valores dos lados A, B e C do triângulo:");
        System.out.print("Lado A: ");
        double ladoA = sc.nextDouble();
        System.out.print("Lado B: ");
        double ladoB = sc.nextDouble();
        System.out.print("Lado C: ");
        double ladoC = sc.nextDouble();

        boolean formaTriangulo = false;

        if (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB) {
            formaTriangulo = true;
        }

        if (formaTriangulo) {
            System.out.println("Os valores informados formam um triângulo.");
        } else {
            System.out.println("Os valores informados NÃO formam um triângulo.");
        }

        sc.close();
    }
}