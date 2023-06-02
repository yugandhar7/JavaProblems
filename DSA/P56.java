import java.util.*;

public class P56 {
    public static void main(String[] mdgsc) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int product = 1;
        for (int i = num; i > 0; --i) {
            product *= i;
        }
        System.out.println(product);

    }

}
