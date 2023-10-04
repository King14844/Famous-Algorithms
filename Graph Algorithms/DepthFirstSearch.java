import java.util.LinkedList;

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

    void DFS(int start) {
        boolean[] visited = new boolean[V];
        DFSHelper(start, visited);
    }

    private void DFSHelper(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");

        for (Integer neighbor : adj[v]) {
            if (!visited[neighbor]) {
                DFSHelper(neighbor, visited);
            }
        }
    }
}

public class DepthFirstSearch {
    public static void main(String[] args) {
        Graph graph = new Graph(7);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);
        graph.addEdge(2, 6);

        System.out.println("Depth-First Traversal starting from vertex 0:");
        graph.DFS(0);
    }
}
