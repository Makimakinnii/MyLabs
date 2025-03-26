public class part2 {
    public static void main(String[] args) {
        double T = 10.0; // Межі x
        double h_x = 3.0; // Крок
        double a = 2.0; // Дано
        double b = 3.0; // Дано

        double maxZ = Double.NEGATIVE_INFINITY; //  використовується для ініціалізації змінної maxZ таким чином, щоб перше обчислене значення z завжди було більшим і оновило maxZ.
        double minZ = Double.POSITIVE_INFINITY;
        double maxX = 0, minX = 0;

        System.out.println(" x     |  z");
        System.out.println("----------------");

        for (double x = -T; x <= T; x += h_x) {
            double z = Math.pow(x, 3) + a + Math.pow(b, 3);
            System.out.printf("%.2f  |  %.4f%n", x, z);

            if (z > maxZ) {
                maxZ = z;
                maxX = x;
            }
            if (z < minZ) {
                minZ = z;
                minX = x;
            }
        }

        System.out.println("\nMAX z: " + maxZ + " при x = " + maxX);
        System.out.println("MIN z: " + minZ + " при x = " + minX);
    }
}
