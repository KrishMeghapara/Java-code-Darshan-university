import java.util.Scanner;

public class Lab6_3 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Manager s3 = new Manager();
        Empoly ss = new Empoly();
        ss.printdetails();
        s3.printdetails();
    }

}

class Member {
    String Name;
    int Age;
    double Phone_number;
    String Address;
    int Salary;

    Member() {
        Scanner sc = new Scanner(System.in);
        Scanner st = new Scanner(System.in);
        System.out.println("Enter the name of member");
        Name = sc.nextLine();
        System.out.println("Enter the age of member");
        Age = sc.nextInt();
        System.out.println("Enter the phone no. of member ");
        Phone_number = sc.nextDouble();
        System.out.println("Enter the Address of member");
        Address = st.nextLine();
        System.out.println("Enter the Salary of member");
        Salary = sc.nextInt();
    }

    void printdetails() {
        System.out.println(Name);
        System.out.println(Age);
        System.out.println(Phone_number);
        System.out.println(Address);
        System.out.println(Salary);
    }

}

class Empoly extends Member {
    String Spacialization;

    public Empoly() {
        Scanner sc = new Scanner(System.in);
        String Spacialization = sc.nextLine();
    }

    void printdetails() {
        super.printdetails();
        System.out.println(Spacialization);
    }

}

class Manager extends Member {
    String Department;

    public Manager() {
        Scanner st = new Scanner(System.in);
        String Department = st.nextLine();

    }

    void printdetails() {
        super.printdetails();
        System.out.println(Department);
    }
}
