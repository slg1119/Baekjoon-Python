import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String target = scanner.next();
        String bomb = scanner.next();
        int blength = bomb.length();
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        boolean find;

        for (int i = 0; i < target.length(); i++) {
            stack.push(target.charAt(i));
            if (stack.size() >= blength) {
                find = true;
                for (int j = blength; j > 0; j--) {
                    if (!stack.get(stack.size() - j).equals(bomb.charAt(bomb.length() - j))) {
                        find = false;
                        break;
                    }
                }
                if (find) {
                    for (int j = 0; j < blength; j++) {
                        stack.pop();
                    }
                }
            }
        }
        for (Character c : stack) {
            result.append(c);
        }

        System.out.println(result.length() != 0 ? result : "FRULA");
    }
}