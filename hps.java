
/*
ID: your_id_here
LANG: JAVA
TASK: hps
*/
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
public class hps
{
    public static void main(String[ ] args) throws IOException {
        Scanner sc = new Scanner(new File("hps.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("hps.out")));
        int N = sc.nextInt(); int [][] arr = new int[N][N];
        for(int i = 0; i < N; i++){
            for(int j = 0 ; j < 2; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int hoof; int paper; int scissors;
         hoof = 1;  scissors = 2;  paper = 3;
         int win = 0;
         int ans = 0;
        for(int i = 0; i < N; i++){
               int i1 = arr[i][0]; int i2 = arr[i][1];
               if(i1 == scissors && i2 == paper){
                   win++;
               }
               if(i1 == hoof && i2 == scissors){
                   win++;
               }
               if(i1 == paper && i2 == hoof){
                   win++;
               }
        }
        ans = Math.max(win, ans);
        win = 0 ;

        hoof = 2;  scissors = 1;  paper = 3;
        for(int i = 0; i < N; i++){
            int i1 = arr[i][0]; int i2 = arr[i][1];
            if(i1 == scissors && i2 == paper){
                win++;
            }
            if(i1 == hoof && i2 == scissors){
                win++;
            }
            if(i1 == paper && i2 == hoof){
                win++;
            }
        }
        ans = Math.max(win, ans);
        win = 0 ;
        hoof = 3;  scissors = 1;  paper = 2;
        for(int i = 0; i < N; i++){
            int i1 = arr[i][0]; int i2 = arr[i][1];
            if(i1 == scissors && i2 == paper){
                win++;
            }
            if(i1 == hoof && i2 == scissors){
                win++;
            }
            if(i1 == paper && i2 == hoof){
                win++;
            }
        }
        ans = Math.max(win, ans);
        win = 0 ;
        hoof = 1;  scissors = 3;  paper = 2;
        for(int i = 0; i < N; i++){
            int i1 = arr[i][0]; int i2 = arr[i][1];
            if(i1 == scissors && i2 == paper){
                win++;
            }
            if(i1 == hoof && i2 == scissors){
                win++;
            }
            if(i1 == paper && i2 == hoof){
                win++;
            }
        }
        ans = Math.max(win, ans);
        win = 0 ;
        hoof = 2;  scissors = 3;  paper = 1;
        for(int i = 0; i < N; i++){
            int i1 = arr[i][0]; int i2 = arr[i][1];
            if(i1 == scissors && i2 == paper){
                win++;
            }
            if(i1 == hoof && i2 == scissors){
                win++;
            }
            if(i1 == paper && i2 == hoof){
                win++;
            }
        }
        ans = Math.max(win, ans);
        win = 0 ;
        hoof = 3;  scissors = 1;  paper = 2;
        for(int i = 0; i < N; i++){
            int i1 = arr[i][0]; int i2 = arr[i][1];
            if(i1 == scissors && i2 == paper){
                win++;
            }
            if(i1 == hoof && i2 == scissors){
                win++;
            }
            if(i1 == paper && i2 == hoof){
                win++;
            }
        }
        ans = Math.max(win, ans);
        win = 0 ;
        out.println(ans);
        out.close();
    }
}
