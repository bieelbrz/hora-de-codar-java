public class exercicio23 {
    public static void main(String[] args) {
        int limite = 20;

        for (int i = 1; i <= limite; i++) {
            System.out.print("(" + i + ", ");
            for (int j = 1; j <= 10; j++) {
                System.out.print(j);
                if (j < 10) {
                    System.out.print(" ");
                }
            }

            System.out.println(")");
        }
    }
}