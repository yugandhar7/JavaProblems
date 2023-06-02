import java.util.*;

public class P46 {
    public static void main(String[] vsdjf) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, total = 0;
        while (true) {
            int num = sc.nextInt();
            total++;
            sum += num;
            System.out.println("the sum is  =  " + sum);
            int avg = sum / total;
            System.out.println("the avg is =" + avg);

        }
    }

}
