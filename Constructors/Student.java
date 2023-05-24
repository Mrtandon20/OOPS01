public class Student {
    
   public String name;
   private int roll_no;

   public Student(String nm){
    name = nm; 
   }

   public Student(int rn){
    roll_no = rn;
   }

   public Student(String nm , int rn){
    name = nm;
    roll_no = rn;
   }


   public void setRollNumber(int rn){
    if(rn < 0){
        return;
    }
    roll_no = rn;
   }

   public int getRollNumber(){
    return roll_no;
   }

   public void print(){
    System.out.println(name + " " + roll_no);
   }
    
}
