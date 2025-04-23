//Задано масив з 10 дійсних чисел. Визначити, чи утворюють вони послідовність, яка зростає або спадає. 

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();
        System.out.println("Ряд чисел:");
        for (int i = 0; i < numbers.length; i++) { // порівнюємо кожен елемент з наступним
            numbers[i] = random.nextInt(101); 
            System.out.println(numbers[i]);
        }
        int up = 0;//Якщо лічильник up більше 0, а down дорівнює 0 — масив зростає.
        int down = 0;// Якщо лічильник down більше 0, а up дорівнює 0 — масив спадає.

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] < numbers[i + 1]) {
                up++; // якщо поточне число менше наступного — це зростання
            } else if (numbers[i] > numbers[i + 1]) {
                down++; // якщо поточне число більше наступного — це спадання
            }
        }
        if (up > 0 && down == 0) { 
            System.out.println("Масив зростає.");
        } else if (down > 0 && up == 0) {
            System.out.println("Масив спадає.");
        } else if (up == 0 && down == 0) {
            System.out.println("Усі елементи рівні.");
        } else {
            System.out.println("Масив не є впорядкованим.");
        }
    }
}

