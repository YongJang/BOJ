import java.util.Scanner;

/**
 * Created by USER on 2016-09-06.
 */
public class BOJ2750 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int number[] = new int[N];
        for(int i = 0; i < N; i++){
            number[i] = scanner.nextInt();
        }
        int tmp;
        for(int i = 0; i < number.length; i++){
            for(int j = i+1; j < number.length; j++){
                if(number[i] > number[j]){
                    tmp = number[i];
                    number[i] = number[j];
                    number[j] = tmp;
                }
            }
        }

        for(int i = 0; i < number.length; i++){
            System.out.println(number[i]);
        }
    }
}
