import java.util.Scanner;

class Task4{
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a word:");
    String word = scanner.nextLine();

    StringBuilder sb = new StringBuilder(word);
    sb.reverse();

    System.out.println(sb);

    if(sb.toString().equals(word))
        System.out.println("the input string is a Polindrome");
    else
        System.out.println("the input string is NOT a Polindrome");

}
}
