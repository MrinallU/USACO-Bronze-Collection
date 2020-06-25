/*
ID: your_id_here
LANG: JAVA
TASK: censor
*/
import java.io.*;
import java.util.*;

public class censor{
    public static String funct(String s, String r, int N)
    {
        char [] arr = s.toCharArray();
        String R = "";
        for(int i = 0; i < N ; i++){
            R = R.concat(String.valueOf(arr[i]));
            if(R.length() >= r.length() && R.substring(R.length() - r.length()).equals(r)){
                R = R.substring(0, R.length() - r.length());
            }
        }
        return R;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("censor.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("censor.out")));
        String s = sc.next();
        String r = sc.next();
        int N  = s.length();
        out.println(funct(s, r, N));
        out.close();

    }
}


