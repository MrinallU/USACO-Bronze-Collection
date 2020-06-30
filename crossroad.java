
/*
ID: your_id_here
LANG: JAVA
TASK: crossroad
*/
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
public class crossroad{
    public static void main(String[ ] args) throws IOException {
        Scanner sc = new Scanner(new File("crossroad.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("crossroad.out")));
        int N = sc.nextInt(); int [] arr = new int[10]; int [][] logs = new int[N][2];
        for(int i = 0; i < N; i++){
            logs[i][0] = sc.nextInt() - 1;
            logs[i][1] = sc.nextInt();
        }
        for(int i = 0; i < 10; i++){
            arr[i] = -1;
        }
        int crossings = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < N; j++){
                if(i == logs[j][0]){
                    if(arr[i] == -1){
                        arr[i] = logs[j][1];
                    }else if(arr[i] != logs[j][1]){
                        crossings++;
                        arr[i] = logs[j][1];
                    }
                }
            }

        }
        out.println(crossings);
        out.close();
    }
}
