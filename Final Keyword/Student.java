public class Student {
    
   public String name;
   private final int roll_no;
   // 1. Can initialize at the time of creation of final variable

//    public Student(String nm){
//     name = nm; 
//    }

   public Student(int rn){
    roll_no = rn;
    // 2. Can initial at inside the constructor
   }

   public Student(String nm , int rn){
    name = nm;
    roll_no = rn;
   }


//    public void setRollNumber(int rn){
//     if(rn < 0){
//         return;
//     }
//     roll_no = rn;
//    }

   public int getRollNumber(){
    return roll_no;
   }

   public void print(){
    System.out.println(name + " " + roll_no);
   }
    
}
