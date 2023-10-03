import java.util.Scanner;

public class Ejercicio2Unidad3 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca x:");
        a = Integer.parseInt(lector.nextLine());
        System.out.println("Introduzca y:");
        b = Integer.parseInt(lector.nextLine());
        if (a > b) {
            System.out.println("X Es mayor que Y");
        } else if (a < b) {
            System.out.println("X Es menor que Y");
        } else {
            System.out.println("X Es igual que Y");
        }
    }

}
