import java.util.Scanner;

public class L4a5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string :");
        String a = sc.next();
        for(int i=(a.length())/2;i<a.length();i++){
            System.out.println(a.charAt(i));
        }
       
    }
    
}
