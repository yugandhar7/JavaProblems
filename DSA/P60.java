import java.util.*;

public class P60 {
    public static void main(String[] ug) {
        Scanner sc = new Scanner(System.in);
        int odd = 0, even = 0;
        int evenCount = 0, oddCount = 0;
        int n = sc.nextInt();
        while (n > 0) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                even += num;
                evenCount++;
            } else {
                odd += num;
                oddCount++;
            }
            n--;
        }
        System.out.println("sum = " + even + " " + "count= " + evenCount);
        System.out.println("sum= " + odd + " " + "count= " + oddCount);
    }

}
