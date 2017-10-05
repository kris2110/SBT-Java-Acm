import java.util.ArrayList;
import java.util.Scanner;

public class Solution2029 {

    public static void main(String[] args) {
        Solution avg = new Solution();
        avg.min();
    }

    public void min() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        int min = 1000, num = 0;
        for (int i = 0; i < n; i++) {
            a.add(scan.nextInt());
        }
        for (int i = 0; i < n; i++) {
            if (a.get(i) < min) {
                min = a.get(i);
            }
        }
        for (int i = 0; i < n; i++) {
            if (a.get(i) == min) {
                num++;
                b.add(i+1);
            }
        }
        if (num % 2 == 0) {
            System.out.print(b.get(num / 2 - 1));
        }
        else System.out.print(b.get(num / 2));
    }
}