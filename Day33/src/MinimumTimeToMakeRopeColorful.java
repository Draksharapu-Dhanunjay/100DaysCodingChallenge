public class MinimumTimeToMakeRopeColorful {
    public static void main(String[] args) {
        System.out.println(minCost("aabaa", new int[] {1,2,3,4,1}));
    }
    public static int minCost(String colors, int[] neededTime) {
        if(colors.length() < 2){
            return 0;
        }
        int i = 0, j = 1, n = colors.length(), totalTime = 0;
        while(j < n){
            if(colors.charAt(i) == colors.charAt(j)){
                if(j == n - 1){
                    totalTime = totalTime + cost(colors, neededTime, i , j + 1);
                    i = j;
                }
            }else if(colors.charAt(i) != colors.charAt(j)){
                totalTime = totalTime + cost(colors, neededTime, i , j);
                i = j;
            }
            j++;
        }
        return totalTime;
    }
    public static int cost(String colors, int[] neededTime, int start, int end){
        if(colors.charAt(start) != colors.charAt(end - 1)){
            return 0;
        }
        int total = 0, max = 0;
        for(int i = start; i < end; i++){
            max = Math.max(neededTime[i], max);
            total += neededTime[i];
        }
        return total - max;
    }
}