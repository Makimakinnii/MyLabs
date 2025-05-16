/*  Батьківський клас, що представляє 
табурет, з методом, що виводить на 
екран його розміри і матеріал, з якого 
він виготовлений, а також з методом, 
що порівнює вагу двох табуретів з 
виведенням на екран інформації, який з 
них важче. Дочірній клас, що 
представляє стілець, з методом 
порівняння висоти спинки сидіння 
двох стільців і методом порівняння 
ваги двох стільців. Головний клас з 
методом main, який одним 
оператором виводить на екран 
інформацію про порівняння ваги 
сусідніх елементів масиву з 
табуретами і стільцями.  */
public class Stilets extends TaburetkaPart2 {
    public Stilets(int height, int weight) {
        super("metal", height, 30, weight);
    }
    
    public void info() {
        System.out.println("Stilets with height " + height + " and weight " + weight);
    }
    
    public static void main(String[] args) {
        Stilets stilets1 = new Stilets(100, 50);
        Stilets stilets2 = new Stilets(120, 60);
        
        stilets1.info();
        stilets2.info();
        
        if (stilets1.weight > stilets2.weight) {
            System.out.println("Stilets 1 vazhche Stilets 2");
        } else if (stilets1.weight < stilets2.weight) {
            System.out.println("Stilets 2 vazhche Stilets 1");
        } else {
            System.out.println("Stilets 1 = Stilets 2");
        }
        
        if (stilets1.height > stilets2.height) {
            System.out.println("Stilets 1 vyshche Stilets 2");
        } else if (stilets1.height < stilets2.height) {
            System.out.println("Stilets 2 vyshche Stilets 1");
        } else {
            System.out.println("Stilets 1 = Stilets 2");
        }
    }
}