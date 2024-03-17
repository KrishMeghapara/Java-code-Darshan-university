import java.util.Scanner;;
public class L3_4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int i;
        for(i=2;i<=Math.sqrt(a);i++){
            if(a%i==0){
                System.out.println("this no. is not prime");
                break;
            }
        }
        if(a%i!=0){
            System.out.println("this is prime no.");
        }
    }
}
