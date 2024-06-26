public class exercicio15 {
    public static void main(String[] args) {
        double alturaAnacleto = 1.50;
        double alturaFelisberto = 1.10;

        int crescimentoAnacleto = 2; // 2 centímetros por ano
        int crescimentoFelisberto = 3; // 3 centímetros por ano

        int anos = 0;

        while (alturaFelisberto <= alturaAnacleto) {
            alturaAnacleto += crescimentoAnacleto / 100.0; // Convertendo para metros
            alturaFelisberto += crescimentoFelisberto / 100.0; // Convertendo para metros
            anos++;
        }

        System.out.println("Serão necessários " + anos + " anos para Felisberto ser maior que Anacleto.");
    }
}
