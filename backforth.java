 
import java.io.*;
import java.util.*;


public class backforth{
    public static HashSet<Integer> s = new HashSet<>();
    public static void add(ArrayList<Integer> a, ArrayList<Integer> b, int currVal, int day){ // recursive to keep track of all possible pail combinations through the six days.
        if(day == 6){
            s.add(currVal); // Add the current reading of the 1st barn after all the five days have passed.
        }else if(day == 1){
             add(a, b, 1000, day + 1); // It is Monday so don't do anything except keep the current milk reaidng aty 1000
         }else if(day % 2 == 0){ // On the even days (Tuesday and Thursay)
             for (int i = 0; i < a.size(); i++) { // Recurse through all the pails of the first barn.
                 int val = currVal; 
                 val -= a.get(i);  // fill milk from first barn pail
                 ArrayList<Integer> ta = new ArrayList<>(a); 
                 ArrayList<Integer> tb = new ArrayList<>(b);
                 
                 Collections.copy(ta, a);
                 Collections.copy(tb, b);


                 tb.add(ta.get(i)); // pour into the second barn and leave the pail at the second barn.
                 ta.remove(i); // get rid of the pail transfered in the first barn.
                 add(ta, tb, val, day + 1); // recurse to the next day
             }
         }else if(day % 2 != 0){ // On the odd days (Wednesday and Friday)
            for (int i = 0; i < b.size(); i++) { // recurse through all the pails of the second barn
                int val = currVal; 
                val += b.get(i);  // Takes a bucket from the first barn and fills it to the second barn. 
                ArrayList<Integer> ta = new ArrayList<>(a); 
                ArrayList<Integer> tb = new ArrayList<>(b);

                ta.add(tb.get(i)); // Add the pail from the second banr to the first barn.
                tb.remove(i); // Remove the pail fom the second barn as it was transfered ot the first.
                add(ta, tb, val, day + 1); // Recurse to the next day
            }
         }

    }
    public static void main(String[] args) throws Exception {
        FastIO sc = new FastIO("backforth.in");
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("backforth.out")));
        ArrayList<Integer> a = new ArrayList<>();  // All the pails from the first barn.
        ArrayList<Integer> b = new ArrayList<>();  // All the pails from the seocnd barn.
        for (int i = 0; i < 10; i++) {
            a.add(sc.nextInt());
        }
        for (int i = 0; i < 10; i++) {
            b.add(sc.nextInt());
        }
        s.add(1000); // Add the inital reading of the first barn to the hashset
        add(a, b, 1000, 1);
        out.println(s.size()); // Output all of the unique readings done by the first barn that is possible on the sixth day
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
