public class Exam1 {
    public static void main(String[] args) {
        human obj1 = new human();
        human obj2 = new human();
        obj1.x = 1;
        System.out.println(obj1.x);
        System.out.println(obj2.x);

    }
}

class human {
    int x;

    public human() {
        x++;
    }
}