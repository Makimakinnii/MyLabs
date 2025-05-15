/*Клас, який представляє табурет, з 
методом, що виводить на екран його 
розміри і матеріал, з якого він 
виготовлений, а також з методом, що 
порівнює вагу двох табуретів з 
виведенням на екран інформації, який 
з них важче (без параметрів) */
public class Taburetka {

    String material;
    int height;
    int width;
    int weight;

    public Taburetka() {
        material = "wood";
        height = 50;
        width = 40;
        weight = 5;
    }
    public void info() {
        System.out.println("Taburetka made of " + material + " with height " + height + ", width " + width + ", and weight " + weight);
    }

    public static void main(String[] args) {
        Taburetka t1 = new Taburetka();
        t1.info();
        Taburetka t2 = new Taburetka();
        t2.material = "plastic";
        t2.height = 60;
        t2.width = 50;
        t2.weight = 10;
        t2.info();

        if (t1.weight > t2.weight) {
            System.out.println("Taburetka 1 > Taburetka 2");
        } else if (t1.weight < t2.weight) {
            System.out.println("Taburetka 2 > Taburetka 1");
        } else {
            System.out.println("Taburetka 1 = Taburetka 2");
        }
    }
}
