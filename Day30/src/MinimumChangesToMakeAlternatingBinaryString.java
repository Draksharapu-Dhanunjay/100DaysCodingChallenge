public class MinimumChangesToMakeAlternatingBinaryString {
    public static void main(String[] args) {
        System.out.println(minOperations("110010"));
    }
    public static int minOperations(String s) {
        int[] even = {0, 0};
        int[] odd = {0, 0};
        int len = s.length();
        for(int i = 0; i < len; i++){
            if(i % 2 == 0){
                if(s.charAt(i) == '0'){
                    even[0]++;
                }else{
                    even[1]++;
                }
            }else{
                if(s.charAt(i) == '0'){
                    odd[0]++;
                }else{
                    odd[1]++;
                }
            }
        }
        if(even[0] + odd[1] >= even[1] + odd[0]){
            return len - (even[0] + odd[1]);
        }else if(even[0] + odd[1] == len){
            return 0;
        }
        return len - (odd[0] + even[1]);
    }
}