import java.util.Scanner;

public class part1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, omega, fi, h, k, l;

        System.out.println("Введите omega: ");
        omega = sc.nextDouble();
        System.out.println("Введите fi: ");
        fi = sc.nextDouble();
        System.out.println("Введите h: ");
        h = sc.nextDouble();
        System.out.println("Введите k: ");
        k = sc.nextDouble();
        System.out.println("Введите l: ");
        l = sc.nextDouble();

        double xmax = 0;

        if (k <= l) {
            xmax = k - Math.sin(omega + fi);
        }

        for (a = k; a <= l; a += h) {
            double x = a - Math.sin(omega + fi);
            System.out.println("a = " + a + ", x = " + x);

            if (x > xmax) {
                xmax = x;
            }
        }

        System.out.println( "x="+ xmax);
        sc.close();
    }
}
