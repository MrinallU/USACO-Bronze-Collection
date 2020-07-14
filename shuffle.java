
/*
ID: your_id_here
LANG: JAVA
TASK: shuffle
*/
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
public class shuffle{
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("shuffle.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("shuffle.out")));
        int N = sc.nextInt();  int  [] keys = new int[N]; String [] vals = new String[N]; String [] newVals = new String[N];
        for(int  i = 0;  i < N; i++){
            keys[i] = sc.nextInt();
        }
        for(int  i = 0;  i < N; i++){
            vals[i] = sc.next();
        }
       for(int i = 0; i < 3; i++){
           for(int j = 0; j < N; j++){
               int  toMove = keys[j] - 1; int current = j;
               newVals[current] = vals[toMove];
           }
           vals = new String[N];
           if (N >= 0) System.arraycopy(newVals, 0, vals, 0, N);
          
           newVals = new String[N];
       }
        for (String i: vals) {
            out.println(i);
        }
        out.close();
    }
}


