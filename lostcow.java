/*
ID: your_id_here
LANG: JAVA
TASK: lostcow
*/
import java.io.*;
import java.util.*;
public class lostcow {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(new File("lostcow.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("lostcow.out")));
        int x = s.nextInt();
        int y =  s.nextInt();
        int ans = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        boolean stop = false;
        int start = 1;
        int dist = x; // WHAT IF X AND Y R THE SAME ?
        if(x == y){
            ans = 0;
            stop = true;
        }
        while (!stop){

            dist = x + start;
            if(start == 1){
                ans += 1;
            }else{
                ans += Math.abs(x - dist);
            }
            if(y > x) {
                if (dist >= y) {
                    ans -= Math.abs(x - dist);
                    ans += Math.abs(x - y);
                    break;
                }else{
                    ans += Math.abs(x - dist);

                }
            }
            if(x > y){
                if (dist <= y) {
                   ans -= Math.abs(x - dist);
                    ans += Math.abs(x - y);
                    break;
                }else{
                    ans += Math.abs(x - dist);
                }
            }

            start = start * -2;
        }
        out.println(ans);
        out.close();
    }
}


