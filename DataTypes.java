public class DataTypes {
    public static void main(String[] ug) {
        // INTEGER
        byte num1 = 127; // 1byte 8 bits 1^7 to -1^7;
        short num2 = 600;// 2 bytes
        int num3 = 1234567;// 4 bytes
        long num4 = 8466905659l;// 8 bytes
        System.out.println(num1 + " " + num2 + " " + num3 + " " + num4);

        // DOUBLE
        double db = 4.566666666666666;// it is a default in java and it is used for long numbers after the decimal
                                      // point
        float ff = 45.54674635f;// is is used for fixed numbers after the decimal point we have to specif the
                                // float with "f"
        System.out.println(db + " " + ff);

        // Character
        char c = 'k';// it stores only character and to be stored in '' and it wont accept "";
        System.out.println(c);

        // BOOLEAN
        boolean bool = true;
        boolean bl = false;// it accepts either true or false
        System.out.println(bool + " " + bl);
    }
}
