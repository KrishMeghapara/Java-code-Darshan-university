import java.util.Scanner;

class student {
    int id_no;
    int no_of_subjects_registered;
    String subject_code;
    int subject_credits;
    int grade_obtained;
    int spi;

    student() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ID NO");
        this.id_no = sc.nextInt();
        System.out.println(" Enter the no of subjects registered");
        this.no_of_subjects_registered = sc.nextInt();

    }

}

public class Lab6_1 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number of students:");
        n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            student si = new student();
        }

    }
}
