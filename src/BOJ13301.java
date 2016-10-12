import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by USER on 2016-10-08.
 */
public class BOJ13301 {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        long num[] = new long[80];
        for(int i = 0; i < num.length; i++){
            num[i] = 0;
        }
        num[0] = 1;
        num[1] = 2;
        for(int i = 2; i < n; i++){
            num[i] = num[i - 2] + num[i - 1];
        }
        long result;
        if(n > 1){
            result = (num[n - 1] * 2 ) + (num[n - 2] * 2);
        }else{
            result = 4;
        }
        System.out.println(result);
    }
}
