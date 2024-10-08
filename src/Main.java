import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int num;

        try {
          num = sc.nextInt();
            System.out.println("Opción válida!");
        } catch (InputMismatchException e){
            System.out.println("Solo se permiten números!");
            e.printStackTrace();
        }

    }
}