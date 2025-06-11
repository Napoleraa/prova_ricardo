
import java.util.Locale;
import java.util.Scanner;

public class MedidorDeGlicose {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a medida da glicose: ");
        double glicose = sc.nextDouble();

        System.out.print("Classificacao: ");

        if (glicose <= 100.0) {
            System.out.println("normal");
        } else if (glicose <= 140.0) {
            System.out.println("elevado");
        } else {
            System.out.println("diabetes");
        }

        sc.close();
    }
}
