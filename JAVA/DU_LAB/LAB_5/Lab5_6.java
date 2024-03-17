class ObjectCountadder {
    static int NumberOfObbjects = 0;

    public ObjectCountadder() {
        NumberOfObbjects++;
    }

}

public class Lab5_6 {

    public static void main(String[] args) {
        ObjectCountadder obj1 = new ObjectCountadder();
        ObjectCountadder obj2 = new ObjectCountadder();
        ObjectCountadder obj3 = new ObjectCountadder();

        System.out.println("Number of objects created: " + ObjectCountadder.NumberOfObbjects);
    }
}
