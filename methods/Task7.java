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
