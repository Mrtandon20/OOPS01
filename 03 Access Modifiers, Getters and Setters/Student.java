// 03 Access Modifiers , Getters and Setters

public class Student {
    
   public String name;
   private int roll_no;

   public void setRollNumber(int rn){
    if(rn < 0){
        return;
    }
    roll_no = rn;
   }

   public int getRollNumber(){
    return roll_no;
   }
    
}
