import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;

/**
 * Created by USER on 2016-09-30.
 */
public class BOJ2846 {
    public static void main(String args[]) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        String str = in.readLine();
        String strs[] = str.split(" ");
        int num[] = new int[strs.length];
        for(int i = 0; i < strs.length;i++){
            num[i] = Integer.parseInt(strs[i]);
        }
        int max = num[0];
        int min = num[0];
        int result = 0;
        int t = 0;
        for(int i = 1; i < num.length; i++){
            if(max < num[i]){
                max = num[i];
                t = 1;
            }else if(max >= num[i]){
                if(result < max - min){
                    result = max - min;
                }
                max = num[i];
                min = num[i];
            }
        }
        if(result < max - min){
            result = max - min;
        }
        if(t == 1) {
            System.out.println(result);
        }
        else{
            System.out.println(0);
        }
    }
}
