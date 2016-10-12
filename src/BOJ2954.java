import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by USER on 2016-09-08.
 */
public class BOJ2954 {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        str = str.replaceAll("apa","a");
        str = str.replaceAll("epe","e");
        str = str.replaceAll("ipi","i");
        str = str.replaceAll("opo","o");
        str = str.replaceAll("upu","u");
        System.out.println(str);
    }
}
