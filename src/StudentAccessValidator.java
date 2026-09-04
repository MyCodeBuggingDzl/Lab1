import java.util.Random;


public class StudentAccessValidator {
        public static void main(String[] args) {
                System.out.println(isValidStudentId("V123456"));
                System.out.println(isValidPassword("12345Vv"));
                System.out.println(generateAccessCode());
                System.out.println(isValidAccess("V123456", "12345Vv"));
}
        public  static boolean isValidStudentId(String id) {
                if (id.length() != 7) {
                        return false;
                }
                if (id.charAt(0) != 'V') {
                        return false;
                }
                for (int i = 1; i < id.length(); i++){
                        return false;
                }
                return true;

        }


        public  static boolean isValidPassword(String password) {
                boolean upper = false;
                boolean lower = false;
                boolean digit = false;

                for (int i = 0; i < password.length(); i++) {
                        char c = password.charAt(i);
                        if(Character.isUpperCase(c)) {
                                upper = true;
                        }
                        else if (Character.isLowerCase(c)) {
                                lower = true;
                        }
                        else if (Character.isDigit(c)) {
                                digit = true;
                        }
                }
                return upper && lower && digit;
        }

        public  static String generateAccessCode() {
                String allowed = "ABCDE";
                Random rand = new Random();

                String code = "";

                for (int i = 0; i < 4; i++) {
                        int index = rand.nextInt(5);
                        code += allowed.charAt(index);
                }
                return code;
        }

        public  static boolean isValidAccess(
                String id,
                String password) {
        return isValidPassword(password) && isValidStudentId(id);
        }
}
