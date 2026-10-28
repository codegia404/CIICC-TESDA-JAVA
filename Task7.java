package methods;
import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        System.out.println("press 1 - Addition");
        System.out.println("press 2 - Subtraction");
        System.out.println("press 3 - Multiplication");
        System.out.println("press 4 - Division");
        System.out.print("Enter Opertor you want to use:");
        int userOp = s.nextInt();
        System.out.println("************");

        System.out.print("Enter 1st number:");
        int num01 = s.nextInt();
        System.out.print("Enter 2st number:");
        int num02 = s.nextInt();

        taskMet e = new taskMet();


        switch (userOp) {
            case 1:
                int sum = e.Addition(num01, num02);
                System.out.println(num01 +" + " +num02 +" = " +sum);
                break;
            case 2:
                int difference = e.Subtraction(num01, num02);
                System.out.println(num01 +" - " +num02 +" = " +difference);
                break;
            case 3:
                int product = e.Multiplication(num01, num02);
                System.out.println(num01 +" * " +num02 +" = " +product);
                break;
            case 4:
                int quotient = e.Division(num01, num02);
                System.out.println(num01 +" / " +num02 +" = " +quotient);
                break;

            default:
                System.out.println("Invalid operator! Please enter 1 to 4.");
                break;
        }


        s.close();

    }




}

class taskMet {

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
