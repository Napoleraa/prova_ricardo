import java.util.Locale;
import java.util.Scanner;

public class TrocoOuFalta {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Preço unitário do produto: ");
        double precoUnit = sc.nextDouble();

        System.out.print("Quantidade comprada: ");
        int qtde = sc.nextInt();

        System.out.print("Dinheiro recebido: ");
        double dinheiroRecebido = sc.nextDouble();

        double total = precoUnit * qtde;

        if (dinheiroRecebido >= total) {
            double troco = dinheiroRecebido - total;
            System.out.printf("TROCO = %.2f%n", troco);
        } else {
            double falta = total - dinheiroRecebido;
            System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f REAIS%n", falta);
        }
        sc.close();
    }
}