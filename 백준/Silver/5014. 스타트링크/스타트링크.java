import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    static int F, S, G, U, D;
    static int visited[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        F = sc.nextInt(); // 최고 층
        S = sc.nextInt(); // 강호 층
        G = sc.nextInt(); // 가야할 곳
        U = sc.nextInt(); // 업
        D = sc.nextInt(); // 다운
        visited = new int[F + 1];

        bfs();
    }

    public static void bfs() {
        Queue<Integer> q = new LinkedList<>();
        q.add(S);
        visited[S] = 1;

        while (!q.isEmpty()) {
            int c = q.poll();

            if (c == G) {
                System.out.println(visited[c] - 1);
                return;
            }
            if (c + U <= F && visited[c + U] == 0) {
                visited[c + U] = visited[c] + 1;
                q.add(c + U);
            }
            if (c - D > 0 && visited[c - D] == 0) {
                visited[c - D] = visited[c] + 1;
                q.add(c - D);
            }
        }
        if (visited[G] == 0) {
            System.out.println("use the stairs");
        }

    }
}
