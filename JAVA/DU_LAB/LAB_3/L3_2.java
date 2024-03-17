import java.util.Scanner;
public class L3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int b = a.length();
        int k=0;
        for(int i=0;i<b/2;i++){
            if(a.charAt(i)!=a.charAt(b-i)){
                    System.out.println("this word is not pelindrom word.");
                    k++;
                    break;
            }
        }
        if(k==1){
            System.out.println("this is prlindrom word!");
        }
        int x,sum=0;
        int z = sc.nextInt();
        int s=z;
        while(z!=0){
         x=z%10;
         z=z/10;
        sum = (sum *10)+x;

        }
        if(sum==s){
            System.out.println("this no. is pelindrom no.!");
        }

    }
}
