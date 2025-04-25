// Прибрати всі символи «—» з тексту
public class Part2 {
    public static void main(String[] args) {
        String s = new String(
    "To sleep, perchance to dream — ay, there's the rub: \r\n" +
"For in that sleep of death what dreams may come, \r\n" +
"When we have shuffled off this mortal coil, \r\n" +
"Must give us pause — there's the respect \r\n" +
"That makes calamity of so long life."
        );

        System.out.println(s.replaceAll("—", "")); 
    }
}
    
