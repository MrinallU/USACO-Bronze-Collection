/*
ID: your_id_here
LANG: JAVA
TASK: teleport
*/

import java.io.*;
import java.util.*;

public class teleport {
    public static void main (String [] args) throws IOException {
        // Use BufferedReader rather than RandomAccessFile; it's much faster
        Scanner f = new Scanner(new FileReader("teleport.in"));
        // input file name goes above
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("teleport.out")));
        int start = f.nextInt();
        int end = f.nextInt();
        int firstPortal = f.nextInt();
        int secondPortal = f.nextInt();

        int opt1 = Math.abs(start - end);

        int startToFIrst = Math.abs(start - firstPortal);
        int opt2 = Math.abs(secondPortal - end) + startToFIrst;

        int startToSecond = Math.abs(secondPortal - start);
        int opt3 = Math.abs(firstPortal - end) + startToSecond;
        if(opt1 < opt2 && opt1 < opt3 ){
            out.print(opt1);
        }else if(opt1 > opt2 && opt2 <  opt3){
            out.print(opt2);
        }else if(opt3 < opt1 && opt3 < opt2){
            out.print(opt3);
        }else{
            out.print(opt1);
        }



        out.close();
    }
}