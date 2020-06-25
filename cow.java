/*
ID: your_id_here
LANG: JAVA
TASK: cow
*/
import java.io.*;
import java.util.*;
public class cow{
    public static void main(String[] args) throws Exception {
          Scanner sc = new Scanner(new File("cow.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("cow.out")));
        int N = sc.nextInt();
        String s = sc.next(); char [] arr = s.toCharArray();
        long C = 0; long O = 0; long W = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 'C'){
                C++;
            }else if(arr[i] == 'O'){
                O += C;
            }else if(arr[i] == 'W'){
                W += O;
            }
        }
        out.println(W);
        out.close();
    }
}


