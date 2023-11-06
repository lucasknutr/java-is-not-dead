import java.util.Scanner;

public class Main {
    public static int Add(int a, int b) {
        return a + b;
    }
    public static double generateRandom () {
        return Math.floor(Math.random() * 255.999);
    }
    public static void getRGBValues() {
        double r = generateRandom();
        double g = generateRandom();
        double b = generateRandom();
        System.out.println("r: " + r + " g: " + g + " b: " + b);
    }

    public static String getName() {
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    // MAIN APP
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println(Add(a, b));
        getRGBValues();
        System.out.println("Hello, " + getName());
    }
}
