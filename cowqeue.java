/*
ID: your_id_here
LANG: JAVA
TASK: cowqueue
*/
import java.io.*;
import java.util.*;
public class cowqueue{
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(new File("cowqueuecow.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("cowqueue.out")));
        int N = s.nextInt();
        int [] btime = new int[N];
        int [] etime = new int[N];
        for(int i = 0 ;i < N; i++){
            btime[i] = s.nextInt();
            etime[i] = s.nextInt();
        }
        int temp =0 ;
        for (int i = 0; i < N; i++)
        {
            for (int j = i + 1; j < N; j++)
            {
                if (btime[i] > btime[j])
                {
                    temp = btime[i];
                    btime[i] = btime[j];
                    btime[j] = temp;
                    temp = etime[i];
                    etime[i] = etime[j];
                    etime[j] = temp;
                }
            }
        }
        int currTime = 0;
        for(int i = 0; i < N; i++){
            int beginTime = btime[i]; int eTime = etime[i];
            if(beginTime < currTime){
                currTime += eTime;
            }
            if(currTime < beginTime){
                currTime = beginTime + eTime;
            }
        }
        out.println(currTime);
        out.close();
    }
}


