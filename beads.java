/*
ID: your_id_here
LANG: JAVA
TASK: beads
*/
import java.io.*;
import java.util.*;
public class beads {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(new File("beads.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("beads.out")));
        int N = s.nextInt();
        String sc = s.next();

        int greatest = 0;
        for(int i = 0; i < N; i++){
            int ans1 = 0;
            int start1 = 0;
            int ans2 = 0;
            int ans = 0;
            int start2 = 0;
           String one = sc.substring(0, i);
           String two = sc.substring(i, N);
           String start = two + one;
           char ch = 'a';
           char [] arr = start.toCharArray();
           for(int j = 0; j < arr.length; j++){
               if(arr[j] == 'w'){
                   ans1++;
               }
                   if (start1 == 0 && (arr[j] == 'r' || arr[j] == 'b')) {
                       start1++;
                       ch = arr[j];
                       ans1++;
                   }else if (start1 > 0 && arr[j] == ch) {
                           ans1++;
                       }else if(start1 > 0 && arr[j] != 'w') {
                           break;
                       }

           }

            char ch2  = 'a';
            for(int j = arr.length - 1; j >= 0; j--){
                if(arr[j] == 'w'){
                    ans2++;
                }
                if(start2 == 0 && (arr[j] == 'r' || arr[j] == 'b')){
                    start2++;
                    ch2 = arr[j];
                    ans2++;
                }else if(start2 > 0 && arr[j] == ch2){
                    ans2++;
                }else if (start2 > 0 && arr[j] != 'w'){
                    break;
                }
            }
            ans = ans1 + ans2;
            greatest = Math.max(greatest, ans);



        }
        if(greatest > N){
            greatest = N; 
        }
        out.println(greatest);
        out.close();
    }
}

