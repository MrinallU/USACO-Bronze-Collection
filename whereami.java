
/*
ID: your_id_here
LANG: JAVA
TASK: word
*/
import java.io.*;
import java.util.*;
public class word{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("word"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("word")));
        int N = sc.nextInt(); /* Strings */ int M = sc.nextInt();  /* Character limit*/ String [] arr = new String[N];
        for(int i = 0; i < N; i++){
            arr[i] = sc.next();
        }

        int length = 0; int nxtLength = 0 ;
        for(int i = 0; i < N; i++){
            String curWord  = arr[i]; length += curWord.length(); boolean newLine = false;
            if(i != N - 1){
                String nextWord = arr[i + 1];  nxtLength = nextWord.length();
                if(length + nxtLength > M){
                    length = 0;
                    out.println(arr[i]);
                }else{
                    out.print(arr[i] + " ");
                }
            }else{
                out.print(arr[i]);
            }
        }

        out.close();
        }

    }




