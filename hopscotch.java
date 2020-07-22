
/*
ID: your_id_here
LANG: JAVA
TASK: hopscotch
*/
import java.io.*;
import java.util.*;

    public class hopscotch{
    int dfs(int r, int c, char[][] a){
        if(r == a.length - 1){
            if(c == a[r].length - 1){
                return 1;
            }
        }
        int ans = 0;
        for(int i = r + 1; i < a.length; i++){
            for(int j = c + 1; j < a[i].length; j++){
                if(a[r][c] != a[i][j]){
                    ans += dfs(i, j, a); // recursion silver level technique
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("hopscotch.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("hopscotch.out")));
        int r = sc.nextInt(); int c = sc.nextInt(); char [][] arr = new char[r][c]; int sol;
        for(int i = 0; i < r; i++){
            String s = sc.next(); arr[i] = s.toCharArray();
        }
       sol = new hopscotch().dfs(0, 0, arr);
        out.println(sol);
        out.close();
    }
}




