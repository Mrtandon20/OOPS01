// 2 Classes and Objects

public class StudentUse {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1);
        s1.name = "Varun";
        s1.roll_no = 123;
        System.out.println(s1.name);
        System.out.println(s1.roll_no);

        Student s2 = new Student();
        System.out.println(s2);
        s2.name = "Tandon";
        s2.roll_no = 456;
        System.out.println(s2.name);
        System.out.println(s2.roll_no);

    }    
}
