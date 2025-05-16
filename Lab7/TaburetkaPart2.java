public class TaburetkaPart2 {
    String material;
    int height;
    int width;
    int weight;
    
    public TaburetkaPart2(String material, int height, int width, int weight) {
        this.material = material;
        this.height = height;
        this.width = width;
        this.weight = weight;
    }
    
    public void info() {
        System.out.println("Taburetka made of " + material + " with height " + height +
                ", width " + width + ", and weight " + weight);
    }
    
    public static void main(String[] args) {
        TaburetkaPart2 t1 = new TaburetkaPart2("plastic", 60, 50, 10);
        t1.info();
        TaburetkaPart2 t2 = new TaburetkaPart2("wood", 70, 60, 15);
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