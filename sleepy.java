
/*
ID: your_id_here
LANG: JAVA
TASK: sleepy
*/
import java.io.*;
import java.util.*;
public class sleepy{
    // Driver Code
    public static void main(String[ ] args) throws IOException {
        Scanner sc = new Scanner(new File("sleepy.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sleepy.out")));
        int N = sc.nextInt(); int [] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        int swaps = 0;
        int [] sorted = Arrays.copyOf(arr, N);
        Arrays.sort(sorted);
        int ans = N - 1;
        for(int i=N-2;i>=0;i--)
        {

            if(arr[i] < arr[i+1])
                ans = i;
            else
                break;
        }
        out.println(ans);
        out.close();
    }
}
