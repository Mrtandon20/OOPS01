public class Student {
    
   public String name;
   private final int roll_no;
   // 1. Can initialize at the time of creation of final variable

//    public Student(String nm){
//     name = nm; 
//    }

   // public Student(int rn){
   //  roll_no = rn;
   //  // 2. Can initial at inside the constructor
   // }

   public Student(String name , int roll_no){
   // this is reference (s1 = this)
    System.out.println(this);
    this.name = name;
    this.roll_no = roll_no;
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
