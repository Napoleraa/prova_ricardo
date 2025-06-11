
import java.util.Locale;
import java.util.Scanner;

public class ConversorDeTemperatura {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Voce vai digitar a temperatura em qual escala (C/F)? ");
        char escala = sc.next().toUpperCase().charAt(0);

        if (escala == 'F') {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            double f = sc.nextDouble();
            double c = (5.0 / 9.0) * (f - 32.0);
            System.out.printf("Temperatura equivalente em Celsius: %.2f%n", c);
        } else if (escala == 'C') {
            System.out.print("Digite a temperatura em Celsius: ");
            double c = sc.nextDouble();
            double f = (9.0 / 5.0) * c + 32.0;
            System.out.printf("Temperatura equivalente em Fahrenheit: %.2f%n", f);
        } else {
            System.out.println("Escala invalida.");
        }

        sc.close();
    }
}
