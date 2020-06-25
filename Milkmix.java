/*
ID: your_id_here
LANG: JAVA
TASK: mixmilk
*/
import java.io.*;
import java.util.*;
public class Milkmix {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(new File("mixmilk.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("mixmilk.out")));
        int [] capacity = new int[3];     int [] state = new int[3];
        for(int i = 0 ;i < 3; i++){
            capacity[i] = s.nextInt();
            state[i] = s.nextInt();
        }
        for(int i = 0; i < 100; i++){
            int i2 = state[i % 3] + state[(i + 1) % 3];
            if(capacity[(i + 1) % 3] >= i2){
                state[(i + 1) % 3] += state[i % 3];
                state[i % 3] = 0;
            }
            if(capacity[(i + 1) % 3] < i2){
                int i1 = capacity[(i + 1) % 3] - state[(i + 1) % 3];
                state[(i + 1) % 3] += i1;
                state[i % 3] -= i1;
            }
        }
        for(int i = 0; i < 3; i++){
            out.println(state[i]);
        }
        out.close();
    }
}


