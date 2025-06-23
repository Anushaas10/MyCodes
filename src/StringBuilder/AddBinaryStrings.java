package StringBuilder;

public class AddBinaryStrings {
    public static void main(String[] args) {
        String a = "1101";
        String b = "111";
        System.out.println(addBinary(a, b)); // Output: 10100
    }

    static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        a= trimleadingzeroes(a);
        b= trimleadingzeroes(b);
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        int sum = 0;
        while (i >= 0 || j >= 0) {
            int bit1 = i >= 0 ? a.charAt(i--) - '0' : 0;
            int bit2 = j >= 0 ? b.charAt(j--) - '0' : 0;
            sum = bit1 + bit2 + carry;
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry > 0){
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
    static String trimleadingzeroes(String s) {
        int i=0;
        while(i<s.length() && s.charAt(i) == '0') {
            i++;
        }
        return i== s.length() ? "0" : s.substring(i);
    }
}
