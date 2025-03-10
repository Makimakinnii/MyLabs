import java.util.Scanner;

public class TrigCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введіть α (у радіанах): ");
        double alpha = scanner.nextDouble();
        
        double z1 = (Math.sin(2 * alpha) + Math.sin(5 * alpha) - Math.sin(3 * alpha)) /
                    (Math.cos(alpha) + 1 - 2 * Math.pow(Math.sin(2 * alpha), 2));
        
        double z2 = 2 * Math.sin(alpha);
        
        System.out.println("z1 = " + z1);
        System.out.println("z2 = " + z2);
        
        scanner.close();
    }
}
