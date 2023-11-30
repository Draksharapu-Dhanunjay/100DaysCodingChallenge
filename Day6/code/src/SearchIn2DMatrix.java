//https://leetcode.com/problems/search-a-2d-matrix/description/
public class SearchIn2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        System.out.println(searchMatrix(matrix, target));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int rowStart = 0, colEnd = matrix[0].length - 1, rowEnd = matrix.length - 1;
        while(rowStart <= rowEnd){
            if(matrix[rowStart][0] <= target && target <= matrix[rowStart][colEnd]){
                return binarySearch(matrix[rowStart], target);
            }
            rowStart++;
        }
        return false;
    }
    static boolean binarySearch(int[] arr, int target){
        int start = 0, end = arr.length - 1;
        while(start <= end){
            int mid = (end - start)/2 + start;
            if(arr[mid] == target){
                return true;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return false;
    }
}
