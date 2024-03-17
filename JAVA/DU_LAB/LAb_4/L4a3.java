import java.util.Scanner;
public class L4a3{
    public static void main(String[] args) {
        int[] a=new int[4] ;
        Scanner sc= new Scanner(System.in);
        double sum =0 ;
        
        for(int i=0;i<4;i++){
            System.out.print("Enter the no. in a["+i+"] :");

            a[i]=sc.nextInt();
            sum+=a[i];
        }
        sum=sum/4;
        System.out.println("the average of given no. is "+sum);

    }
}
