import java.util.Scanner;
public class L3_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float d = sc.nextFloat();
        float e = sc.nextFloat();
        float f = (a+b+c+d+e)/5;
        if(f>=60){
            System.out.println("first class");
        }
        else if(f<59||f>=50){
            System.out.println("second class");
        }
        else if(f<49||f>=40){
            System.out.println("third class");
        }
        else if(f<40){
            System.out.println("fail");
        }
        





    }
}
