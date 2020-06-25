/*
ID: your_id_here
LANG: JAVA
TASK: promote
*/
import java.io.*;
import java.util.*;


class promote{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("promote.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("promote.out")));
       int [][] arr = new int[4][2];
       for(int i = 0 ; i < 4; i++){
           for(int j = 0; j < 2; j++){
               arr[i][j] = sc.nextInt();
           }
       }
       for(int i = 0; i < arr.length; i++){
           int start = arr[i][0]; int ending = arr[i][1];
           if(i == 3){
               out.println(ending - start);
           }
           if(i == 1){
               out.println(arr[i + 1][1] - arr[i + 1][0] + arr[i + 2][1] - arr[i + 2][0]);
           }
           if(i == 0){
               out.println(arr[i + 1][1] - arr[i + 1][0] + arr[i + 2][1] - arr[i + 2][0] + arr[i + 3][1] - arr[i + 3][0]);
           }

       }
        out.close();
    }
}


