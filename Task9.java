
import static java.lang.Math.*;
import java.util.Scanner;

public class Task9 {

    public static int add(int a, int b) {
        return Math.addExact(a, b);
    }

     public static int subtract(int a, int b) {
        return Math.subtractExact(a , b);
    }

    public static int multiply(int a, int b) {
        return Math.multiplyExact(a , b);
        
    }

    public static float divide(int a, int b) {
        
        return (float) floorDiv(a , b);
    } 

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("insert 1st number  : ");
        int a = s.nextInt();
        System.out.print("insert 2st number  : ");
        int b = s.nextInt();
        
        System.out.println("Addition       : " +a +"+" +b +"=" + add(a, b) );
        System.out.println("Subtraction    : " +a +"-" +b +"=" + subtract(a, b) );
        System.out.println("Multiplication : " +a +"*" +b +"=" + multiply(a, b) );
        System.out.println("Division       : " +a +"/" +b +"=" + divide(a, b) );
        s.close();

    }
}
    

