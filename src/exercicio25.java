import java.util.Scanner;

public class exercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Object[] array = new Object[12];

        for (int i = 0; i < 12; i++) {
            System.out.print("Digite o " + (i + 1) + "º número ou caractere: ");
            if (sc.hasNextInt()) {
                array[i] = sc.nextInt();
            } else {
                array[i] = sc.next();
            }
        }

        inverterArray(array);
        System.out.print("Saída 1: ");
        imprimirArray(array);

        separarPorTipoEInverter(array);
        System.out.print("Saída 2: ");
        imprimirArray(array);

        sc.close();
    }
    public static void inverterArray(Object[] array) {
        int inicio = 0;
        int fim = array.length - 1;
        while (inicio < fim) {
            Object temp = array[inicio];
            array[inicio] = array[fim];
            array[fim] = temp;
            inicio++;
            fim--;
        }
    }
    public static void separarPorTipoEInverter(Object[] array) {
        int inicio = 0;
        int fim = array.length - 1;

        while (inicio < fim) {
            while (inicio < fim && !(array[inicio] instanceof Integer)) {
                inicio++;
            }
            while (inicio < fim && !(array[fim] instanceof String)) {
                fim--;
            }
            Object temp = array[inicio];
            array[inicio] = array[fim];
            array[fim] = temp;
            inicio++;
            fim--;
        }
    }

    public static void imprimirArray(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}

