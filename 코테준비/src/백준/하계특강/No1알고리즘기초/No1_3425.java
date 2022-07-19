package 백준.하계특강.No1알고리즘기초;

import java.io.*;
import java.util.ArrayList;

public class No1_3425 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sbResult = new StringBuilder();
        mainLoop:
        while (true) {

            ArrayList<String> commandList = new ArrayList<>();
            while (true) {
                String[] commands = br.readLine().split(" ");

                if (commands[0].equals("QUIT"))
                    break mainLoop;

                if (commands[0].equals("END")) {
                    commandList.add(commands[0]);
                    break;
                }

                if (commands[0].equals("NUM")) {
                    commandList.add(commands[0]);
                    commandList.add(commands[1]);
                } else
                    commandList.add(commands[0]);
            }

            int cmdCnt = Integer.parseInt(br.readLine());

            for (int i = 0; i < cmdCnt; i++) {
                int startNum = Integer.parseInt(br.readLine());
                GoStack goStack = new GoStack();
                goStack.num_x(startNum);
                boolean isState = true;

                for (int j = 0; j < commandList.size(); j++) {
                    String command = commandList.get(j);

                    if (command.equals("END"))
                        break;

                    if (command.equals("NUM"))
                        goStack.num_x(Integer.parseInt(commandList.get(++j)));
                    else if (command.equals("POP")) {
                        if (goStack.size > 0)
                            goStack.pop();
                        else
                            isState = false;
                    } else if (command.equals("INV"))
                        isState = goStack.inv();
                    else if (command.equals("DUP"))
                        isState = goStack.dup();
                    else if (command.equals("SWP"))
                        isState = goStack.swp();
                    else if (command.equals("ADD"))
                        isState = goStack.add();
                    else if (command.equals("SUB"))
                        isState = goStack.sub();
                    else if (command.equals("MUL"))
                        isState = goStack.mul();
                    else if (command.equals("DIV"))
                        isState = goStack.div();
                    else if (command.equals("MOD"))
                        isState = goStack.mod();

                    if (isState == false)
                        break;
                }

                if (isState == false || goStack.size != 1)
                    sbResult.append("ERROR").append("\n");
                else
                    sbResult.append(goStack.top.data).append("\n");
            }
            sbResult.append("\n");
        }

        bw.write(sbResult.toString());
        bw.flush();
        bw.close();
    }

    private static class GoStack {
        Node top = null;
        int size = 0;

        public GoStack() {
        }

        public void num_x(int data) {
            Node node = new Node(data);

            if (top == null)
                top = node;
            else {
                node.next = top;
                top = node;
            }
            size++;
        }

        public int pop() {
            int data = top.data;
            top = top.next;
            size--;
            return data;
        }

        public boolean inv() {
            if (size < 1)
                return false;
            num_x(pop() * -1);
            return true;
        }

        public boolean dup() {
            if (size < 1)
                return false;
            num_x(top.data);
            return true;
        }

        public boolean swp() {
            if (size < 2)
                return false;
            int firstNum = pop();
            int secondNum = pop();

            num_x(firstNum);
            num_x(secondNum);
            return true;
        }

        public boolean add() {
            if (size < 2)
                return false;

            int firstNum = pop();
            int secondNum = pop();
            if (!checkRange(firstNum + secondNum))
                return false;
            num_x(firstNum + secondNum);
            return true;
        }

        private boolean checkRange(long num) {
            if (Math.abs(num) > 1000000000)
                return false;
            return true;
        }

        public boolean sub() {
            if (size < 2)
                return false;

            int firstNum = pop();
            int secondNum = pop();
            if (!checkRange(secondNum - firstNum))
                return false;
            num_x(secondNum - firstNum);
            return true;
        }

        public boolean mul() {
            if (size < 2)
                return false;

            long mulNum = (long) pop() * pop();
            if (mulNum < Integer.MIN_VALUE || mulNum > Integer.MAX_VALUE || !checkRange(mulNum)) {
                return false;
            } else {
                num_x((int) mulNum);
                return true;
            }
        }

        public boolean div() {
            if (size < 2)
                return false;

            int firstNum = pop();
            int secondNum = pop();
            if (firstNum == 0)
                return false;
            num_x(secondNum / firstNum);
            return true;
        }

        public boolean mod() {
            if (size < 2)
                return false;

            int firstNum = pop();
            int secondNum = pop();
            if (firstNum == 0)
                return false;
            num_x(secondNum % firstNum);
            return true;
        }
    }

    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

}
