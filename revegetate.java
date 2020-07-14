
/*
ID: your_id_here
LANG: JAVA
TASK: revegetate
*/
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
public class revegetate{
    // Driver Code
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("revegetate.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("revegetate.out")));
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr = new int[M][2];
        int[] vals = new int[N];
        for (int i = 0; i < M; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            vals[i] = 1;
        }
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < M; j++) {
                if (arr[j][0] == i) {
                    if (vals[arr[j][0] - 1] == vals[arr[j][1] - 1]) {
                        if (arr[j][0] > arr[j][1]) {
                            vals[arr[j][0] - 1] += 1;
                        } else {
                            vals[arr[j][1] - 1] += 1;
                        }
                    }
                }
            }
        }
        for (int i : vals) {
            out.print(i);
        }
        out.println();
        out.close();
    }
}


