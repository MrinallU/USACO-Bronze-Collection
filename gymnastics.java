
/*
ID: your_id_here
LANG: JAVA
TASK: gymnastics
*/
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
public class gymnastics{
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("gymnastics.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("gymnastics.out")));
        int K = sc.nextInt(); int M = sc.nextInt(); int [][] arr = new int[K][M]; int ans= 0;
        for( int i = 0; i < K; i++){
            for(int j = 0; j < M;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i  = 0; i < M; i++){
            for(int j = 0 ;j < M; j++){
                int cowA = arr[0][i]; int cowB = arr[0][j]; int pairs = 0;
                if(cowA != cowB) {
                    for (int h = 0; h < K; h++) {
                        int aIndex = 0;
                        int bIndex = 0;
                        for (int k = 0; k < M; k++) {
                            if (arr[h][k] == cowA) {
                                aIndex = k;
                            }
                            if (arr[h][k] == cowB) {
                                bIndex = k;
                            }
                        }
                        if (aIndex < bIndex) {
                            pairs++;
                        }
                    }
                    if (pairs == K) {
                        ans++;
                    }
               }
            }
        }
        out.println(ans);
        out.close();
    }
}


