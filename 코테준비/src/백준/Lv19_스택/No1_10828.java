package 백준.Lv19_스택;

import java.io.*;
import java.util.StringTokenizer;

public class No1_10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;

        Stack stack = new Stack();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if (command.equals("push"))
                stack.push(Integer.parseInt(st.nextToken()));
            else if (command.equals("pop"))
                bw.write(stack.pop() + "\n");
            else if (command.equals("size"))
                bw.write(stack.size() + "\n");
            else if (command.equals("empty"))
                bw.write(stack.empty() + "\n");
            else if (command.equals("top"))
                bw.write(stack.top() + "\n");
        }

        bw.flush();
        bw.close();
    }
}

class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }
}

class Stack {
    private Node top;

    public void push(int item) {
        Node node = new Node(item);
        node.next = top;
        top = node;
    }

    public int pop() {
        if (top == null) {
            return -1;
        }
        int item = top.data;
        top = top.next;
        return item;
    }

    public int size() {
        int size = 0;
        Node node = top;
        while (node != null) {
            size++;
            node = node.next;
        }
        return size;
    }

    public int empty() {
        if (top == null)
            return 1;
        else
            return 0;
    }

    public int top() {
        if (top == null)
            return -1;
        else
            return top.data;
    }
}