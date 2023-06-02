import java.util.*;
import java.lang.Math;

public class P45 {
    public static void main(String[] nska) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        if (num > 0) {
            System.out.println(Math.sqrt(num));
        } else {
            System.out.println("finding sqrt is not possible");
        }
    }

} 
