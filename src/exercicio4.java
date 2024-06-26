import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a forma geométrica:");
        System.out.println("1. Retângulo");
        System.out.println("2. Losango");
        System.out.println("3. Trapézio");
        System.out.println("4. Paralelogramo");
        System.out.println("5. Triângulo");
        System.out.println("6. Círculo");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.print("Informe a base do retângulo: ");
                double baseRetangulo = scanner.nextDouble();
                System.out.print("Informe a altura do retângulo: ");
                double alturaRetangulo = scanner.nextDouble();
                double areaRetangulo = baseRetangulo * alturaRetangulo;
                System.out.println("Área do retângulo: " + areaRetangulo);
                break;
            case 2:
                System.out.print("Informe a diagonal maior do losango: ");
                double diagonalMaiorLosango = scanner.nextDouble();
                System.out.print("Informe a diagonal menor do losango: ");
                double diagonalMenorLosango = scanner.nextDouble();
                double areaLosango = (diagonalMaiorLosango * diagonalMenorLosango) / 2;
                System.out.println("Área do losango: " + areaLosango);
                break;
            case 3:
                System.out.print("Informe a base maior do trapézio: ");
                double baseMaiorTrapezio = scanner.nextDouble();
                System.out.print("Informe a base menor do trapézio: ");
                double baseMenorTrapezio = scanner.nextDouble();
                System.out.print("Informe a altura do trapézio: ");
                double alturaTrapezio = scanner.nextDouble();
                double areaTrapezio = ((baseMaiorTrapezio + baseMenorTrapezio) * alturaTrapezio) / 2;
                System.out.println("Área do trapézio: " + areaTrapezio);
                break;
            case 4:
                System.out.print("Informe a base do paralelogramo: ");
                double baseParalelogramo = scanner.nextDouble();
                System.out.print("Informe a altura do paralelogramo: ");
                double alturaParalelogramo = scanner.nextDouble();
                double areaParalelogramo = baseParalelogramo * alturaParalelogramo;
                System.out.println("Área do paralelogramo: " + areaParalelogramo);
                break;
            case 5:
                System.out.print("Informe a base do triângulo: ");
                double baseTriangulo = scanner.nextDouble();
                System.out.print("Informe a altura do triângulo: ");
                double alturaTriangulo = scanner.nextDouble();
                double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
                System.out.println("Área do triângulo: " + areaTriangulo);
                break;
            case 6:
                System.out.print("Informe o raio do círculo: ");
                double raioCirculo = scanner.nextDouble();
                double areaCirculo = Math.PI * raioCirculo * raioCirculo;
                System.out.println("Área do círculo: " + areaCirculo);
                break;
            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}