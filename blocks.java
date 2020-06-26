
/*
ID: your_id_here
LANG: JAVA
TASK: blocks
*/
import java.io.*;
import java.util.*;
public class blocks
{
    public static void main(String[ ] args) throws IOException {
        Scanner sc = new Scanner(new File("blocks.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("blocks.out")));
         int N = sc.nextInt(); String [][] arr = new String[N][2];
        for(int i = 0  ;i < N; i++){
            for(int j = 0; j < 2; j++){
                arr[i][j] = sc.next();
            }
        }

        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray(); int [] finaletter = new int[26];
        for(int i = 0; i < N; i++){
            String op1 = arr[i][0];
            String opt2 = arr[i][1];
            int [] letters = new int[26]; int [] letters1 = new int[26];
            for(int j = 0 ; j < alphabet.length; j++){
                for(int k = 0 ; k < op1.length(); k++) {
                    if(op1.charAt(k) == alphabet[j]){
                        letters[j] += 1;
                    }
                }
                for(int k = 0 ; k < opt2.length(); k++) {
                    if(opt2.charAt(k) == alphabet[j]){
                        letters1[j] += 1;
                    }
                }
            }
            for(int j = 0; j < letters.length; j++){
                finaletter[j] += Math.max(letters[j], letters1[j]); 
            }
        }
         for(int i = 0; i < finaletter.length; i++){
            out.println(finaletter[i]);
        }
        out.close();

    }
}
