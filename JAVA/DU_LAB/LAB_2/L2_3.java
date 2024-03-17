import java.util.Scanner;

public class L2_3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char v = sc.next().charAt(0);
        switch (v) {
            case '+':
            System.out.println(a+b);
                
                break;
            case '-':
            System.out.println(a-b);
                
                break;
            case '*':
            System.out.println(a*b);
                
                break;
            case '/':
            double c = (double)a/b;
            System.out.println(c);
                
                break;
            
            default:
                break;
        }

    }
}
