import java.util.*;

public class P44 {
    public static void main(String[] sbf) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (; n > 0;) {
            int result = n % 10;
            sum = sum + result;
            n = n / 10;
        }
        System.out.println(sum);

    }

}
