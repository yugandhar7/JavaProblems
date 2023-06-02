package DSA;

import java.util.*;

public class DaysWeeksYears {
    public static void main(String[] aksfj) {
        Scanner sc = new Scanner(System.in);

        int days = sc.nextInt();

        int years = days / 365;

        days = days % 365;
        int months = days / 30;
        days = days % 30;

        int weeks = days / 7;
        days = days % 7;

        System.out.println(years + "years" + months + "months" + weeks + "weeks" + days + "days");
    }

}
