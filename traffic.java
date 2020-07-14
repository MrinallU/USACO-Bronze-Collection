
/*
ID: your_id_here
LANG: JAVA
TASK: traffic
*/
import java.io.*;
import java.util.*;
public class traffic{
   
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("traffic.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("traffic.out")));
        int N = sc.nextInt();  String [] ramp = new String[N]; int [] lower  = new int[N]; int [] higher = new int[N];
        for(int i = 0; i < N;  i++){
            ramp[i] = sc.next();
            lower[i] = sc.nextInt();
            higher[i] = sc.nextInt();
        }
         // Simulate a traffic flow going in reverse.
        int lowerBound = -99999999; int upperBound = 999999999;
        for(int i = N - 1; i >= 0 ; i--){
            switch (ramp[i]) {
                case "none":
                    lowerBound = Math.max(lower[i], lowerBound);
                    upperBound = Math.min(higher[i], upperBound);
                    break;
                case "on":
                    upperBound -= lower[i];
                    lowerBound -= higher[i];
                    lowerBound = Math.max(lowerBound, 0);
                    break;
                case "off":
                    upperBound += higher[i];
                    lowerBound += lower[i];
                    break;
            }
        }
        out.println(lowerBound + " " + upperBound);




      lowerBound = -99999999; upperBound = 999999999;
        for(int i = 0; i < N;  i++){ // Simulate the normal traffic flow.
            switch (ramp[i]) {
                case "none":
                    lowerBound = Math.max(lower[i], lowerBound);
                    upperBound = Math.min(higher[i], upperBound);
                    break;
                case "on":
                    upperBound += higher[i];
                    lowerBound += lower[i];
                    break;
                case "off":
                    upperBound -= lower[i];
                    lowerBound -= higher[i];
                    lowerBound = Math.max(lowerBound, 0);
                    break;
            }
        }
        out.println(lowerBound + " " + upperBound);

        out.close();
    }
}


