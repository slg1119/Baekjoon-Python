import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 왜 틀렸는지 몰겠음; 설명좀
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        while ((input = br.readLine()) != null) {
            char[] str = input.toCharArray();

            int lowerCase = 0;
            int upperCase = 0;
            int number = 0;
            int blank = 0;

            for (char s : str) {
                if (Character.isLowerCase(s)) {
                    lowerCase++;
                } else if (Character.isUpperCase(s)) {
                    upperCase++;
                } else if (Character.isDigit(s)) {
                    number++;
                } else if (Character.isSpaceChar(s)) {
                    blank++;
                }
            }
            System.out.println(lowerCase + " " + upperCase + " " + number + " " + blank);
        }
    }
}
