/*
ID: your_id_here
LANG: JAVA
TASK: milktemp
*/
import java.io.*;
import java.util.*;
public class milktemp{
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(new File("milktemp.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("milktemp.out")));
        
        int N = s.nextInt();
        int X = s.nextInt(); // cold
        int Y  = s.nextInt(); // right
        int Z = s.nextInt(); //  hot
        int [] b = new int[N]; int [] e = new int[N];
        for(int i = 0; i < N; i++){
            b[i] = s.nextInt();
            e[i] = s.nextInt();
        }
        int [] b1 = new int[N]; int [] e1 = new int[N];
        for(int i = 0; i < N; i++){
            b1[i] = b[i];
            e1[i] = e[i];
        }
        Arrays.sort(b); Arrays.sort(e);
        int leastb = b[0]; int moste = e[e.length - 1];
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i <= 1000; i++){
            ans.add(0);
        }
        for(int j = leastb; j <= moste; j++){
            for(int i = 0; i < 1000; i++){
                if(j < b1[i]){
                    ans.set(j, ans.get(j) + X);
                }else if(j > e1[i]){
                    ans.set(j, ans.get(j) + Z);
                }else if(j <= e1[i] && j >= b1[i]){
                    ans.set(j, ans.get(j) + Y);
                }
            }
        }
        Collections.sort(ans);
        out.println(ans.get(ans.size() - 1));
        out.close();
       }
    }



