
/*
ID: your_id_here
LANG: JAVA
TASK: lifeguards
*/
import javax.imageio.ImageTranscoder;
import java.io.*;
import java.util.*;
public class lifeguards{
    public static void main(String[ ] args) throws IOException {
        Scanner sc = new Scanner(new File("lifeguards.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("lifeguards.out")));
        int N = sc.nextInt(); int [][] arr = new int[N][2]; int ans = 0; int maxEnd = 0;
        for(int i = 0 ; i < N ; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            maxEnd = Math.max(maxEnd, arr[i][1]);
        }

 
         for(int j = 0; j < N; j++) {
            int cout = 0;
            boolean [] logs = new boolean[maxEnd + 1];
            for (int i = 0; i < N; i++) {
                if(i != j) {
                    int start = arr[i][0];
                    int end = arr[i][1];
                    for(int k = start; k <= end; k++){
                        if(!logs[k]){
                            logs[k] = true;
                            cout++;
                        }

                    }
                }
            }
            ans = Math.max(cout - 2, ans);
        }
       out.println(ans);

        out.close();
    }
}
