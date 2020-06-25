/*
ID: your_id_here
LANG: JAVA
TASK: pails
*/
import java.io.*;
import java.util.*;


class pails{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("pails.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("pails.out")));
        int X = sc.nextInt(); int Y = sc.nextInt(); int M = sc.nextInt();
        int ans = 0;
         for(int i = 0; i <= 1000; i++){
             for(int j = 0; j < 1000; j++){
                 int a = (X * i) + (Y * j);
                 if(a <= M){
                     ans = Math.max(ans, a);
                 }
             }
         }
        out.print(ans);
        out.close();
    }
}


