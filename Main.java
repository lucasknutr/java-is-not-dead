import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final List<Cake> cakes = new ArrayList<>();

    public static Cake getCakeByName(String name) {
        for (Cake cake : cakes) {
            if (cake.name.equals(name)) {
                return cake;
            }
        }
        throw new NoSuchElementException("There is no cake with this name.");
    }

    public static String compareCakePrices(Cake firstCake, Cake secondCake) {

        if (firstCake.price == secondCake.price) {
            return String.format("The cakes %s and %s have the same price. They both cost %s !", firstCake.name, secondCake.name, firstCake.price);
        } else if (firstCake.price > secondCake.price) {
            return String.format("The cake %s is more expensive than the cake %s. The cake %s costs %s and the cake %s costs %s.", firstCake.name, secondCake.name, firstCake.name, firstCake.price, secondCake.name, secondCake.price);
        } else {
            return String.format("The cake %s is more expensive than the cake %s. The cake %s costs %s and the cake %s costs %s.", secondCake.name, firstCake.name, secondCake.name, secondCake.price, firstCake.name, firstCake.price);
        }
    }

    public static void getCakes () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first cake name: ");
        String firstCakeName = scanner.nextLine();
        System.out.println("Enter the second cake name: ");
        String secondCakeName = scanner.nextLine();
        scanner.close();
        Cake firstCake = getCakeByName(firstCakeName);
        Cake secondCake = getCakeByName(secondCakeName);

        String comparisonResult = compareCakePrices(firstCake, secondCake);
        System.out.println(comparisonResult);

    }

    // MAIN APP
    public static void main(String[] args) {
        Cake bombocado = new Cake("Bombocado", 22, 12, true);
        Cake boloDeCenoura = new Cake("Cenoura", 20, 11, true);
        Cake boloDeChocolate = new Cake("Chocolate", 18, 10, true);
        cakes.add(bombocado);
        cakes.add(boloDeCenoura);
        cakes.add(boloDeChocolate);
        getCakes();
    }
}
