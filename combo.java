/*
ID: your_id_here
LANG: JAVA
TASK: combo
*/
import java.io.*;
import java.util.*;
public class combo {
  public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(new File("combo.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("combo.out")));
        int N = s.nextInt();
        int f1 = s.nextInt();
        int f2 = s.nextInt();
        int f3 = s.nextInt();
        int m1 = s.nextInt();
        int m2 = s.nextInt();
        int m3 = s.nextInt();
        int ans = 0 ;
        for(int i = 1; i <= N; i++){
            for(int i1 = 1; i1 <=  N; i1++){
                for(int j = 1; j <=  N; j++){
                    int farmer = 0; int master = 0;
                    if(Math.abs(i - f1) <= 2 || Math.abs(i - f1) >= N - 2){
                        farmer++;
                    }
                    if(Math.abs(i1 - f2) <= 2 || Math.abs(i1 - f2) >= N - 2){
                        farmer++;
                    }
                    if(Math.abs(j - f3) <= 2 || Math.abs(j - f3) >= N - 2){
                        farmer++;

                    }
                    if(Math.abs(i - m1) <= 2 || Math.abs(i - m1) >=  N - 2){
                        master++;
                    }
                    if(Math.abs(i1 - m2) <= 2 || Math.abs(i1 - m2) >= N - 2){
                        master++;
                    }
                    if(Math.abs(j - m3) <= 2 || Math.abs(j - m3) >= N - 2){
                        master++;
                    }
                   if(master >= 3 || farmer >= 3){
                       ans++;
                   }
                }
            }
        }
        out.println(ans);
        out.close();
    }
}


