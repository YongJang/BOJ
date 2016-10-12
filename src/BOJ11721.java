import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by USER on 2016-09-18.
 */
public class BOJ11721 {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        int len = str.length();
        for(int i = 0; i < len / 10 + 1; i++){
            if((i + 1) * 10 < len){
                System.out.println(str.substring(i * 10, (i + 1) * 10));
            }else{
                System.out.println(str.substring(i * 10, len));
            }

        }

    }
}
