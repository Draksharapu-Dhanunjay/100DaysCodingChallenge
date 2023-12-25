public class NumberDecoding {
    public static void main(String[] args) {
        System.out.println(numDecodings("11106"));
    }
    public static int numDecodings(String s) {
        return recursiveDecode(s, 0);
    }

    public static int recursiveDecode(String s, int index) {
        if (index == s.length()) {
            return 1;
        }

        if (s.charAt(index) == '0') {
            return 0;
        }
        int ways = recursiveDecode(s, index + 1);
        if (index + 1 < s.length() && Integer.parseInt(s.substring(index, index + 2)) <= 26) {
            ways += recursiveDecode(s, index + 2);
        }
        return ways;
    }
}