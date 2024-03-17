public class StreamPattern {

    public static void main(String[] args) {
        String pyramid = "stream";
        for (int i = 0; i < pyramid.length() + 1; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(pyramid.charAt(j));
            }
            System.out.println(" ");

        }
    }
}