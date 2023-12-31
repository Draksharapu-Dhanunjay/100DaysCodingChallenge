
public class StringCompression1 {
    public static void main(String[] args) {
        System.out.println(compress(new char[] {'a','b','c'}));
    }
    public static int compress(char[] chars) {
        if(chars.length == 1){
            return 1;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0, n = chars.length;
        while (j < n){
            if(chars[i] == chars[j]){
                j++;
            }else{
                sb.append(chars[i]);
                if(j - i > 1){
                    sb.append(j - i);
                }
                i = j;
            }
            if(j == n){
                sb.append(chars[i]);
                if(j - i > 1){
                    sb.append(j - i);
                }
            }
        }
        for(int index = 0; index < sb.length(); index++){
            chars[index] = sb.charAt(index);
        }
        return sb.length();
    }
}