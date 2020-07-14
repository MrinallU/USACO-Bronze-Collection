import java.util.*;
import java.io.*;

public class breedflip {

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        public InputReader() throws FileNotFoundException {
            reader = new BufferedReader(new FileReader("breedflip.in"));
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

    public static void main(String[] args) throws FileNotFoundException, IOException {
        InputReader r = new InputReader();
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("breedflip.out")));
        
        int n = r.nextInt();
        String str1 = r.next();
        String str2 = r.next();
        boolean flag = false;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                if (!flag) {
                    flag = true;
                    count++;
                }
            }
            else {
              flag = false;
            }
        }
        pw.println(count);
        pw.close();
    }
}
