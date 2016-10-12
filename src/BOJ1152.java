import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by USER on 2016-10-10.
 */
public class BOJ1152 {
    public static void main(String args[]) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String string = in.readLine();
        string = string.trim();
        string = string.replaceAll("\n","");
        boolean b = true;
        if(string.length() < 1){
            b = false;
        }
        String[] strs = string.split("\\s+");
        if(b){
            System.out.print(strs.length);
        }else{
            System.out.print(0);
        }
    }
}
