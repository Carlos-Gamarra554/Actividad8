import java.util.InputMismatchException;
import java.util.Scanner;

public class Actividad8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean correcto = false;

        while (!correcto) {
            try {
                System.out.print("Introduce un número: ");
                int num = sc.nextInt();
                System.out.println("Opción válida!");
                correcto = true;
            } catch (InputMismatchException e) {
                //e.printStackTrace();
                System.out.println("Solo se permiten números!");
                sc.nextLine();
            }
        }
    }
}