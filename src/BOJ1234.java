import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by USER on 2016-12-21.
 */
public class BOJ1234 {
    public static long christmasTree(int n, int r, int g, int b) {
        if ((n * n + n) / 2 > r + g + b)
            return 0;
        if (n < 0 || r < 0 || g < 0 || b < 0)
            return 0;
        else {
            if (n % 3 == 0) {   // 1가지 색으로 채울 경우 + 3가지 색으로 채울 경우
                return n * (n - 1) * (n - 2) * (christmasTree(n - 1, r - n, g, b) + christmasTree(n - 1, r, g - n, b) + christmasTree(n - 1, r, g, b - n)
                        + christmasTree(n - 1, r - (n / 3), g - (n / 3), b - (n / 3)));
            }else if (n % 2 == 0) {     // 1가지 색으로 채울 경우 + 2가지 색으로 채울 경우
                return n * (n - 1) * (christmasTree(n - 1, r - n, g, b) + christmasTree(n - 1, r, g - n, b) + christmasTree(n - 1, r, g, b - n)
                        + christmasTree(n - 1, r - (n / 2), g - (n / 2), b) + christmasTree(n - 1, r - (n / 2), g, b - (n / 2)) + christmasTree(n - 1, r, g - (n / 2), b - (n / 2)));
            }else {     // 1가지 색으로 채울 경우
                return 1 + (christmasTree(n - 1, r - n, g, b) + christmasTree(n - 1, r, g - n, b)
                        + christmasTree(n - 1, r, g, b - n));
            }
        }
    }

    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        String strs[] = str.split("\\s");
        int N = Integer.parseInt(strs[0]);
        int red = Integer.parseInt(strs[1]);
        int green = Integer.parseInt(strs[2]);
        int blue = Integer.parseInt(strs[3]);

        System.out.println(christmasTree(N, red, green, blue));
    }
}
