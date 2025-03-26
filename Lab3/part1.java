public class part1 {
    public static void main(String[] args) {
        double k = 1.0;  
        double l = 5.0;  
        double h = 0.5;  
        double alpha = Math.PI / 4;
        double phi = Math.PI / 6;   

        System.out.println(" a     |  x");
        System.out.println("----------------");

        for (double a = k; a <= l; a += h) {
            double x = a * Math.sin(alpha + phi);
            System.out.printf("%.2f  |  %.4f%n", a, x);
        }
    }
}
    
