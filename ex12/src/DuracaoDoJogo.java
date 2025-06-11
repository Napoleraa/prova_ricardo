
import java.util.Scanner;

public class DuracaoDoJogo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Hora inicial: ");
        int horaI = sc.nextInt();

        System.out.print("Hora final: ");
        int horaF = sc.nextInt();

        int duracao;

        if (horaI == horaF) {
            duracao = 24;
        } else if (horaI < horaF) {
            duracao = horaF - horaI;
        } else {
            duracao = 24 - horaI + horaF;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        sc.close();
    }
}
