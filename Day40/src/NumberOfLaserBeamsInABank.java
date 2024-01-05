public class NumberOfLaserBeamsInABank {
    public static void main(String[] args) {
        System.out.println(numberOfBeams(new String[] {"011001","000000","010100","001000"}));
    }
    public static int numberOfBeams(String[] bank) {
        int totalBeams = 0;
        int[] devices = new int[bank.length];
        for(int j = 0; j < bank.length; j++){
            for(int i = 0; i < bank[j].length(); i++){
                if (bank[j].charAt(i) == '1') {
                    devices[j]++;
                }
            }
        }
        int i = 0, j = 0;
        while (j < devices.length){
            if (i != j) {
                if (devices[i] > 0 && devices[j] > 0) {
                    totalBeams += devices[i] * devices[j];
                    i = j;
                } else if (devices[i] == 0 && devices[j] != 0) {
                    i = j;
                }
            }
            j++;
        }
        return totalBeams;
    }
}