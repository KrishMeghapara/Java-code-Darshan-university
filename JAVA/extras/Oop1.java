
class human {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

public class Oop1 {
    public static void main(String[] args) {
        human opj = new human();
        // opj.age = 11;
        // opj.name = "OOP";
        System.out.println(opj.getAge());
        System.out.println(opj.getName());
    }
}