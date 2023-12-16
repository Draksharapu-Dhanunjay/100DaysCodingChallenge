class FindUnique {
    public static void main(String[] args) {
        String[] nums = {"000","011","110"};
        System.out.println(findDifferentBinaryString(nums));
    }
    public static String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        return stringFind("", "01", nums, n);
    }
    public static String stringFind(String p, String up, String[] nums, int n){
        if(p.length() == n){
            for(int i = 0; i < n; i++){
                if(p.equals(nums[i])){
                    return "";
                }
            }
            return p;
        }
        String left = stringFind(p + up.charAt(0), "01", nums, n);
        if(!left.equals("")){
            return left;
        }
        return stringFind(p + up.charAt(1), "01", nums, n);
    }
}
