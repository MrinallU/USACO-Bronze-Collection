
/*
ID: your_id_here
LANG: JAVA
TASK: square
*/
import java.io.*;
import java.util.*;
public class square
{
    public static void main(String[ ] args) throws IOException {
        Scanner sc = new Scanner(new File("square.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("square.out")));
        int x = sc.nextInt();
        int y = sc.nextInt();
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        int lowestx = Math.min(x, Math.min(x1, Math.min(x2, x3)));
        int lowesty = Math.min(y, Math.min(y1, Math.min(y2, y3)));
        int highestx = Math.max(x, Math.max(x1, Math.max(x2, x3)));
        int highesty = Math.max(y, Math.max(y1, Math.max(y2, y3)));
        int area = Math.max(Math.abs(highestx - lowestx), Math.abs(highesty - lowesty));
        area = area * area;
        out.println(area);
        out.close();

    }
}
