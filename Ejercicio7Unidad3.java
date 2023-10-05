import java.util.Scanner;

public class Ejercicio7Unidad3 {
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        int edad;
        boolean padresSocios;
        System.out.println("Ingrese una edad");
        edad = lector.nextInt();
        System.out.println("¿Tus padres son socios? (true/false)");
        padresSocios = lector.nextBoolean();
        lector.close();
        double  cuotaBase = 500;
        if (edad >= 65) {
            cuotaBase = cuotaBase * 0.5;
        } else if (edad < 18 && !padresSocios) {
            cuotaBase = cuotaBase * 0.75;
        } else if (edad < 18 &&  padresSocios) {
            cuotaBase = cuotaBase * 0.65;
        }
        System.out.println("El total a abonar es: " + cuotaBase + "€");
    }
}
