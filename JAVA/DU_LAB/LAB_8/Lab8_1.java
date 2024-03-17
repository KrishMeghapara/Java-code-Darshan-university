
public class Lab8_1 {
    public static void main(String[] args) {

        try {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);

            int result = 1;
            for (int i = 0; i <= y; i++) {
                result *= x;
            }

            System.out.println(x + "^" + y + " = " + result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid integer format for x or y.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}