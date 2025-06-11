
import java.util.Locale;
import java.util.Scanner;

public class AumentoSalarial {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salario da pessoa: ");
        double salario = sc.nextDouble();

        double porcentagem;

        if (salario <= 1000.00) {
            porcentagem = 20.0;
        } else if (salario <= 3000.00) {
            porcentagem = 15.0;
        } else if (salario <= 8000.00) {
            porcentagem = 10.0;
        } else {
            porcentagem = 5.0;
        }

        double aumento = salario * (porcentagem / 100.0);
        double novoSalario = salario + aumento;

        System.out.printf("Novo salario R$ %.2f%n", novoSalario);
        System.out.printf("Aumento R$ %.2f%n", aumento);
        System.out.printf("Porcentagem = %.0f%%%n", porcentagem);

        sc.close();
    }
}
