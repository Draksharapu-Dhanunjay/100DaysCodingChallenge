//https://leetcode.com/problems/special-positions-in-a-binary-matrix/description
public class SpecialPositionInABBinaryMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1,0,0}, {0,0,1}, {1,0,0}};
        System.out.println(numSpecial(mat));
    }
    public static int numSpecial(int[][] mat) {
        int n = mat[0].length;
        int count = 0;
        for (int[] value : mat) {
            int index = -1, temp = 0;
            for (int col = 0; col < n; col++) {
                if (value[col] == 1) {
                    index = col;
                    temp++;
                }
            }
            if (temp == 1) {
                int curCount = 0;
                for (int[] ints : mat) {
                    if (ints[index] == 1) {
                        curCount++;
                    }
                }
                if (curCount == 1) {
                    count++;
                }
            }
        }
        return count;
    }
}
