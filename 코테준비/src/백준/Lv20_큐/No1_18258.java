package 백준.Lv20_큐;

import java.io.*;
import java.util.StringTokenizer;

public class No1_18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        CustomQueue customQueue = new CustomQueue();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if (command.equals("push")) {
                customQueue.push(Integer.parseInt(st.nextToken()));
            } else if (command.equals("pop")) {
                bw.write(customQueue.pop() + "\n");
            } else if (command.equals("size")) {
                bw.write(customQueue.size() + "\n");
            } else if (command.equals("empty")) {
                bw.write(customQueue.empty() + "\n");
            } else if (command.equals("front")) {
                bw.write(customQueue.front() + "\n");
            } else if (command.equals("back")) {
                bw.write(customQueue.back() + "\n");
            }
        }

        bw.flush();
        bw.close();
    }
}

class CustomQueue {
    class Node {
        int data;
        Node next;

        public Node(int item) {
            this.data = item;
        }
    }

    Node front;
    Node back;
    int size = 0;

    public void push(int item) {
        Node node = new Node(item);
        if (back != null) {
            back.next = node;
        }
        back = node;
        if (front == null) {
            front = back;
        }
        size++;
    }

    public int pop() {
        if (front == null) {
            back = null;
            return -1;
        } else {
            int data = front.data;
            front = front.next;
            size--;
            if (size < 0)
                size = 0;
            return data;
        }
    }

    public int size() {
        return size;
    }

    public int empty() {
        if (size == 0)
            return 1;
        else
            return 0;
    }

    public int front() {
        if (size == 0)
            return -1;
        else
            return front.data;
    }

    public int back() {
        if (size == 0)
            return -1;
        else
            return back.data;
    }
}

