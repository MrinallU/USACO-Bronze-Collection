/*
ID: your_id_here
LANG: JAVA
TASK: balancing
*/
import java.io.*;
import java.util.*;


class balancing{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("balancing.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("balancing.out")));
        int N = sc.nextInt(); int M  =sc.nextInt(); int [][] arr = new int[N][2];
        for(int i = 0; i < N; i++){
            for(int j=0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int lowestSect = 1000000000;
        for(int i = 1 ; i <=  M / 2; i++){
            for(int j = 1; j <= M / 2; j++){
                int sect1 = 0; int sect2 = 0 ; int sect3 = 0; int sect4 = 0 ;
                for(int k = 0; k < N; k++) {
                    int a = i * 2; int x = arr[k][0];
                    int b = j * 2; int y = arr[k][1];
                    if(x < a && y > b){
                        sect1++;
                    }
                    if(x < a && y < b){
                        sect2++;
                    }
                    if(x > a && y < b){
                        sect3++;
                    }
                    if(x > a && y > b){
                        sect4++;
                    }
                }
                lowestSect = Math.min(lowestSect, Math.max(sect1,Math.max(sect2,Math.max(sect3,sect4))));
            }
			 if(lowestSect == 1){
                break;
            }
        }
        out.println(lowestSect);
        out.close();
    }
}


