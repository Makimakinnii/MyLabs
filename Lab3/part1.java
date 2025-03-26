public class part1 {
    public static void main(String[] args) {
        double k = 1.0;  // початкове значення
        double l = 5.0;  // кінцеве
        double h = 0.5;  // крок
        double alpha = Math.PI / 4;
        double phi = Math.PI / 6;   

        System.out.println(" a     |  x"); 
        System.out.println("----------------"); 

        for (double a = k; a <= l; a += h) {
            double x = a * Math.sin(alpha + phi);
            System.out.printf("%.2f  |  %.4f%n", a, x); //%.2f це форматування для числа з плаваючою комою, де після десяткової крапки виводиться два знаки.
// %n - переносить виведення на новий рядок.
// printf - метод, який дозволяє виводити дані з форматуванням. У нашому випадку це %.2f - виведення числа з плаваючою комою з двома знаками після коми.
        }
    }
}
    
