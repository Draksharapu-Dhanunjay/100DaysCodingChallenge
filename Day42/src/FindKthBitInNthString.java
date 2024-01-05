
public class FindKthBitInNthString {
    public static void main(String[] args) {
        System.out.println(findKthBit(6, 1));
    }
    public static char findKthBit(int n, int k) {
        String s = binaryString("0", n);
        return s.charAt(k - 1);
    }
    public static String binaryString(String preS, int n){
        if(n == 1){
            return preS;
        }
        StringBuilder sb = new StringBuilder();
        if(preS.length() == 1){
            sb.append("1");
        }else{
            for(int i = preS.length() - 1; i >= 0; i--){
                if(preS.charAt(i) == '1'){
                    sb.append('0');
                }else{
                    sb.append('1');
                }
            }
        }
        return binaryString(preS + "1" + sb, n - 1);
    }
//    public static String reverse(String preS){
//        if(preS.length() == 1){
//            return "1";
//        }
//        StringBuilder sb = new StringBuilder();
//        for(int i = preS.length() - 1; i >= 0; i--){
//            if(preS.charAt(i) == '1'){
//                sb.append('0');
//            }else{
//                sb.append('1');
//            }
//        }
//        return sb.toString();
//    }
}