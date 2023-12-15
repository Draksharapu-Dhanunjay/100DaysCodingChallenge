//https://leetcode.com/problems/destination-city
import java.util.ArrayList;
import java.util.List;

public class DestinationCity {
    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        list1.add("London");
        list1.add("New York");
        List<String> list2 = new ArrayList<>();
        list2.add("New York");
        list2.add("Lima");
        List<String> list3 = new ArrayList<>();
        list3.add("Lima");
        list3.add("Sao Paulo");
        list.add(list1);
        list.add(list2);
        list.add(list3);
        System.out.println(destCity(list));
    }
    public static String destCity(List<List<String>> paths) {
        String city = paths.get(0).get(1);
        int i = 0;
        while (i < paths.size()){
            if(city.equals(paths.get(i).get(0))){
                city = paths.get(i).get(1);
                i = 0;
            }
            i++;
        }
        return city;
    }
}