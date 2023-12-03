//https://leetcode.com/problems/defanging-an-ip-address/
public class DefangingAnIpAddress {
    public static void main(String[] args) {
        System.out.println(defangIPaddr("255.100.50.0"));
    }
    public static String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        int j = 0;
        while (j < address.length()){
            if(address.charAt(j) == '.'){
                sb.append('[');
                sb.append('.');
                sb.append(']');
            }else{
                sb.append(address.charAt(j));
            }
            j++;
        }
        return new String(sb);
    }
}
