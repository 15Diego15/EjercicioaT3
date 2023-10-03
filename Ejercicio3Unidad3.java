import java.util.Scanner;

public class Ejercicio3Unidad3 {
    public static void main(String[] args) {
        int a;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca una edad:");
        a = Integer.parseInt(lector.nextLine());
        if (a < 18) {
            System.out.println("Es menor de edad");
        } else{
            System.out.println("Es mayor de edad");
        } 
    lector.close();
    }

}