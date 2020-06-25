/*
ID: your_id_here
LANG: JAVA
TASK: measurement
*/
import java.io.*;
import java.util.*;
public class measurement {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(new File("measurement.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("measurement.out")));
        int N = s.nextInt(); boolean bessieOn = true, elsieOn = true, mildredOn = true;
        int [] d = new int[N]; String [] c = new String[N]; int [] diff = new int[N];
        for(int i = 0 ; i < N; i++){
            d[i] = s.nextInt();
            c[i] = s.next();
            diff[i] = s.nextInt();
        }
        int Milred = 7; int Elise = 7; int Bessie = 7;
        int change = 0; int [] state = new int[3];
        for(int i = 1; i <= 100; i++){
            for(int j = 0 ; j < N; j++ ){

                if(d[j] == i){
                    if(c[j].equals("Mildred")){
                        Milred += diff[j];
                        state[0] = Milred;
                    }
                    if(c[j].equals("Elsie")){
                        Elise += diff[j];
                        state[1] = Elise;
                    }
                    if(c[j].equals("Bessie")){
                        Bessie += diff[j];
                        state[2] = Bessie;
                    }

                }

            }
            int highestMilk =  Math.max(Bessie, Math.max(Elise, Milred));
            boolean bessieOnNext = state[2] == highestMilk;
            boolean elsieOnNext = state[1] == highestMilk;
            boolean mildredOnNext = state[0] == highestMilk;
            if(bessieOn != bessieOnNext || elsieOn != elsieOnNext || mildredOn != mildredOnNext) {
                change++;
            }
            bessieOn = bessieOnNext;
            elsieOn = elsieOnNext;
            mildredOn = mildredOnNext;
        }
        out.println(change);
        out.close();
    }
}


