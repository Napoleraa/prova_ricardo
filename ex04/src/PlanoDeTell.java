import java.util.Locale;
import java.util.Scanner;

public class PlanoDeTell {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de minutos: ");
        int minutos = sc.nextInt();

        double valorBasico = 50.0;
        double valorFinal = valorBasico;

        if (minutos > 100) {
            int excedente = minutos - 100;
            valorFinal = valorFinal + excedente * 2.0;
        }

        System.out.printf("Valor a pagar: R$ %.2f%n", valorFinal);

        sc.close();
    }
}