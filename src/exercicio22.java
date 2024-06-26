public class exercicio22 {
    public static void main(String[] args) {
        int limite = 20;

        for (int i = 1; i <= limite; i++) {
            System.out.print("(" + i + ", ");

            for (int j = 0; j < 10; j++) {
                int numero = i + j;
                System.out.print(numero);
                if (j < 9) {
                    System.out.print(", ");
                }
            }

            System.out.println(")");
        }
    }
}
