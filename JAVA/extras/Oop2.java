
class Add1 {

    int a = 10;

    public int add(int a, int b) {
        int d = this.a - b;
        return d;
    }

    public int add(int a, int b, int c) {
        int r = add(a, b) + c;
        return r;
    }

}

public class Oop2 {
    public static void main(String[] args) {
        int a = 2;
        int b = 1;
        int c = 4;
        Add1 obj1 = new Add1();
        int result2 = obj1.add(a, b, c);
        System.out.println(result2);
    }

}
