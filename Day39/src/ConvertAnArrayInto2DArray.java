import java.util.ArrayList;
import java.util.List;

public class ConvertAnArrayInto2DArray {
    public static void main(String[] args) {
        System.out.println(findMatrix(new int[] {1,2,3,4}));
    }
    public static List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length;
        int[] track = new int[n + 1];
        for (int num : nums) {
            track[num]++;
        }
        matrix(list, track);
        return list;
    }
    public static void matrix(List<List<Integer>> list, int[] track){
        List<Integer> temp = new ArrayList<>();
        boolean isEmpty = true;
        for(int num: track){
            if(num != 0){
                isEmpty = false;
                break;
            }
        }
        if(isEmpty){
            return;
        }
        for(int i = 0; i < track.length; i++){
            if(track[i] > 0){
                temp.add(i);
                track[i]--;
            }
        }
        list.add(temp);
        matrix(list, track);
    }
}