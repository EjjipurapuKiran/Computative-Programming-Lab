import java.util.*;

public class Main {

    static int V;

    static boolean bfs(int[][] cap, int[] parent, int s, int t) {
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();

        q.add(s);
        visited[s] = true;
        parent[s] = -1;

        while (!q.isEmpty()) {
            int u = q.remove();

            for (int v = 0; v < V; v++) {
                if (!visited[v] && cap[u][v] > 0) {
                    q.add(v);
                    parent[v] = u;
                    visited[v] = true;
                }
            }
        }

        return visited[t];
    }

    static int fordFulkerson(int[][] cap, int s, int t) {
        int[] parent = new int[V];
        int flow = 0;

        while (bfs(cap, parent, s, t)) {

            int pathFlow = 1000000000;

            for (int v = t; v != s; v = parent[v]) {
                int u = parent[v];
                pathFlow = Math.min(pathFlow, cap[u][v]);
            }

            for (int v = t; v != s; v = parent[v]) {
                int u = parent[v];

                cap[u][v] -= pathFlow;
                cap[v][u] += pathFlow;
            }

            flow += pathFlow;
        }

        return flow;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        V = sc.nextInt();
        int E = sc.nextInt();

        int[][] cap = new int[V][V];

        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int c = sc.nextInt();

            cap[u][v] += c;
        }

        System.out.println(fordFulkerson(cap, 0, V - 1));
    }
}
