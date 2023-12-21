//https://leetcode.com/problems/widest-vertical-area-between-two-points-containing-no-points/
import java.util.Arrays;
import java.util.Comparator;

public class WidestAreaBetweenTwoPointsInArray {
    public static void main(String[] args) {
        int[][] arr = {{3,1}, {9,0}, {1,0}, {1,4}, {5,3}, {8,8}};
        System.out.println(maxWidthOfVerticalArea(arr));
    }
    public static int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(a -> a[0]));
        int max_width = 0;
        for (int i = 1; i < points.length; i++) {
            int width = points[i][0] - points[i - 1][0];
            max_width = Math.max(max_width, width);
        }
        return max_width;
    }
}