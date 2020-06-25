/*
ID: your_id_here
LANG: JAVA
TASK: angry
*/
import java.io.*;
import java.util.*;


class angry{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("angry.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("angry.out")));
        int N = sc.nextInt(); int [] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        int ans = 0; 
        Arrays.sort(arr);
        boolean stop = false;
        for(int i = 0; i < N; i++) {
          int bales = 0;
            if(i != 0){
              bales = 1;
            }
            
            int backCounter = 1;
            int forwardCounter = 1; 
          for(int j = i; j > 0; j--){
              if(arr[j] - backCounter <= arr[j - 1]){
                  bales++;
              }else{
                  break;
              }
              backCounter++;
          }
          for(int j = i; j < arr.length - 1; j++){
              if(arr[j] + forwardCounter >= arr[j + 1]){
                  bales++; 
              }else{
                  break; 
              }
              forwardCounter++;
          }
          ans = Math.max(ans, bales); 
        }
        out.print(ans);
        out.close();
    }
}


