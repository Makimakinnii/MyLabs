import java.util.Scanner;

public class Labs2part1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Введення вхідних даних
        System.out.print("Enter alpha value (in radians): ");
        double alpha = sc.nextDouble();
        
        // Розрахунок формули z1
        double z1 = (Math.sin(2*alpha) + Math.sin(5*alpha) - Math.sin(3*alpha)) / 
                    (Math.cos(alpha) + 1 - 2 * Math.sin(2*alpha));
        
        // Розрахунок формули z2
        double z2 = -2 * Math.sin(alpha);
        
        // Виведення результатів
        System.out.println("z1 = " + z1);
        System.out.println("z2 = " + z2);
        
        // Перевірка збігу результатів
        System.out.println("\nCheck of results matching:");
        System.out.println("Difference between z1 and z2: " + Math.abs(z1 - z2));
        
        sc.close();
    }
}