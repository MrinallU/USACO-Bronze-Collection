
/*
ID: your_id_here
LANG: JAVA
TASK: outofplace
*/
import java.io.*;
import java.util.*;
public class outofplace{
    public static void main(String[ ] args) throws IOException {
        Scanner sc = new Scanner(new File("outofplace.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("outofplace.out")));
        int N = sc.nextInt(); int [] arr = new int[N]; int ans = 0; int [] logs = new int[N];
                for(int i = 0; i < N; i++){
            int y = sc.nextInt();
            arr[i] = y;
            logs[i] = y;
        }
        ans = 0; 
        Arrays.sort(logs);
          for(int a = 0; a < N; a++) {
            if(logs[a] != arr[a]) {
                ans++;
            }
        }
        if(ans > 0){
           ans =  ans - 1; 
        }
        out.println(ans);
        out.close();
    }
}
