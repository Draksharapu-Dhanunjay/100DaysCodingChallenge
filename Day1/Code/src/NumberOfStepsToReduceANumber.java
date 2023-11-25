public class NumberOfStepsToReduceANumber {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }
    public static int numberOfSteps(int num) {
        return steps(num, 0);
    }
    public static int steps(int num, int steps){
        if(num == 0){
            return steps;
        }
        if(num % 2 == 0){
            return steps(num/2,steps + 1);
        }
        else{
            return steps(num- 1, steps + 1);
        }
    }
}
