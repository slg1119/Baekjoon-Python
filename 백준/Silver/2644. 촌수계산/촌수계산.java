import java.util.Scanner;

public class Main {

    public static int[][] node;
    public static boolean[] visited;
    public static int M, N, start, end;
    public static int result = 0;

    public static int dfs(int start, int end, int count) {
        visited[start] = true;

        if (start == end) {
            return count;
        }

        for (int i = 1; i < visited.length; i++) {
            if (node[start][i] == 1 && !visited[i]) {
                int temp = dfs(i, end, count + 1);
                if (temp != -1) {
                    return temp;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        M = sc.nextInt();
        start = sc.nextInt();
        end = sc.nextInt();
        N = sc.nextInt();

        node = new int[M + 1][M + 1];
        visited = new boolean[M + 1];

        for (int i = 0; i < N; i++) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            node[m][n] = node[n][m] = 1;
        }
        System.out.println(dfs(start, end, 0));
    }
}
