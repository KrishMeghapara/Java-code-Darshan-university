import java.util.Scanner;

public class L3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a<b){
            if(b<c){
                System.out.println("the biggest no. is "+c);
            }
            else{
                System.out.println("the biggest no. is "+b);
            }
        }
        else if(a<c){
            System.out.println("the biggest no. is "+c);
            
        }
        else{
            System.out.println("the biggest no. is "+a);
            
        }
    }
}
