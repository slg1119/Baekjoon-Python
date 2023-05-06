import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String S = br.readLine();

        for (char a : alphabet.toCharArray()) {
            System.out.print(S.indexOf(a) + " ");
        }
    }
}