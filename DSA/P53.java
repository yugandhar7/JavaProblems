import java.util.*;

public class P53 {
    public static void main(String[] sdbvf) {
        Scanner sc = new Scanner(System.in);

        int perfect_number = sc.nextInt();
        int demo = perfect_number;
        int sum = 0;
        for (int i = 1; i < perfect_number; ++i) {
            if (perfect_number % i == 0) {
                sum += i;

            }
        }
        if (sum == demo) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not a Perfect number");
        }
    }

}
