import java.util.*;

public class P58 {
    public static void main(String[] gsf) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String str = String.valueOf(num);
        String pal = "";
        for (int i = str.length() - 1; i >= 0; --i) {
            pal += str.charAt(i);

        }

        if (str.equals(pal))
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");
    }
}