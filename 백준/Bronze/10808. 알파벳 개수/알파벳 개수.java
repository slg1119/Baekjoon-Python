import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] S = br.readLine().toCharArray();
        int[] arr = new int[26];

        for (char c : S) {
            arr[c - 97]++;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
