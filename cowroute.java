/*
ID: your_id_here
LANG: JAVA
TASK: cbarn
*/
import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(new File("friday.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("friday.out")));
        int N = s.nextInt();
        int C = 0;
        int O = 0;
        int W = 0;
        String sc = s.next(); long ans = 0;
        for(int i = 0; i < N; i++){
            if(sc.charAt(i) == 'C'){
                C++;

            O = 0;
            W = 0;
            for(int j = i + 1; j < N; j++) {
                if (sc.charAt(j) == 'O') {
                    if(C > 0) {
                        O++;
                    }
                }
                if (sc.charAt(j) == 'W') {
                    if(O > 0) {
                        W++;
                    }
                }
            }

            ans += C * O * W;
            }
        }
        out.println(ans);
        out.close();
    }
}


