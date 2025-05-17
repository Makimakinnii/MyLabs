/*Абстрактний батьківський клас, що 
представляє предмет меблів, з 
абстрактним методом, який повертає 
опис збірки меблів, і неабстрактним 
методом, що отримує назву меблів. 
Дочірні класи, що представляють 
стілець і шафу з реалізаціями 
абстрактних методів. Головний клас з 
методом main, який одним оператором 
виводить назву і опис збірки для елементів масиву з об'єктами обох 
класів  */
abstract class Mebli {
    String name;

    Mebli(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
    abstract void Skladannya();
}

class Chair extends Mebli {
    Chair(String name) {
        super(name);
    }
    void Skladannya() {
        System.out.println("1.");
        System.out.println("2.");
    }
}

class Wardrobe extends Mebli {
    Wardrobe(String name) {
        super(name);
    }
    void Skladannya() {
        System.out.println("1.");
        System.out.println("2.");
    }
}

public class Main {
    public static void main(String[] args) {
        Chair chair = new Chair("Стілець");
        Wardrobe wardrobe = new Wardrobe("Шафа");

        System.out.println(chair.getName() + ":");
        chair.Skladannya();
        System.out.println();

        System.out.println(wardrobe.getName() + ":");
        wardrobe.Skladannya();
    }
}
