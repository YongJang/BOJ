import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Administrator on 2017-01-03.
 */
public class BOJ2839 {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int count = 0;
        while(n > 0) {
            boolean isStillDivide = false;
            if (n % 15 == 0) {
                count += (n / 15) * 3;
                n = n - ((n / 15) * 15);
                isStillDivide = true;
            } else if (n % 5 == 0) {
                count += (n / 5);
                n = n - ((n / 5) * 5);
                isStillDivide = true;
            } else if (n % 3 == 0) {
                count += (n / 3);
                n = n - ((n / 3) * 3);
                isStillDivide = true;
            } else if (n > 5) {
                n = n - 3;
                count += 1;
                isStillDivide = true;
            }
            if (!isStillDivide || n < 0) {
                count = -1;
                break;
            }
        }
        System.out.println(count);
    }
}
