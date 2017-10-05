import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Solution pow = new Solution();
        pow.sum();
    }

    public void sum() {
        Scanner scan = new Scanner(System.in);
        int n, a, s;
        s = 0;
        n = scan.nextInt();
        for(int i = 1; i <= n; i++) {
            a = scan.nextInt();
            for (int j = 0; j <= Math.sqrt(i)+1; j++) {
                if (Math.pow(2, j) == i) {
                    s = s + a;
                    break;
                }
            }
        }
        System.out.println(s);
    }
}