package 백준.Lv20_큐_덱;

import java.io.*;
import java.util.StringTokenizer;

public class No5_10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        CustomDeque customDeque = new CustomDeque();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if (command.equals("push_front")) {
                customDeque.push_front(Integer.parseInt(st.nextToken()));
            } else if (command.equals("push_back")) {
                customDeque.push_back(Integer.parseInt(st.nextToken()));
            } else if (command.equals("pop_front")) {
                bw.write(customDeque.pop_front() + "\n");
            } else if (command.equals("pop_back")) {
                bw.write(customDeque.pop_back() + "\n");
            } else if (command.equals("empty")) {
                bw.write(customDeque.empty() + "\n");
            } else if (command.equals("front")) {
                bw.write(customDeque.front() + "\n");
            } else if (command.equals("back")) {
                bw.write(customDeque.back() + "\n");
            } else if (command.equals("size")) {
                bw.write(customDeque.size() + "\n");
            }
        }

        bw.flush();
        bw.close();
    }
}


class CustomDeque {
    class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
        }
    }

    Node front;
    Node back;
    int size = 0;

    public void push_front(int item) {
        Node node = new Node(item);
        if (front == null) {
            front = node;
            back = front;
        } else {
            node.next = front;
            front.prev = node;
            front = node;
        }
        size++;
    }

    public void push_back(int item) {
        Node node = new Node(item);
        if (back == null) {
            back = node;
            front = back;
        } else {
            node.prev = back;
            back.next = node;
            back = node;
        }
        size++;
    }

    public int pop_front() {
        if (front == null) {
            back = null;
            return -1;
        }
        int data = front.data;
        front = front.next;
        size--;
        if (size == 0) {
            front = null;
            back = null;
        }
        return data;
    }

    public int pop_back() {
        if (back == null) {
            front = null;
            return -1;
        }
        int data = back.data;
        back = back.prev;
        size--;
        if (size == 0) {
            front = null;
            back = null;
        }
        return data;
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
        if (front == null)
            return -1;
        else
            return front.data;
    }

    public int back() {
        if (back == null)
            return -1;
        else
            return back.data;
    }
}
