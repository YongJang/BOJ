import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by USER on 2016-09-30.
 */
public class BOJ10871 {
    public static void main(String args[]) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str1 = in.readLine();
        String strs1[] = str1.split(" ");
        int n = Integer.parseInt(strs1[0]);
        int x = Integer.parseInt(strs1[1]);
        String str2 = in.readLine();
        String strs2[] = str2.split(" ");
        int num[] = new int[strs2.length];
        for(int i = 0; i < strs2.length; i++){
            num[i] = Integer.parseInt(strs2[i]);
        }
        ArrayList<Integer> array = new ArrayList<Integer>();
        for(int i = 0 ; i < num.length; i++){
            if(num[i] < x){
                array.add(num[i]);
            }
        }
        for(int i = 0; i < array.size(); i++){
            System.out.print(array.get(i) + " ");
        }
    }
}
