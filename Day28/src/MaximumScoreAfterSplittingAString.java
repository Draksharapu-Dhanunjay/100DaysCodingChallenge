public class MaximumScoreAfterSplittingAString {
    public static void main(String[] args) {
        System.out.println(maxScore("00"));
    }
    public static int maxScore(String s) {
        int i = 0, n = s.length(), score = 0;
        while(i < n){
            int left = max(s, 0, i, '0');
            int right = max(s, i + 1, n - 1, '1');
            score = Math.max(score, left + right);
            i++;
        }
        return score;
    }
    public static int max(String s, int start, int end, char ch){
        if(start > end){
            return -1;
        }
        int count = 0;
        while(start <= end){
            if(s.charAt(start) == ch){
                count++;
            }
            start++;
        }
        return count;
    }
}
