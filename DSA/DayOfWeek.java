package DSA;

import java.util.*;

public class DayOfWeek {
    public static void main(String[] gfdsj) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        switch (num) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("enter num between 0 to 7");
        }
    }

}
