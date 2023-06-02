import java.util.*;

public class P47 {
    public static void main(String[] dssbf) {
        Scanner sc = new Scanner(System.in);
        System.out.println("choose your choice");
        System.out.println(" +   -   *  /   % ");
        char ch = sc.next().charAt(0);
        System.out.println("enter the first number");
        int num1 = sc.nextInt();
        System.out.println("enter the second number");
        int num2 = sc.nextInt();

        switch (ch) {
            case '+':
                System.out.println("sum = " + num1 + num2);
                break;
            case '-':
                System.out.println("subtraction = " + (num1 - num2));
                break;
            case '*':
                System.out.println("product = " + (num1 * num2));
                break;
            case '/':
                System.out.println("quotient = " + (num1 / num2));
                break;
            case '%':
                System.out.println("reminder = " + (num1 % num2));
                break;
            default:
                System.out.println("please choose the options from menu");

        }

    }

}
