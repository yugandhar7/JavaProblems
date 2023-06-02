package DSA;

import java.util.*;

public class ip {
    public static void main(String[] ug) {

        Scanner sc = new Scanner(System.in);

        byte by = sc.nextByte();

        System.out.println(by + "is" + ((Object) by).getClass().getSimpleName());

        short num3 = sc.nextShort();

        System.out.println(num3 + "is " + ((Object) num3).getClass().getSimpleName());

        int num = sc.nextInt();

        System.out.println(num + "is " + ((Object) num).getClass().getSimpleName());

        long num2 = sc.nextLong();

        System.out.println(num2 + " is " + ((Object) num2).getClass().getSimpleName());

        Boolean bol = sc.nextBoolean();

        System.out.println(bol + " is " + ((Object) bol).getClass().getSimpleName());

        String str = sc.nextLine();

        System.out.println(str + " is " + ((Object) str).getClass().getSimpleName());

        char ch = sc.next().charAt(0);

        System.out.println(ch + " is " + ((Object) ch).getClass().getSimpleName());

    }

}
