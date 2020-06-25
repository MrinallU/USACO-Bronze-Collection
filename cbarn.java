/*
ID: your_id_here
LANG: JAVA
TASK: cbarn
*/
import java.io.*;
import java.util.*;
public class cbarn{
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(new File("cbarn.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("cbarn.out")));
        int N = s.nextInt(); int [] arr  =new int[N]; int [] ans = new int[N];
        for(int i = 0; i < N; i++){
            arr[i]  = s.nextInt();
        }
        for(int i = 0; i < N; i++){
            int counter = 0;
            int dist = 0;
            int index = i;
            for(int j = 0; j < arr.length; j++){
                dist += arr[index % N] * counter;
                counter++;
                index++;

            }
            ans[i] = dist;
        }
        Arrays.sort(ans);
        out.println(ans[0]);
        out.close();
    }
}


