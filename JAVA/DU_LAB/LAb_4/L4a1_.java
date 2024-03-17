import java.util.Scanner;

public class L4a1_{
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int k=1;
        for(int i=1;i<=3;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* " );
            }
            System.out.println();
        }
        for(int i=2;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* " );
            }
            System.out.println();
        }



    }
}
