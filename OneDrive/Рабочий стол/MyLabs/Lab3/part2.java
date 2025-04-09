import java.util.Scanner;

public class part2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, z, x, T, s;
        
        System.out.println("Введите a: ");
        a = sc.nextDouble();
        System.out.println("Введите b: "); 
        b = sc.nextDouble();
        System.out.println("Введите T: ");
        T = sc.nextDouble();
        
        double MAX, xmax; 
        x = -T; 
        s = Math.cos(x + a) + Math.pow(b, 3);
        z = Math.pow(x,5) + a * s + Math.pow(b, 3);
        MAX = z;
        xmax = x;

        for (x = -T; x <= T; x += 3) {  
            s = Math.cos(x + a) + Math.pow(b, 3);
            z = Math.pow(x, 5) + a * s + Math.pow(b, 3);
            System.out.println("x= " + x + " z= " + z + " s= " + s);
            
            if (z > MAX) {
                MAX = z;
                xmax = x;
            }
        }

        System.out.println("MAX= " + MAX + " xmax= " + xmax);
    }
}