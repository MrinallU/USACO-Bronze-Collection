
/*
ID: your_id_here
LANG: JAVA
TASK: sleepy
*/
import java.io.*;
import java.util.*;
public class sleepy{
   
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
        int i = 0;
        boolean stop = false;
        while(true){
            for(int j = 0; j < N; j++){
                if(arr[j] != sorted[j]){
                    stop = false;
                    break;
                }else{
                    stop = true;
                }
            }
            if(!stop){
                    int index = 0;
                    for(int k = 0; k < N; k++) {
                        if (sorted[k] == arr[i]) {
                             index = k;
                        }
                    }
                       if(arr[i] > arr[i + 1]){
                           int g = i;
                           for(int k = 0; k < index; k++) {
                               int temp = arr[g];
                               arr[g] = arr[g + 1];
                               arr[g + 1] = temp;
                               g++;
                           }
                       }else {
                           int e = arr[i]; int l = 0;
                           for (int k = 0; k < arr.length;k++) {
                               if (arr[k] != e) {
                                   int temp = arr[l];
                                   arr[l] = arr[k];
                                  arr[k] = temp;
                                   l++;
                               }
                           }

                       }
                       swaps++;
            }else{
                out.println(swaps - 1 );
                break;
            }
        }
        out.close();
    }
}
