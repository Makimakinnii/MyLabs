//Дано текст. Надрукувати його, замінивши в ньому всі літери а на літеру о.
public class Part1 {
    public static void main(String[] args) {
        String s = new String(
            "To be, or not to be, that is the question\r\n" +
            "Whether 'tis nobler in the mind to suffer\r\n" +
            "The slings and arrows of outrageous fortune,\r\n" +
            "Or to take arms against a sea of troubles\r\n" +
            "And by opposing end them."
        );
        System.out.println(s);
        System.out.println(s.replaceAll("o", "a"));
    }
}
