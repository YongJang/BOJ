import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Administrator on 2017-01-03.
 */
public class BOJ10430 {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        String strs[] = str.split("\\s");
        int a = Integer.parseInt(strs[0]);
        int b = Integer.parseInt(strs[1]);
        int c = Integer.parseInt(strs[2]);

        System.out.println((a + b) % c);
        System.out.println((a % c + b % c) %c);
        System.out.println((a * b) % c);
        System.out.println((a % c * b % c) % c);
    }
}
