import java.util.Scanner;

class EquacaoSegundoGrau {
    private double a;
    private double b;
    private double c;

    public EquacaoSegundoGrau(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double calcularDelta() {
        return b * b - 4 * a * c;
    }
    public boolean temRaizesReais() {
        return calcularDelta() >= 0;
    }
    public double calcularX1() {
        double delta = calcularDelta();
        return (-b + Math.sqrt(delta)) / (2 * a);
    }
    public double calcularX2() {
        double delta = calcularDelta();
        return (-b - Math.sqrt(delta)) / (2 * a);
    }
    public void mostrarRaizes() {
        if (!temRaizesReais()) {
            System.out.println("A equação não possui raízes reais.");
        } else {
            System.out.printf("x1 = %.4f%n", calcularX1());
            System.out.printf("x2 = %.4f%n", calcularX2());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Coeficiente a: ");
        double a = sc.nextDouble();

        System.out.print("Coeficiente b: ");
        double b = sc.nextDouble();

        System.out.print("Coeficiente c: ");
        double c = sc.nextDouble();

        EquacaoSegundoGrau equacao = new EquacaoSegundoGrau(a, b, c);
        equacao.mostrarRaizes();

        sc.close();
    }
}
