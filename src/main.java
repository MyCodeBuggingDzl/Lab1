/* 3. Part A
A1. True, True, True & True.
A2. Because it's needed so the loop can go through every single character
and verify whether it's true or not.
A3. The size starts by 0.
A4. It will cause an error.
A5. No, it must have at least a lower char.
A6. No, it must have at least a upper char.
 */

import java.util.Random;

public class main {
    public static void main(String[] args) {

        System.out.println(countDigits("Vanier2026"));
        System.out.println(isValidPassword("VANIER2026"));
        System.out.println(countUppercase("VANIER012"));
        System.out.println(generateCode());
    }

    /* Part B
       1. The accumulator should be initally 0.
       2. When char c = text.charAt(i); is true.
       3. After the loop.
    */
    public static int countDigits(String text) {
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isDigit(c)) {
                count++;
            }
        }
        return count;
    }


    // Part C
    /*
       Boolean flags are much simpler since it only needs to verify 1 of the conditions.
    */
    public static boolean isValidPassword(String password) {

        if (password == null || password.length() < 8) {
            return false;
        }
        boolean upper = false;
        boolean lower = false;
        boolean digit = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (Character.isUpperCase(c)) {
                upper = true;
            } else if (Character.isLowerCase(c)) {
                lower = true;
            } else if (Character.isDigit(c)) {
                digit = true;
            }
        }
        return upper && lower && digit;
    }

    // Part D
    public static int countUppercase(String text) {
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    // Part E
    public static String generateCode() {
        Random r = new Random();
        String allowed = "ABCDE";
        String code = "";

        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(5);
            code += allowed.charAt(index);

        }
        return code;
    }
}
    // Part G
    /*
       G1. If the String is a digit it will be true.
       G2. Return True.
       G3. Return False.
       G4. It's a boolean so not needed.
       G5. Return False.
    */

