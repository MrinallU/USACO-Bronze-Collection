 
import java.io.*;
import java.util.*;
public class triangles{
    // For this question you will have had to know a formula, easy if you took geometry. Other wise be sure to study up on the basics of coordinate geometry!
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("triangles.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("triangles.out")));
         int N = sc.nextInt(); 
        int[][] vertecies = new int[N][2]; // Store the vertecie in a 2D array 
        for(int i= 0; i < N; i++){
            vertecies[i][0] = sc.nextInt(); // Read in the x-coordinate
            vertecies[i][1] = sc.nextInt(); // Read in the y-coordinate
        }
        int ans = 0;
        for(int i = 0; i < N; i++){
            int a_x = vertecies[i][0];  int a_y = vertecies[i][1]; // Iterate for the first vertex of the triangle.
            for(int j = 0; j < N; j++){
                int b_x = vertecies[j][0];  int b_y = vertecies[j][1];  // Iterate for the second vertex of the triangle.
                for(int k = 0; k < N; k++){
                    int c_x = vertecies[k][0];  int c_y = vertecies[k][1];   // Iterate for the third vertex of the triangle.
                    
                    int area =Math.abs((a_x  * (b_y - c_y)) + (b_x * (c_y - a_y)) + (c_x * (a_y - b_y ))); // Calculate the area of the three triangles (but not dividing by two as the problem specifies)
                    
                    if((a_x == b_x || a_x == c_x || c_x == b_x) && (a_y == b_y || a_y == c_y || c_y == b_y)) { // Checking if the triangle has any sides parallel to the X-axis and the Y-axis.
                        ans = Math.max(ans, area); // If it has sides parallel to both axis then the trangle is valid and store the maximum area.
                    }
                    
                }
            }
        }
        out.println(ans); // Print the max area.
        out.close();
    }
}




