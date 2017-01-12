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
        while (n > 0) {
            if (n % 5 == 0) {
                count += n / 5;
                break;
            } else {
                n = n - 3;
                count++;
            }
            if (n == 0) {
                break;
            }
            if (n < 0) {
                count = -1;
                break;
            }
        }
        System.out.println(count);
    }
}
