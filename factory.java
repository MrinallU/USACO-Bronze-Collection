 
import java.io.*;

import java.util.*;

class Graph{
    private int V;
    private ArrayList<ArrayList<Integer> > adj;
    Graph(int V){
        this.V = V;
        adj = new ArrayList<ArrayList<Integer> >(V);
        for (int i = 0; i < V; i++){
            adj.add(new ArrayList<Integer>()); // Creating the adjacency list
        }
    }
    void addEdge(int u, int v) {

        adj.get(v).add(u); // Connecting the two factories.

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
                ans += DFSUtil(n, visited); // recurse to the next edge and increase the numebr of stations visited.v
            }
        }
        return ans; // return number of visited stations.
    }

    // The function to do DFS traversal. It uses recursive DFSUtil()
    int DFS(int v)
    {
        // Mark all the vertices as not visited(set as false by default)
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
            g.addEdge(sc.nextInt() - 1, sc.nextInt() - 1); // Meaning one can walk from station A to station B. 
        }
        for (int i = 0; i < N; i++) {
            int ans = g.DFS(i);
            if(ans >= N) {
                out.println(i + 1); // if the number of visited stations from the DFS is equal to the number of stations then then it is possible to walk form station i to any other station. 
                used = true;
                break;
            }
        }
        if(!used){
            out.println(-1); // If no such station exists then we print -1.
        }


        out.close();
    }
}




