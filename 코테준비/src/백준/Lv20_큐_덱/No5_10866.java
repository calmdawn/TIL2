package 백준.Lv20_큐_덱;

import java.io.*;
import java.util.StringTokenizer;

public class No5_10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;


        bw.flush();
        bw.close();
    }
}


class CustomDeque {
    class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }

    Node front;
    Node back;
    int size = 0;

    public void push_front(int item){
        Node node = new Node(item);
        if(front == null){
            back = front;
        }
        node.next = front;
        front = node;
        size++;
    }

    public void push_back(int item){
        Node node = new Node(item);
        if(back == null){
            front = back;
        }
        back.next = node;
        back = node;
        size++;
    }

    public int pop_front(){
        if(front == null)
            return -1;
        int data = front.data;
        front = front.next;
        return data;
    }

    public int pop_back(){
        if(back == null)
            return -1;
        int data = back.data;
        front = front.next;
        return data;
    }

}
