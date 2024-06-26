import java.util.Scanner;
import java.time.Year;

public class exercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número do empregado (código): ");
        int codigoEmpregado = sc.nextInt();
        System.out.print("Digite o ano de nascimento do empregado: ");
        int anoNascimento = sc.nextInt();
        System.out.print("Digite o ano de ingresso na empresa do empregado: ");
        int anoIngresso = sc.nextInt();

        int anoAtual = Year.now().getValue();
        int idade = anoAtual - anoNascimento;

        int tempoTrabalho = anoAtual - anoIngresso;

        boolean requerAposentadoria = false;

        if (idade >= 65 || tempoTrabalho >= 30 || (idade >= 60 && tempoTrabalho >= 25)) {
            requerAposentadoria = true;
        }

        System.out.println("\n===== Resultado da Verificação de Aposentadoria =====");
        System.out.println("Número do empregado: " + codigoEmpregado);
        System.out.println("Idade do empregado: " + idade + " anos");
        System.out.println("Tempo de trabalho na empresa: " + tempoTrabalho + " anos");

        if (requerAposentadoria) {
            System.out.println("Requerer aposentadoria");
        } else {
            System.out.println("Não requerer aposentadoria");
        }

        sc.close();
    }
}