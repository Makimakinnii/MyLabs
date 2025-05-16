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