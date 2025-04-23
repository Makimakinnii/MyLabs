// Задано масив значень A={ai} з 12 елементів. Знайти по два максимальних і мінімальних елементи. 
import java.util.Arrays;
public class Task1 {
    public static void main(String[] args) {
        int[] nums = {21, 234, 23, 56, 435, 34, 45, 345, 342, 34, 92, 12};

        Arrays.sort(nums);

        System.out.println("MIN" + nums[0] + ", " + nums[1]);
        System.out.println("MAX " + nums[11] + ", " + nums[10]);
    }
}