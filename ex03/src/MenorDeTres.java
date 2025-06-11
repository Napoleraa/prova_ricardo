import java.util.Locale;
import java.util.Scanner;

public class MenorDeTres {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int a = sc.nextInt();

        System.out.print("Digite o segundo valor:");
        int b = sc.nextInt();

        System.out.print("Digite o terceiro valor:");
        int c = sc.nextInt();

        int menor = a;

        if (b < menor){
            menor = b;
        }
        if (c < menor) {
            menor = c;
        }
        System.out.println("MENOR = " + menor);

        sc.close();
    }
}