public class Demo {
    public static void main(String[] args) {
       StringBuffer s1 = new StringBuffer("Darshan");
       String s2 = "University";
       s1.append(s2);
       s1.replace(2,4,"zzz");
       System.out.println(s1);
    }
}
