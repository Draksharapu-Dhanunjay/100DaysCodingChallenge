//https://leetcode.com/problems/shuffle-string/description/
public class ShuffleString {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s, indices));
    }
    public static String restoreString(String s, int[] indices) {
//        StringBuilder sb = new StringBuilder();
//        int count = 0, i = 0;
//        while (count < indices.length){
//            if(count == indices[i]){
//                sb.append(s.charAt(i));
//                count++;
//            }
//            i++;
//            if(i == indices.length){
//                i = 0;
//            }
//        }
//        return new String(sb);
        char ans[] = new char[indices.length];
        for(int i=0;i<indices.length;i++){
            ans[indices[i]] = s.charAt(i);
        }
        return new String(ans);
    }
}
