import java.io.*;
import java.util.*;

public class cownomics {
    
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(new File("cownomics.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("cownomics.out")));
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        char[][] spotted = new char[N][M];
        char[][] plain = new char[N][M];
        int ans = 0;
        
        for (int i = 0; i < N; i++) {
            String s = sc.next();
            char[] a = s.toCharArray();
            if (M >= 0) System.arraycopy(a, 0, spotted[i], 0, M);
        }
        
        for (int i = 0; i < N; i++) {
            String s = sc.next();
            char[] a = s.toCharArray();
            if (M >= 0) System.arraycopy(a, 0, plain[i], 0, M);
        }
        
        for (int i = 0; i < M; i++) {
            boolean contains = false;
            HashSet < Character > a = new HashSet < > ();
            
            for (int j = 0; j < N; j++) {
                a.add(plain[j][i]); // Go to column j at position i
            }
            
            for (int j = 0; j < N; j++) {
                if (a.contains(spotted[j][i])) {
                    contains = true;
                    break;
                }
            }
            
            if (!contains) ans++;
        }
        out.println(ans);
        out.close();
    }
}
