import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by USER on 2016-09-12.
 */
public class BOJ1929 {
    public static void main(String args[]) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String string = in.readLine();
        String strs[] = string.split(" ");
        int M = Integer.parseInt(strs[0]);
        int N = Integer.parseInt(strs[1]);

        int[] arr = new int[N + 1];

        for(int i = 2; i <= N; i++){
            arr[i] = i;
        }
        for(int i = 2; i <= N; i++){
            if(arr[i] == 0)
                continue;
            for(int j = i + i; j <= N; j += i){
                arr[j] = 0;
            }
        }

        for(int i = M; i <= N; i++){
            if(arr[i] != 0)
                System.out.println(arr[i]);
        }
    }
}
