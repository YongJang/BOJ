import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by USER on 2016-09-07.
 */
public class BOJ1932 {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        List<Integer> numList = new ArrayList<Integer>();

        for (int i = 0; i < N; i++) {
            String line = in.readLine();
            String[] lines = line.split(" ");
            for (int j = 0; j < lines.length; j++) {
                numList.add(Integer.parseInt(lines[j]));
            }
        }

        int start = 1;

        for (int i = 1; i <= N - 1; i++) {
            for (int j = start; j <= start + i; j++) {
                if (j == start + i) {
                    numList.set(j, numList.get(j - i - 1) + numList.get(j));
                } else if (j == start){
                    numList.set(j, numList.get(j - i) + numList.get(j));
                } else if (numList.get(j) + numList.get(j - i) > numList.get(j) + numList.get(j - i - 1)){
                    numList.set(j, numList.get(j - i) + numList.get(j));
                } else {
                    numList.set(j, numList.get(j - i - 1) + numList.get(j));
                }
            }
            start = start + i + 1;
        }

        int max = 0;

        for (int i = numList.size() - 1; i > numList.size() - N; i--) {
            if (numList.get(i) > max){
                max = numList.get(i);
            }
        }
        System.out.println(max);
    }
}
