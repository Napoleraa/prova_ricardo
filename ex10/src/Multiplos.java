
import java.util.Scanner;

public class Multiplos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero inteiro:");
        int a = sc.nextInt();
        System.out.println("Digite outro numero inteiro:");
        int b = sc.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("São múltiplos");
        } else {
            System.out.println("Não são múltiplos");
        }

        sc.close();
    }
}
