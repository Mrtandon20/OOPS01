public class StudentUse {
    public static void main(String[] args) {
        Student s1 = new Student("Varun" , 100);
        System.out.println(s1);
        s1.print();
        // System.out.println(s1);
        // s1.name = "Varun";
        // s1.setRollNumber(-123);
        // System.out.println(s1.name);
        // System.out.println(s1.getRollNumber());

        Student s2 = new Student("Tandon" , 200);
        System.out.println(s2);
        s2.print();
        
        // System.out.println(s2);
        // s2.name = "Tandon";
        // s2.setRollNumber(456);
        // System.out.println(s2.name);
        // System.out.println(s2.getRollNumber());

        // Student s3 = new Student("Rahul");
        // s3.print();

        // Student s4 = new Student(500);
        // s4.print();

        // System.out.println(s1.studentNum); // Not a good practice
        // System.out.println(s2.studentNum); // Not a good practice
        // System.out.println(Student.studentNum); // Best Practice

        System.out.println(Student.getstudentNum());

    }    
}
