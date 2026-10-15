package methods;
public class taskMet {

     public int num1, num2;
     public int sum, difference, product, quotient ;   
    
    int Addition (int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
        sum = num1 + num2;
        return sum;

    }

    int Subtraction (int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
        difference = num1 - num2;
        return difference;

    }
    int Multiplication (int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
        product = num1 * num2;
        return product;

    }
    int Division (int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
        quotient = num1 / num2;
        return quotient;

    }
    
    
}
