import java.util.LinkedList;
import java.util.Queue;

class Graph {
    private int V;
    private LinkedList<Integer>[] adj;

    @SuppressWarnings("unchecked")
    Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList<>();
        }
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void BFS(int start) {
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            start = queue.poll();
            System.out.print(start + " ");

            for (Integer neighbor : adj[start]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }
}

public class BreadthFirstSearch {
    public static void main(String[] args) {
        Graph graph = new Graph(7);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);
        graph.addEdge(2, 6);

        System.out.println("Breadth-First Traversal starting from vertex 0:");
        graph.BFS(0);
    }
}
