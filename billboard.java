
/*
ID: your_id_here
LANG: JAVA
TASK: billboard
*/
import java.io.*;
import java.util.*;
public class billboard{
    public static int overlap(int left1, int right1, int left2, int right2) {
        if(right1 < left2 || right2 < left1){
            return 0; // No overlap in the rectangles
        }
        int [] values = {left1, left2, right1, right2};
        Arrays.sort(values);
        return values[2] - values[1]; // Returns overlap
    }
    public static void main(String[ ] args) throws IOException {
        /*
        1 2 3 5
        6 0 10 4
        2 1 8 3
         */
        Scanner sc = new Scanner(new File("billboard.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("billboard.out")));
        int x1 = sc.nextInt(); int y1 = sc.nextInt(); int x11 = sc.nextInt(); int y11 = sc.nextInt();
        int x2 = sc.nextInt(); int y2 = sc.nextInt(); int x22 = sc.nextInt(); int y22 = sc.nextInt();
        int x3 = sc.nextInt(); int y3 = sc.nextInt(); int x33 = sc.nextInt(); int y33 = sc.nextInt();
        int area = (x11 - x1) * (y11 - y1) + (x22 - x2) * (y22 - y2); // Area of the two combined rectangles
        area -= overlap(x1, x11, x3, x33 ) * overlap(y1, y11, y3, y33); // Subtracts Overlap of x and y.
        area -= overlap(x2, x22, x3, x33 ) * overlap(y2, y22, y3, y33);
        out.println(area);
        out.close();
    }
}
