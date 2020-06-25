/*
ID: your_id_here
LANG: JAVA
TASK: speeding
*/
import java.io.*;
import java.util.*;

public class speeding{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("speeding.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("speeding.out")));
        int N = sc.nextInt(); int [][] rules = new int[N][2]; int [][] bessie = new int[N][2];
        int M  = sc.nextInt();
        for(int i = 0; i < N; i++){
            for(int j = 0; j <= 1; j++){
                rules[i][j] = sc.nextInt();
            }
        }
        for(int i = 0 ; i < M; i++){
            for(int j = 0; j <= 1; j++){
                bessie[i][j] = sc.nextInt();
            }
        }
        int ans =0 ;
        int milesBessie = bessie[0][0];   int milesRules = rules[0][0];
        int speedBessie = bessie[0][1];   int speedLimit = rules[0][1];
        int counter = 0; int counter1 = 0;
        for(int i = 0 ; i <= 100; i++){
            if(i > milesBessie){
                counter++;
                milesBessie += bessie[counter][0];
                speedBessie = bessie[counter][1];
            }
            if(i > milesRules){
                counter1++;
                milesRules += rules[counter1][0];
                speedLimit = rules[counter1][1];
            }
            if(speedBessie > speedLimit){
                ans = Math.max(ans, speedBessie - speedLimit);
            }
        }

        out.println(ans);
        out.close();
    }
}


