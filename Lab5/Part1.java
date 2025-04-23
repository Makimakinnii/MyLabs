//До двовимірного масиву Z, що складається із n рядків та m стовпців 
//однорідних змінних, вводяться довільні числа. Треба обчислити та вивести 
//добуток усіх елементів із парних рядків масиву Z, що мають значення, більші 
//за число a та менші за число b (вважається, що a < b), та середнє арифметичне 
//від усіх додатних значень елементів цього масиву.
import java.util.Scanner;
public class Part1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("n: ");
        int n = in.nextInt();
        System.out.println("m: ");
        int m = in.nextInt();
        int[][] z = new int[n][m]; 
        System.out.println("input a: ");
        int a = in.nextInt();
        System.out.println("input b(a<b): ");
        int b = in.nextInt();
        System.out.println("massive z: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                z[i][j] = (int) (Math.random() * 20) - 6;
                System.out.print(z[i][j] + " ");
            }
            System.out.println();
        }
        long P = 1;
        int S = 0, K = 0; 
        for (int i = 0; i < n; i++) {
            if (i % 2 == 1) {
                for (int j = 0; j < m; j++) {
                    if (a < z[i][j] && z[i][j] < b) {
                        P = P * z[i][j];
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (0 < z[i][j]) {
                    S = S + z[i][j];
                    K++;
                }
            }
        }
        System.out.println("\nP = " + P);
        if (K > 0) {
            double R = (double) S / K;
            System.out.println("\nR = " + R + " S = " + S + " K = " + K);
        } else {
            System.out.println("\nR додатніх елементів немає");
        }
    }
}
