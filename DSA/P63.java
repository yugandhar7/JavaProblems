import java.util.*;

public class P63 {
    public static void main(String[] ngsdfg) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int x = 0, sum = 0;
        int y = 0, z = 0;
        while (num > 0) {
            x = num % 10;
            sum += x;
            num = num / 10;
        }
        while (sum > 0) {
            y = sum % 10;
            z += y;
            sum = sum / 10;
        }
        System.out.println(z);
    }

}
