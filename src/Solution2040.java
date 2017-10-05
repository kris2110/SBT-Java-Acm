import java.util.Scanner;

public class Solution2040 {

    public static void main(String[] args) {
        Solution s = new Solution();
        s.min();
    }

    public void min() {
        Scanner scan = new Scanner(System.in);
        String buf, res;
        buf = scan.nextLine();
        res = buf;
        for(int i = 0; i < buf.length(); i++) {
            if ((buf.substring(i)+buf.substring(0, i)).compareTo(res) < 0) {
                res = buf.substring(i)+buf.substring(0, i);
            }
        }
        System.out.println(res);
    }

}