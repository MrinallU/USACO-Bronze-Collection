import java.util.*;
import java.io.*;

public class swap {

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        public InputReader() throws FileNotFoundException {
            reader = new BufferedReader(new FileReader("swap.in"));
            tokenizer = null;
        }


        public boolean hasNext() {
            return tokenizer.hasMoreTokens();
        }

        String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

    }
    static int N, K, A1, A2, B1, B2;
    static int[] res = new int[101];
    static int nex(int x) {
        if (A1 <= x && x <= A2) {
            x = A1 + A2 - x;
        }
        if (B1 <= x && x <= B2) {
            x = B1 + B2 - x;
        }
        return x;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException {
        InputReader r = new InputReader();
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("swap.out")));
        
        N = r.nextInt();
        K = r.nextInt();
        A1 = r.nextInt();
        A2 = r.nextInt();
        B1 = r.nextInt();
        B2 = r.nextInt();
        for (int i = 1; i <= N; i++) {
            int p = 1;
            int cur = nex(i);
            while (cur != i) {
                p++;
                cur = nex(cur);
            }
            int k = K % p;
            for (int j = 0; j < k; j++) {
                cur = nex(cur);
            }
            res[cur] = i;
        }
        for (int i = 1; i <= N; i++) {
            pw.println(res[i]);
        }
        pw.close();
    }
}
