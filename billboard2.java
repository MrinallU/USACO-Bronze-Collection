
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
        Scanner sc = new Scanner(new File("billboard.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("billboard.out")));
        int x2 = sc.nextInt(); int y2 = sc.nextInt(); int x22 = sc.nextInt(); int y22 = sc.nextInt(); // The lawn
        int x1 = sc.nextInt(); int y1 = sc.nextInt(); int x11 = sc.nextInt(); int y11 = sc.nextInt(); // The cowfeed
         int area = 0;
        int overlap = (overlap(x1, x11, x2, x22) * overlap(y1, y11, y2, y22));
        area += (Math.abs(x22 - x2) * Math.abs(y22 - y2));
        if(overlap(x1, x11, x2, x22) >= Math.abs(x22 - x2) || overlap(y1, y11, y2, y22) >= Math.abs(y22 - y2)){
            out.println(area - overlap);
			
        }else{
            out.println(area);
        }
		
        out.close();
    }
}
