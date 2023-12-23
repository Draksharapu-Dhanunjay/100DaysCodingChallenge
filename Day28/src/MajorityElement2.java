public class MajorityElement2 {
    public static void main(String[] args) {
        int[] nums = {6,5,5};
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        int element = nums[0], n = nums.length, count = 0;
        for (int num : nums) {
            if (num == element) {
                count++;
            } else {
                count--;
            }
            if(count == 0){
                element = num;
                count = 1;
            }
        }
        count = 0;
        for (int num : nums) {
            if (num == element) {
                count++;
            }
        }
        if(count > n / 2){
            return element;
        }
        return -1;
    }
}
