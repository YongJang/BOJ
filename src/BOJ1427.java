import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by USER on 2017-01-13.
 */
public class BOJ1427 {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < str.length(); j++) {
                if(String.valueOf(str.charAt(j)).equals(String.valueOf(i))) {
                    System.out.print(str.charAt(j));
                }
            }
        }
    }
}
