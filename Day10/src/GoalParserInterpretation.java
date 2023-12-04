//https://leetcode.com/problems/goal-parser-interpretation/
public class GoalParserInterpretation {
    public static void main(String[] args) {
        System.out.println(interpret("G()(al)"));
    }
    public static String interpret(String command) {
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while (i < command.length()){
            if(command.charAt(i) == 'G'){
                sb.append('G');
                i++;
            }else if(command.charAt(i) == '('){
                i++;
                if(command.charAt(i) == ')'){
                    sb.append('o');
                    i++;
                }else{
                    sb.append('a');
                    sb.append('l');
                    i = i + 3;
                }
            }
        }
        return new String(sb);
    }
}