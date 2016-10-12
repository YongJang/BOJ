import java.util.Scanner;

/**
 * Created by USER on 2016-09-06.
 */
public class BOJ2444 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int s = 0;
        for(int i = 0; i < N; i++, s++){
            for(int j = 1; j <= N + s; j++) {
                if (j < N - s)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
        s = s - 2;

        for(int i = 0; i < N - 1; i++, s--){
            for(int j = 1; j <= N + s; j++){
                if (j < N - s)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            if(s != 0)
                System.out.println();
        }
    }
}
