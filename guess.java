
/*
ID: your_id_here
LANG: JAVA
TASK: guess
*/
import java.io.*;
import java.util.*;
public class guess{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("guess.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("guess.out")));
        int N = sc.nextInt(); String[][] arr = new String[N][100];
        for(int i = 0; i < N; i++){
           String type = sc.next();  int M = sc.nextInt();
            for (int j = 0; j < M; j++){
                arr[i][j] = sc.next();
            }
        }
        int length = 0; int ans = 0;
        for(int i = 0; i < N; i++){
            for(int j= i + 1; j < N ;j++){
                length = 0;
                ArrayList<String> a = new ArrayList<>();  ArrayList<String> b = new ArrayList<>();
                for(int k = 0; k < 100; k++){
                        if(arr[j][k] == null){
                            break;
                        }else{
                            a.add(arr[j][k]);
                        }
                    }
                for(int k = 0;  k < 100; k++){
                    if(arr[i][k] == null){
                        break;
                    }else{
                        b.add(arr[i][k]);
                    }
                }
               
                for(int k = 0;  k < a.size(); k++){
                    for(int l = 0; l < b.size(); l++) {
                        if (a.get(k).equals(b.get(l))){
                            length++;
                        }
                    }
                }
                if(length == a.size() && length == b.size()){
                    length = 0;
                }
              
                ans = Math.max(length, ans);
            }

        }
        out.println(ans + 1);
        out.close();
        }

    }




