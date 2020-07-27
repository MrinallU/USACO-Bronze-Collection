
/*
ID: your_id_here
LANG: JAVA
TASK: factory
*/
import java.io.*;

import java.util.*;

class Graph{
    private int V;
    private ArrayList<ArrayList<Integer> > adj;
    Graph(int V){
        this.V = V;
        adj = new ArrayList<ArrayList<Integer> >(V);
        for (int i = 0; i < V; i++){
            adj.add(new ArrayList<Integer>());
        }
    }
    void addEdge(int u, int v) {

        adj.get(v).add(u);

    }
    

    int DFSUtil(int v,boolean visited[])
    {
        int ans  = 0;
        // Mark the current node as visited and print it
        visited[v] = true;
        ans++;

        // Recur for all the vertices adjacent to this vertex
        Iterator<Integer> i = adj.get(v).listIterator();
        while (i.hasNext())
        {
            int n = i.next();
            if (!visited[n]) {
                ans += DFSUtil(n, visited);
            }
        }
        return ans;
    }

    // The function to do DFS traversal. It uses recursive DFSUtil()
    int DFS(int v)
    {
        // Mark all the vertices as not visited(set as
        // false by default in java)
        boolean visited[] = new boolean[V];

        // Call the recursive helper function to print DFS traversal
        return DFSUtil(v, visited);
    }
}
public class factory{

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("factory.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("factory.out")));
        int N = sc.nextInt(); Graph  g = new Graph(N); boolean used = false;
        for (int i = 0; i < N - 1; i++) {
            g.addEdge(sc.nextInt() - 1, sc.nextInt() - 1);
        }
        for (int i = 0; i < N; i++) {
            int ans = g.DFS(i);
            if(ans >= N) {
                out.println(i + 1); used = true;
                break;
            }
        }
        if(!used){
            out.println(-1);
        }


        out.close();
    }
}




