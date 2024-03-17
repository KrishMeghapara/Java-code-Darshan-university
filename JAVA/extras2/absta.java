public class absta {
    public static void main(String[] args) {
        WegonR o = new WegonR();
        o.WegonR();

    }
}

class Car {
    public void Car() {
        System.out.println("asdd    ");
    }

    public void drive() {
        System.out.println("op");
    }

    public void PlayMu() {
        System.out.println("Play Badboy");
    }
}

class WegonR extends Car {
    public void WegonR() {

        PlayMu();
        drive();

    }

    public void drive() {
        System.out.println("ss  ");
    }
}