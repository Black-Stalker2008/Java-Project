package Lesson2HW;

public class Task1 {

    public static void main(String[] args) {
        System.out.println(isPalindrome("казак")); // true
        System.out.println(isPalindrome("казан")); // false
    }

    private static boolean isPalindrome(String source) {
        String reversed = reverseIt(source);
        if (reversed.equalsIgnoreCase(source)) {
            return true;
        } else {
            return false;
        }
    }

    public static String reverseIt(String source) {
        int i, len = source.length();
        StringBuilder dest = new StringBuilder(len);

        for (i = (len - 1); i >= 0; i--) {
            dest.append(source.charAt(i));
        }

        return dest.toString();
    }
}
