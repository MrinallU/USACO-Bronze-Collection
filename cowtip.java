
/*
ID: your_id_here
LANG: JAVA
TASK: cowtip
*/
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
public class cowtip{
    public static void main(String[ ] args) throws IOException {
        Scanner sc = new Scanner(new File("cowtip.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("cowtip.out")));
        int N = sc.nextInt(); char [][] arr = new char[N][N];
        for(int i = 0; i < N; i++){
            String s = sc.next();
            for(int j = 0; j < N; j++){
                arr[i][j]  = s.charAt(j);
            }
        }

        int ans = 0 ;
        for(int i = N - 1; i >= 0; i--){
            for(int j = N - 1; j >= 0; j--){
                if(arr[i][j] == '1'){
                    for(int  k = i; k >= 0; k--){
                        for(int l = j; l >= 0; l--){
                            if(arr[k][l] == '0'){
                                arr[k][l] = '1';
                            }else{
                                arr[k][l] = '0';
                            }
                        }
                    }
                     ans++;
                }
            }
        }
        out.println(ans);
        out.close();
    }
}
