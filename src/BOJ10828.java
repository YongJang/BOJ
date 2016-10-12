import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by USER on 2016-09-19.
 */
public class BOJ10828 {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        MyStack ms = new MyStack(N);
        for(int i = 0; i < N; i++){
            String command = in.readLine();
            String strs[] = command.split(" ");
            if(strs[0].equals("push")){
                ms.push(Integer.parseInt(strs[1]));
            }else if(strs[0].equals("top")){
                System.out.println(ms.getTop());
            }else if(strs[0].equals("size")){
                System.out.println(ms.getSize());
            }else if(strs[0].equals("pop")){
                System.out.println(ms.pop());
            }else if(strs[0].equals("empty")){
                ms.isEmpty();
            }
        }
    }
}

class MyStack{
    private int st[];
    private int size;
    private int top;
    public MyStack(){
        this.st = new int[10000];
        this.size = 10000;
        this.top = -1;
    }
    public MyStack(int n){
        this.st = new int[n];
        this.size = n;
        this.top = -1;
    }

    int pop(){
        if(top != -1){
            return st[top--];
        }else{
            return -1;
        }
    }
    void push(int n){
        if(top < size){
            st[++top] = n;
        }else{
            System.out.println("stack is full");
        }
    }
    void isEmpty(){
        if(top < 0){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
    int getSize(){
        return top + 1;
    }
    int getTop(){
        if(top != -1){
            return st[top];
        }else{
            return -1;
        }
    }
}
