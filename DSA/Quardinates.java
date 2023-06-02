package DSA;

import java.util.*;

public class Quardinates {
    public static void main(String[] ndskjf) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x > 0 && y > 1)
            System.out.println("point lies on Quadrant 1");
        if (x < 0 && y > 0)
            System.out.println("point lies on Quadrant 2");
        if (x < 0 && y < 0)
            System.out.println("point lies on Quadrant 3");
        if (x > 0 && y < 0)
            System.out.println("point lies on Quadrant 4");
        if (x == 0 && y == 0)
            System.out.println("point is on origin");
    }

}
