/*
ID: your_id_here
LANG: JAVA
TASK: censor
*/
import java.io.*;
import java.util.*;

public class censor{
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("censor.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("censor.out")));
        String s = sc.next();
        String t = sc.next();
        String R = ""; char [] a = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {

           R = R.concat(String.valueOf(a[i]));

            if (R.length() >= t.length() && R.substring(R.length() - t.length()).equals(t)) {
               R = R.substring(0, R.length() - t.length());
			      if(R.contains(t)){
                   break;
               }
            }
        }
        out.println(R);

        out.close();
    }
}


