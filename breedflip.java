
/*
ID: your_id_here
LANG: JAVA
TASK: breedflip
*/
import java.io.*;

import java.util.*;

    public class breedflip{

    public char[] swap(char [] a, int st , int e){

        for (int i = st; i <= e; i++) {
            if(a[i] == 'G'){
                a[i] = 'H';
            }else{
                a[i] = 'G';
            }
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("breedflip.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("breedflip.out")));
        int len = sc.nextInt();  String a = sc.next(); String b = sc.next(); int ans = 0 ;
        char [] A = a.toCharArray(); char [] B = b.toCharArray();
        while(!Arrays.equals(A, B)){
            int start = -1; int end = 0;
            for (int i = 0; i < len; i++) {
                if(A[i] != B[i]){
                    if(start == -1){
                        start = i;
                        end = start;
                    }else {
                        end = i;
                    }
                }else if(start > -1){
                    break;
                }
            }
            B = new  breedflip().swap(B, start, end);
            ans++;
        }
        out.println(ans);
        out.close();
    }
}




