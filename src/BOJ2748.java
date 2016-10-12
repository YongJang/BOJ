import java.util.Scanner;

/**
 * Created by USER on 2016-09-06.
 */
public class BOJ2748 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long F0 = 0;
        long F1 = 1;
        long F2 = 1;
        for (int i = 1; i < n; i++) {
                F2 = F0 + F1;
                F0 = F1;
                F1 = F2;
        }
        System.out.print(F2);
    }
}
