
/*
ID: your_id_here
LANG: JAVA
TASK: revegetate
*/
import java.io.*;

import java.util.*;

class Graph {
    private int V;
    private ArrayList<ArrayList<Integer>> adj;

    Graph(int V) {
        this.V = V;
        adj = new ArrayList<ArrayList<Integer>>(V);
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<Integer>());
        }
    }

    void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);

    }

    int[] solve(int[] vals) {
        for (int i = 0; i < adj.size(); i++) {   // vertex
            for (int j = 0; j < adj.get(i).size(); j++) {  // connected vertexes
                int val = adj.get(i).get(j); // The connected vertex
                if (vals[i] == vals[val]) {
                    if(val < i){
                        ++vals[i];
                    }else {
                        vals[val]++;
                    }

                }
            }
        }
        return vals;
    }

  


}

public class revegetate{



    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("revegetate.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("revegetate.out")));
        int N = sc.nextInt(); int M = sc.nextInt(); Graph g = new Graph(N); int [] colorings = new int[N];
        Arrays.fill(colorings, 1);
        for (int i = 0; i < M ; i++) {
            int a = sc.nextInt() - 1; int b = sc.nextInt() - 1;
            g.addEdge(a, b);
        }
        
        int [] ans = g.solve(colorings);

        
        for (int i = 0; i < ans.length; i++) {
            if(i < ans.length - 1){
                out.print(ans[i]);
            }else out.println(ans[i]);
        }

        out.close();
    }
}




