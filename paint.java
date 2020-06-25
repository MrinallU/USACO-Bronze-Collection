/*
ID: your_id_here
LANG: JAVA
TASK: paint
*/
import java.io.*;
import java.util.*;

public class paint{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("paint.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("paint.out")));
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int [] arr = new int[b - a +  1];
        int [] arr2 = new int[d - c +  1];
        int ans = 0;
        for(int i = 0; i < arr.length; i++){
            arr[i] = a + i;
        }
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = c + i;
        }
        ans = (b - a) + (d - c);

        int least = 10000000;
        int most = 0;
        for(int i = 0; i < arr2.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr2[i] == arr[j]){
                    least = Math.min(least, arr[j]);
                    most = Math.max(most, arr[j]);
                }
            }
        }
        if(least > 100){
            least = 0 ;
        }

        ans = ans - (most - least);
        out.println(ans);
        out.close();
    }
}


