import java.util.Scanner;

/**
 * Created by USER on 2016-09-12.
 * 미해결
 */
public class BOJ1463 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int min = -1;
        int n;
        int s;
        for(int i = 0; i <= 2; i++) {
            n = num;
            s = 0;
            if (n > 3) {
                n = n - i;
                s = s + i;
            }
            while (n != 1) {
                if (n % 3 == 0) {
                    n = n / 3;
                    s++;
                    continue;
                }
                if (n % 2 == 0) {
                    n = n / 2;
                    s++;
                    continue;
                }
                if (n == 1) {
                    break;
                } else {
                    n--;
                    s++;
                }
            }
            if(min < 0){
                min = s;
            }else if(s < min){
                min = s;
            }
        }
        System.out.println(min);
    }
}
