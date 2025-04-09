import java.util.Scanner;

public class RectangleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Сторона a: ");
        float a = scanner.nextFloat();

        System.out.print("Сторона b: ");
        float b = scanner.nextFloat();

        float area = a * b;
        float perimeter = 2 * (a + b);

        System.out.println("Площа прямокутника: " + area);
        System.out.println("Периметр прямокутника: " + perimeter);

        scanner.close();
    }
}
