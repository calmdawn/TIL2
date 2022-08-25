package 백준.백준기타;

import java.io.*;
import java.util.StringTokenizer;

public class No1991 {
    private static Node[] tree;
    private static StringBuffer sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        tree = new Node[N];
        sb = new StringBuffer();
        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            Node current = new Node(st.nextToken().charAt(0));
            current.left = st.nextToken().charAt(0) - 'A';
            current.right = st.nextToken().charAt(0) - 'A';
            tree[current.data - 'A'] = current;
        }
        preorder(0);
        sb.append("\n");
        inorder(0);
        sb.append("\n");
        postorder(0);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static void postorder(int current) {
        if (tree[current].data != '.') {
            if (tree[current].left > 0)
                postorder(tree[current].left);
            if (tree[current].right > 0)
                postorder(tree[current].right);
            sb.append(tree[current].data);
        }
    }

    private static void inorder(int current) {
        if (tree[current].data != '.') {
            if (tree[current].left > 0)
                inorder(tree[current].left);
            sb.append(tree[current].data);
            if (tree[current].right > 0)
                inorder(tree[current].right);
        }
    }

    private static void preorder(int current) {
        if (tree[current].data != '.') {
            sb.append(tree[current].data);
            if (tree[current].left > 0)
                preorder(tree[current].left);
            if (tree[current].right > 0)
                preorder(tree[current].right);
        }
    }

    private static class Node {
        char data;
        int left;
        int right;

        public Node(char data) {
            this.data = data;
        }
    }
}
