import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by USER on 2016-09-30.
 */
public class BOJ11718 {
    public static void main(String args[]) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String str = in.readLine();
            if(str == null)
                break;
            System.out.println(str);
        }
    }
}
