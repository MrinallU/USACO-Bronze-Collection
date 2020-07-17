
/*
ID: your_id_here
LANG: JAVA
TASK: diamond
*/
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
    public class diamond{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("diamond.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("diamond.out")));
       int N = sc.nextInt();  int K = sc.nextInt(); int [] arr = new int[N];  boolean [] logs = new boolean[N];  int ans = 0;
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i = 0; i < N; i++){
            int a = arr[i]; int temp = 0;
                for (int j = 0; j < N; j++) {
                        int b = arr[j];
                        int sum = Math.abs(a - b);
                        if (sum <= K && b >= a) {
                            temp++;
                        }
               ans = Math.max(ans, temp);
            }

        }
        out.println(ans);
        out.close();
    }
}




