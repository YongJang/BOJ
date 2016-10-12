import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * Created by USER on 2016-09-06.
 */
public class BOJ1764 {
    public static void main(String args[]) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        String strs[] = str.split(" ");
        int N = Integer.parseInt(strs[0]);
        int M = Integer.parseInt(strs[1]);
        String d[] = new String[N];
        String b[] = new String[M];

        List<String> dbList = new ArrayList<String>();
        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        for(int i = 0; i < N; i++){
            hm.put(in.readLine(), 0);
        }
        for(int i = 0; i < M; i++){
            String mm = in.readLine();
            if(hm.containsKey(mm)){
                dbList.add(mm);
            }
        }

        Collections.sort(dbList);
        System.out.println(dbList.size());
        for(int i = 0; i < dbList.size(); i++){
            System.out.println(dbList.get(i));
        }
    }
}
