import java.util.Scanner;
import java.util.Stack;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        Stack<Integer> stack = new Stack<Integer>();

        int cnt = sc.nextInt();

        for (int i = 0; i < cnt; i++) {
            String str = sc.next();

            if (str.contains("push")) {
                int num = sc.nextInt();
                stack.push(num);
            } else if (str.equals("pop")) {
                if (!stack.isEmpty()) {
                    sb.append(stack.pop() + "\n");
                } else {
                    sb.append(-1 + "\n");
                }
            } else if (str.equals("size")) {
                sb.append(stack.size() + "\n");
            } else if (str.equals("empty")) {
                if (!stack.isEmpty()) {
                    sb.append(0 + "\n");
                } else {
                    sb.append(1 + "\n");
                }
            } else if (str.equals("top")) {
                if (!stack.isEmpty()) {
                    sb.append(stack.peek() + "\n");
                } else {
                    sb.append(-1 + "\n");
                }
            }
        }
        System.out.println(sb);
    }
}
