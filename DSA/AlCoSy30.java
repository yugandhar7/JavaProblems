
import java.util.*;

public class AlCoSy30 {
    public static void main(String[] hsdj) {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is Alphabets");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is constants");
        } else {
            System.out.println(ch + " is  special characters");
        }
    }

}
