//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
public class PeakIndexInAMountainArray {
    public static void main(String[] args) {
        int[] arr = {3,5,3,2,0};
        System.out.println(peakIndexInMountainArray(arr));
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start <= end){
            int mid = (end - start)/2 + start;
            if(mid == 0){
                return mid + 1;
            }
            if(mid == arr.length - 1){
                return mid;
            }
            if(mid < arr.length - 1 && arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                return mid;
            }
            if(mid < arr.length - 1 && arr[mid] > arr[mid - 1] && arr[mid + 1] > arr[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
