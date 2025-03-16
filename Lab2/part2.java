import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Введіть x: ");
        double x = scanner.nextDouble();
        
        System.out.print("Введіть b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Введіть c: ");
        double c = scanner.nextDouble();
        
        double a = Math.sqrt(b * b + c * c);
        
        double t;
        
        if (x > 0) {
            t = (a * Math.pow(Math.sin(x), 2)) + Math.sqrt(Math.abs(Math.cos(x)));
        } else if (x <= 0 && a != 0) {
            t = (Math.pow(x, 2) + a * b) / a + (Math.tan(a / b));
        } else {
            t = 1 / a + 0.5;
        }
        
        System.out.println("Результат t = " + t);
        scanner.close();
    }
}

