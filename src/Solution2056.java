import java.util.*;

public class Solution2056 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> cnt = new HashMap<>();
        while (sc.hasNext()){
            for (String s : sc.nextLine().split(" ")){
                if (s.isEmpty()) continue;
                String ls = s.toLowerCase();
                cnt.put(ls.toLowerCase(), cnt.getOrDefault(ls, 0) + 1);
            }
        }
        int x = cnt.values().stream().mapToInt(o -> o).max().getAsInt();
        cnt.entrySet().stream().filter(o -> o.getValue() == x).map(Map.Entry::getKey).sorted().forEach(System.out::println);
    }
}