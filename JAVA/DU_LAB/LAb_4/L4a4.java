import java.util.Scanner;

public class L4a4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the no. a["+i+"] :");
            a[i]=sc.nextInt();
        }
        for(int i=n-1;i>=0;i--)
        if(i==0){
            System.out.print(a[i]+".");
        
        }
        else{
            System.out.print(a[i]+",");
        
        }   
    }
    
}
