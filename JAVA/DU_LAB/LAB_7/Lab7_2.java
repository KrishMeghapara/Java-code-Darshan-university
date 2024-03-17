
interface A {
    public int CONSTANT_A = 10;

    public void methodA();
}

interface A1 extends A {
    public int CONSTANT_A1 = 3;

    public void methodA1();
}

interface A2 extends A {
    public int CONSTANT_A2 = 12;

    public void methodA2();
}

interface A12 extends A1, A2 {
    public int CONSTANT_A12 = 34;

    public void methodA3();
}

class B implements A12 {
    public void methodA() {
        System.out.println("A.CONSTANT_A: " + A.CONSTANT_A);
    }

    public void methodA1() {
        System.out.println("A1.CONSTANT_A1: " + A1.CONSTANT_A1);
    }

    public void methodA2() {
        System.out.println("A2.CONSTANT_A2: " + A2.CONSTANT_A2);
    }

    public void methodA3() {
        System.out.println("a.CONSTANT_A3: " + A12.CONSTANT_A12);
    }
}

public class Lab7_2 {
    public static void main(String[] args) {
        B b = new B();
        b.methodA();
        b.methodA1();
        b.methodA2();
        b.methodA3();
    }
}