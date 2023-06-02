import java.util.*;

public class P48 {
    public static void main(String[] bsb) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = "";
        while (num > 0) {
            int x = num % 2;
            str += x;
            num = num / 2;
            if (num == 1) {
                str += 1;

            }
        }
        String ss = "";
        char ch;
        for (int i = str.length() - 1; i > 0; --i) {
            ch = str.charAt(i);
            ss += ch;

        }
        System.out.println(ss);

    }
}