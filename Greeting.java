import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Greeting {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Як вас звати? ");
        String name = reader.readLine();
        System.out.println("Привіт, " + name + "!");
        System.out.print("Скільки вам років? ");
        int age = Integer.parseInt(reader.readLine());
        int birthYear = 2024 - age;
        System.out.println("Ви народилися у " + birthYear + " році.");
    }
}
