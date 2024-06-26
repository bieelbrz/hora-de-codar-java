import java.util.Scanner;

public class exercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        int horasTrabalhadas = sc.nextInt();
        System.out.print("Digite o valor do salário por hora: R$ ");
        double salarioHora = sc.nextDouble();

        int cargaHorariaPadrao = 160;

        int horasExtras = 0;
        if (horasTrabalhadas > cargaHorariaPadrao) {
            horasExtras = horasTrabalhadas - cargaHorariaPadrao;
        }

        double salarioBase = horasTrabalhadas * salarioHora;

        double valorHoraExtra = salarioHora * 1.5; // 50% a mais que o valor da hora regular
        double salarioHoraExtra = horasExtras * valorHoraExtra;

        double salarioTotal = salarioBase + salarioHoraExtra;

        System.out.println("\n===== Salário Total do Funcionário =====");
        System.out.printf("Salário Base: R$ %.2f\n", salarioBase);
        if (horasExtras > 0) {
            System.out.printf("Horas Extras (%d horas): R$ %.2f\n", horasExtras, salarioHoraExtra);
        }
        System.out.printf("Salário Total: R$ %.2f\n", salarioTotal);

        sc.close();
    }
}
