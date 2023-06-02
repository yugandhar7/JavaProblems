import java.util.*;
import java.lang.*;

public class P59 {
    public static void main(String[] vsdf) {
        Scanner sc = new Scanner(System.in);
        int binary = sc.nextInt();
        int sum = 0, x, p = 0;
        while (binary > 0) {
            x = binary % 10;
            sum += x * Math.pow(2, p);

            binary = binary / 10;
            p++;

        }
        System.out.println(sum);
    }

}
