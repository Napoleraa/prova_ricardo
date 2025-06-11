
import java.util.Locale;
import java.util.Scanner;

public class Lanchonete {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Codigo do produto comprado: ");
        int codigo = sc.nextInt();

        System.out.print("Quantidade comprada: ");
        int quantidade = sc.nextInt();

        double preco;

        if (codigo == 1) {
            preco = 5.00;
        } else if (codigo == 2) {
            preco = 3.50;
        } else if (codigo == 3) {
            preco = 4.80;
        } else if (codigo == 4) {
            preco = 8.90;
        } else if (codigo == 5) {
            preco = 7.32;
        } else {
            preco = 0.00;
        }
        double total = preco * quantidade;

        System.out.printf("Valor a pagar: R$ %.2f%n", total);
        sc.close();
    }
}
