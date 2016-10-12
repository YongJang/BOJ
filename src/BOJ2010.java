import java.util.Scanner;

/**
 * Created by USER on 2016-09-12.
 */
public class BOJ2010 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int m[] = new int[N];
        for(int i = 0; i < N; i++){
            m[i] = scanner.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < N - 1; i++){
            sum += m[i] - 1;
        }
        sum += m[N - 1];

        System.out.println(sum);
    }
}
