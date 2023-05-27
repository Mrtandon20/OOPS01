/******************
 * Following is the main function we are using internally.
 * Refer this for completing the ComplexNumbers class
 * 
 
 public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int real1 = s.nextInt();
		int imaginary1 = s.nextInt();

		int real2 = s.nextInt();
		int imaginary2 = s.nextInt();

		ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
		ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

		int choice = s.nextInt();
		 
		if(choice == 1) {
			// Add
			c1.plus(c2);
			c1.print();
		}
		else if(choice == 2) {
			// Multiply
			c1.multiply(c2);
			c1.print();
		}
		else {
			return;
		}
	}
 ******************/

public class ComplexNumbers {
	// Complete this class

	private int realNumber;
	private int imaginary;

	public ComplexNumbers(int realNumber , int imaginary){
		this.realNumber = realNumber;
		this.imaginary = imaginary;
	}

	public void plus(ComplexNumbers c2){
		this.realNumber = this.realNumber + c2.realNumber;
		this.imaginary = this.imaginary + c2.imaginary;
	}

	public void multiply(ComplexNumbers c2){
		int real1 = this.realNumber*c2.realNumber;
		int imaginary1 = this.realNumber*c2.imaginary;
		int imaginary2 = this.imaginary* c2.realNumber;
		int real2 = this.imaginary*c2.imaginary;
		this.realNumber = real1 - real2;
		this.imaginary = imaginary1 + imaginary2;
	}

	public void print(){
		System.out.println(this.realNumber + " + i" +  this.imaginary);
	}

}
