
/*
ID: your_id_here
LANG: JAVA
TASK: triangles
*/
import java.io.*;
import java.util.*;
public class triangles{
    // For this question you will have had to know a formula, easy if you took geometry. Other wise be sure to study up on the basics of coordinate geometry!
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("triangles.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("triangles.out")));
         int N = sc.nextInt(); int[][] vertecies = new int[N][2];
        for(int i= 0; i < N; i++){
            vertecies[i][0] = sc.nextInt();
            vertecies[i][1] = sc.nextInt();
        }
        int ans = 0;
        for(int i = 0; i < N; i++){
            int a_x = vertecies[i][0];  int a_y = vertecies[i][1];
            for(int j = 0; j < N; j++){
                int b_x = vertecies[j][0];  int b_y = vertecies[j][1];
                for(int k = 0; k < N; k++){
                    int c_x = vertecies[k][0];  int c_y = vertecies[k][1];
                    int area =Math.abs((a_x  * (b_y - c_y)) + (b_x * (c_y - a_y)) + (c_x * (a_y - b_y ))) ;
                    if((a_x == b_x || a_x == c_x || c_x == b_x) && (a_y == b_y || a_y == c_y || c_y == b_y)) {
                        ans = Math.max(ans, area);
                    }
                }
            }
        }
        out.println(ans);
        out.close();
    }
}




