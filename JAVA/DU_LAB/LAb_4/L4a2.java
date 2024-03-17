import java.util.Scanner;

public class L4a2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string :");
        String a = sc.next();
        int con = 0;
        int vov = 0;
        for(int i = 0 ; i<(a.length());i++){
            if(a.charAt(i)=='A'||a.charAt(i)=='E'||a.charAt(i)=='I'||a.charAt(i)=='O'||a.charAt(i)=='U'||a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u'){
                ++vov;
            }
            else if(a.charAt(i)==' '){
            
            }
            else{
                con++;
            }
        }
        System.out.println();   
    }
    
}
