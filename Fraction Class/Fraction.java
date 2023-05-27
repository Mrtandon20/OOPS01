public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction(int numerator , int denominator){
        this.numerator = numerator;
        if(denominator == 0){
            // TO ERROR OUT
        }
        this.denominator = denominator;
        Simplify();
    }

    public void add(Fraction f2){
        this.numerator = (this.numerator*f2.denominator) + 
        (this.denominator * f2.numerator); 

        this.denominator = this.denominator*f2.denominator;
        Simplify();
    }

    public void multiply(Fraction f2){
        this.numerator = this.numerator * f2.numerator;
        this.denominator = this.denominator * f2.denominator;
        Simplify();
    }

    public static Fraction add(Fraction f1, Fraction f3){
         int newNumerator = (f1.numerator * f3.denominator) + 
        (f1.denominator * f3.numerator);

        int newDenominator = f1.denominator * f3.denominator;

        Fraction f = new Fraction(newNumerator, newDenominator);

        return f;
    
    }
    
    private void Simplify(){
        int gcd = 1;
        int smallest = Math.min(numerator, denominator);
        for(int i=2; i<=smallest; i++){
            if(numerator%i == 0 && denominator%i==0){
                gcd = i;
            }
        }
        numerator = numerator/gcd;
        denominator = denominator/gcd;

    }
    
    public int getNumerator(){
        return numerator;
    }

    public int getDenominator(){
        return denominator;
    }

    public void setNumerator(int numerator){
        this.numerator = numerator;
        Simplify(); 
        /* when we enter the new value in numberator Simplyfy() it will simplify 
        it according to new numerator with old denominator */ 
        
    }
    
    public void setDenominator(int denominator){
        if(denominator == 0){
            // TO ERROR OUT
        }
        this.denominator = denominator;
        Simplify();
        /* when we enter the new value in denominator  Simplyfy() it will simplify 
        it according to new denominator with old numerator */ 
    }

    public void print(){
        if(denominator == 1){
            System.out.println(numerator);
        }
        else{
            System.out.println(numerator + "/" + denominator);
        }
    }
}
