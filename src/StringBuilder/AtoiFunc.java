package StringBuilder;

public class AtoiFunc {
    public static void main(String[] args) {
        String s = "-123";
        System.out.println(myAtoi(s));
    }

    static int myAtoi(String s) {
        int idx = 0, sign = 1, res = 0;
        while (idx < s.length() && s.charAt(idx) == ' ') {
            idx++;
        }
// Store the sign of number
        if (idx < s.length() && (s.charAt(idx) == '-'
                || s.charAt(idx) == '+')) {
            if (s.charAt(idx++) == '-') {
                sign = -1;
            }
        }
// Construct the number digit by digit
        while (idx < s.length() && s.charAt(idx) >= '0' && s.charAt(idx) <= '9') {

            // Handling overflow/underflow test case
            if (res > Integer.MAX_VALUE/10|| (res == Integer.MAX_VALUE/10 )) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            // Append current digit to the result
            res = 10 * res + (s.charAt(idx++) - '0');
        }
        return res * sign;
    }
}
