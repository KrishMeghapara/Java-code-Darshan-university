import java.lang.Math;
public class Lab6_7 {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Generic Animal", 4);
        Tiger tiger1 = new Tiger("Tigger");
        Lion lion1 = new Lion("Simba");
        Bird bird1 = new Bird("Tweety");

        System.out.println("Animal Details:");
        System.out.println("Total Animals: " + Animal.getTotalAnimals());
        animal1.printDetails();

        System.out.println("\nTiger Details:");
        System.out.println("Total Tigers: " + Tiger.getTotalTigers());
        tiger1.printDetails();

        System.out.println("\nLion Details:");
        System.out.println("Total Lions: " + Lion.getTotalLions());
        lion1.printDetails();

        System.out.println("\nBird Details:");
        System.out.println("Total Birds: " + Bird.getTotalBirds());
        bird1.printDetails();
    }
}

class Animal {
    private String name;
    private int legs;
    private static int totalAnimals;

    public Animal(String name, int legs) {
        this.name = name;
        this.legs = legs;
        totalAnimals++ ;
    }

    public String getName() {
        return name;
    }

    public int getLegs() {
        return legs;
    }

    public static int getTotalAnimals() {
        return totalAnimals;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Legs: " + legs);
    }
}

class Tiger extends Animal {
    private static int totalTigers;

    public Tiger(String name) {
        super(name, 4);
        totalTigers++;
    }

    public static int getTotalTigers() {
        return totalTigers;
    }

    public void printDetails() {
        super.printDetails();
        System.out.println("Species: Tiger");
    }
}

class Lion extends Animal {
    private static int totalLions;

    public Lion(String name) {
        super(name, 4);
        totalLions++;
    }

    public static int getTotalLions() {
        return totalLions;
    }

    public void printDetails() {
        super.printDetails();
        System.out.println("Species: Lion");
    }
}

class Bird extends Animal {
    private static int totalBirds;

    public Bird(String name) {
        super(name, 2);
        totalBirds++;
    }

    public static int getTotalBirds() {
        return totalBirds;
    }

    public void printDetails() {
        super.printDetails();
        System.out.println("Species: Bird");
    }
}

