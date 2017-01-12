import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by USER on 2017-01-13.
 */
public class BOJ10845 {
    public static void main (String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(in.readLine());
        MyQueue myQueue = new MyQueue();
        for (int i = 0; i < num; i++) {
            String order = in.readLine();
            if (order.contains("push")) {
                String orderSplit[] = order.split("\\s+");
                int n = Integer.parseInt(orderSplit[1]);
                myQueue.push(n);
            } else if (order.contains("front")) {
                System.out.println(myQueue.front());
            } else if (order.contains("back")) {
                System.out.println(myQueue.back());
            } else if (order.contains("size")) {
                System.out.println(myQueue.size());
            } else if (order.contains("empty")) {
                System.out.println(myQueue.empty());
            } else if (order.contains("pop")) {
                System.out.println(myQueue.pop());
            }
        }
    }
    public static class MyQueue {
        private int array[];
        private int back;
        private int front;
        private int size;

        public MyQueue() {
            array = new int[10000];
            back = -1;
            front = 0;
            size = 0;
        }

        public void push(int x) {
            array[++back] = x;
            size++;
        }

        public int pop() {
            if (size <= 0) {
                return -1;
            }
            size--;
            return array[front++];
        }

        public int size() {
            return size;
        }

        public int empty() {
            if (size > 0) {
                return 0;
            } else {
                return 1;
            }
        }

        public int front() {
            if (size <= 0) {
                return -1;
            } else {
                return array[front];
            }
        }

        public int back() {
            if (size <= 0) {
                return -1;
            } else {
                return array[back];
            }
        }
    }
}
