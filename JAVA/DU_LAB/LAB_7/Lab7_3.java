
interface Transport {
    void deliver();
}

abstract class Animal {
}

class Tiger extends Animal {
}

class Camel extends Animal implements Transport {
    public void deliver() {
        System.out.println("pani pila do:");
    }
}

class Deer extends Animal {
}

class Donkey extends Animal implements Transport {
    public void deliver() {
        System.out.println("hu to muki gayo hato:");
    }
}

public class Lab7_3 {
    public static void main(String[] args) {
        Animal[] animals = { new Tiger(), new Camel(), new Deer(), new Donkey() };

        for (Animal animal : animals) {
            if (animal instanceof Transport) {
                Transport transportAnimal = (Transport) animal;
                transportAnimal.deliver();
            }
        }
    }
}