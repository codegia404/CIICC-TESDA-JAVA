import java.util.*;

import Task9.Math;
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("input number1: ");
        int a = scanner.nextInt();

        System.out.println("input number2: ");
        int b = scanner.nextInt();
        System.out.println("input number3: ");
        int c = scanner.nextInt();


         int largestNum = Math.max(a, Math.max(b, c));
        System.out.println("the Largest number:" + largestNum);

        if (a == b && b == c) {
            System.out.println("all numbers are equal");
        } 


    }
    
}
