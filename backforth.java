
/*
ID: your_id_here
LANG: JAVA
TASK: backforth
*/
import java.io.*;
import java.util.*;


public class backforth{
    public static HashSet<Integer> s = new HashSet<>();
    public static void add(ArrayList<Integer> a, ArrayList<Integer> b, int currVal, int day){
        if(day == 6){
            s.add(currVal);
        }else if(day == 1){
             add(a, b, 1000, day + 1);
         }else if(day % 2 == 0){
             for (int i = 0; i < a.size(); i++) {
                 int val = currVal; val -= a.get(i);  ArrayList<Integer> ta = new ArrayList<>(a); ArrayList<Integer> tb = new ArrayList<>(b);
                 Collections.copy(ta, a);
                 Collections.copy(tb, b);


                 tb.add(ta.get(i)); ta.remove(i);
                 add(ta, tb, val, day + 1);
             }
         }else if(day % 2 != 0){
            for (int i = 0; i < b.size(); i++) {
                int val = currVal; val += b.get(i);  ArrayList<Integer> ta = new ArrayList<>(a); ArrayList<Integer> tb = new ArrayList<>(b);


                ta.add(tb.get(i)); tb.remove(i);
                add(ta, tb, val, day + 1);
            }
         }

    }
    public static void main(String[] args) throws Exception {
        FastIO sc = new FastIO("backforth.in");
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("backforth.out")));
        ArrayList<Integer> a = new ArrayList<>();    ArrayList<Integer> b = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            a.add(sc.nextInt());
        }
        for (int i = 0; i < 10; i++) {
            b.add(sc.nextInt());
        }
        s.add(1000);
        add(a, b, 1000, 1);
        out.println(s.size());
        out.close();
    }

    // new FastIO("file_name") to read a file
    // new FastIO(System.in) to read from stdin
    // has similar syntax to Scanner, though much faster :)
    static class FastIO {
        InputStream dis;
        byte[] buffer = new byte[1 << 17];
        int pointer = 0;
        public FastIO(String fileName) throws Exception {
            dis = new FileInputStream(fileName);
        }
        public FastIO(InputStream is) throws Exception {
            dis = is;
        }
        int nextInt() throws Exception {
            int ret = 0;
            byte b;
            do {
                b = nextByte();
            } while (b <= ' ');
            boolean negative = false;
            if (b == '-') {
                negative = true;
                b = nextByte();
            }
            while (b >= '0' && b <= '9') {
                ret = 10 * ret + b - '0';
                b = nextByte();
            }
            return (negative) ? -ret : ret;
        }
        long nextLong() throws Exception {
            long ret = 0;
            byte b;
            do {
                b = nextByte();
            } while (b <= ' ');
            boolean negative = false;
            if (b == '-') {
                negative = true;
                b = nextByte();
            }
            while (b >= '0' && b <= '9') {
                ret = 10 * ret + b - '0';
                b = nextByte();
            }
            return (negative) ? -ret : ret;
        }
        byte nextByte() throws Exception {
            if (pointer == buffer.length) {
                dis.read(buffer, 0, buffer.length);
                pointer = 0;
            }
            return buffer[pointer++];
        }
        String next() throws Exception {
            StringBuffer ret = new StringBuffer();
            byte b;
            do {
                b = nextByte();
            } while (b <= ' ');
            while (b > ' ') {
                ret.appendCodePoint(b);
                b = nextByte();
            }
            return ret.toString();
        }
    }
}