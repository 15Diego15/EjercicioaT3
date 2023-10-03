import java.util.Scanner;
public class Ejercicio1Unidad3 {
    public static void main (String[] args) {
        int number;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca un número:");
        number = Integer.parseInt(lector.nextLine());
        if (number % 2==0){
            System.out.println("Es par");
        } 
        else{
            System.out.println("Es impar");
        }
    }

}
