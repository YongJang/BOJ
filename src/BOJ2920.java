import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by USER on 2016-09-18.
 */
public class BOJ2920 {
    public static void main(String args[]) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        String strs[] = str.split(" ");
        int nums[] = new int[strs.length];
        for(int i = 0; i < strs.length; i++){
            nums[i] = Integer.parseInt(strs[i]);
        }
        int isDescending = 0;
        int tmp = nums[0];

        for(int i = 1; i < nums.length; i++){
            if(nums[i] > tmp){
                tmp = nums[i];
            }else{
                tmp = nums[i];
                isDescending++;
            }
        }

        if(isDescending == 0){
            System.out.println("ascending");
        }else if(isDescending == 7){
            System.out.println("descending");
        }else{
            System.out.println("mixed");
        }
    }
}
