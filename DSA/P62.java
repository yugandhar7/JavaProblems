import java.util.*;

public class P62 {
    public static void main(String[] dfyusgf) {
        for (int i = 10; i <= 100; ++i) {
            String str = String.valueOf(i);
            String str1 = "";
            for (int j = str.length() - 1; j >= 0; --j) {
                str1 += str.charAt(j);

            }
            if (str.equals(str1)) {
                System.out.println(str);
            }
        }
    }

}
