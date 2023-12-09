//https://leetcode.com/problems/make-three-strings-equal/submissions/1115676713/
public class MakeThreeStringEquals {
    public static void main(String[] args) {
        System.out.println(findMinimumOperations("b", "aba", "aaccaa"));
    }
    public static int findMinimumOperations(String s1, String s2, String s3) {
        int i = 0, j = 0, k = 0;
        int str1 = s1.length(), str2 = s2.length(), str3 = s3.length();
        while(i < str1 && j < str2 && k < str3){
            if(s1.charAt(i) != s2.charAt(j) || s2.charAt(j) != s3.charAt(k)){
                if(i == 0 && j == 0 && k == 0){
                    return -1;
                }else{
                    break;
                }
            }
            i++;
            j++;
            k++;
        }
        return str1 - i + str2 - j + str3 - k;
    }
}
