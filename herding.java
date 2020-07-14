
/*
ID: your_id_here
LANG: JAVA
TASK: herding
*/
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
public class herding{
    // Driver Code
    public static void main(String[ ] args) throws IOException {
        Scanner sc = new Scanner(new File("herding.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("herding.out")));
       int N = 3;  int [] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        int [] arr1 = Arrays.copyOf(arr, N);
        int swap = 0; int maxSwap = 0;
        while (true){
            Arrays.sort(arr);
            if(arr[0] + 1 == arr[1] && arr[1] + 1 == arr[2]) {
              break;
            }
            int minDist = arr[1] - arr[0];
            int maxDist = arr[2] - arr[1];
            int leastDist = Math.min(minDist, maxDist);
            if(minDist == 2){
                swap++;
                arr[2] = arr[1] - 1;

            }else if(maxDist == 2){
                swap++;
                arr[0] = arr[2] - 1;
                break;
            }else if(minDist == 1 || minDist > 2 &&arr[1] + 1 != arr[2]){
                swap++;
                arr[0] = arr[1] + 2;
            }else if(maxDist == 1 || maxDist > 2 && arr[1] - 1 != arr[0]){
                swap++;
                arr[2] = arr[1] - 2;
            }else if(arr[1] + 1 == arr[2]){
                swap++;
                arr[2] = arr[1] - 2;
            }else if(arr[1] - 1 == arr[0]){
                swap++;
                arr[0] = arr[1] + 2;
            }


        }
        while (true){
            Arrays.sort(arr1);
            if(arr1[0] + 1 == arr1[1] && arr1[1] + 1 == arr1[2]) {
                break;
            }
            int minDist = arr1[1] - arr1[0];
            int maxDist = arr1[2] - arr1[1];
            int leastDist = Math.min(minDist, maxDist);
            if(leastDist == minDist){
                maxSwap++;
                arr1[0] = arr1[1] + 1;
            }
            if(leastDist == maxDist){
                maxSwap++;
                arr1[2] = arr1[1] - 1;
            }
        }
        out.println(swap);
        out.println(maxSwap);
        out.close();
    }
}
