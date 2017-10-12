import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1002 {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        int x1, x2, y1, y2, r1, r2;
        for (int i = 0; i < t; i++) {
            int result = 0;
            String str = in.readLine();
            String strs[] = str.split("\\s+");
            x1 = Integer.parseInt(strs[0]);
            y1 = Integer.parseInt(strs[1]);
            r1 = Integer.parseInt(strs[2]);
            x2 = Integer.parseInt(strs[3]);
            y2 = Integer.parseInt(strs[4]);
            r2 = Integer.parseInt(strs[5]);
            double distance = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
            if (x1 == x2 && y1 == y2 && r1 == r2) {
                result = -1;
                System.out.println(result);
                continue;
            }
        }
    }
}
