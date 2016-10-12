import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by USER on 2016-09-18.
 */
public class BOJ13199 {
    public static void main(String args[]) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(in.readLine());
        for(int i = 0; i < T; i++){
            String string = in.readLine();
            String strs[] = string.split(" ");
            int price = Integer.parseInt(strs[0]);
            int money = Integer.parseInt(strs[1]);
            int couponNeed = Integer.parseInt(strs[2]);
            int couponGet = Integer.parseInt(strs[3]);

            int sang = 0;
            int dooyeong = 0;

            dooyeong = dooyeong + money / price;
            int couponNew = (money / price) * couponGet;
            dooyeong = dooyeong + (couponNew / couponNeed);

            sang = sang + money / price;
            int couponLast = couponNew;

            while(couponLast >= couponNeed){
                int quotient = couponLast / couponNeed;
                sang = sang + quotient;
                couponLast = couponLast - (quotient * couponNeed);
                couponLast = couponLast + (quotient * couponGet);
            }

            System.out.println(sang - dooyeong);
        }
    }
}
