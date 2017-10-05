import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class 2057 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SortedMap<Integer, Integer> sm = new TreeMap<>();
        final int n = sc.nextInt();
        for (int i = 0; i < n; ++i){
            int q = sc.nextInt();
            if (q == 1){
                final int x = sc.nextInt();
                sm.put(x, sm.getOrDefault(x, 0) + 1);
            } else {
                int x = sm.firstKey();
                System.out.println(x);
                int val = sm.get(x) - 1;
                if (val == 0)
                    sm.remove(x);
                else
                    sm.put(x, val);
            }
        }
    }
}