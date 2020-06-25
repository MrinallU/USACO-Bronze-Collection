/*
ID: your_id_here
LANG: JAVA
TASK: badmilk
*/
import java.io.*;
import java.util.*;


class badmilk{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("badmilk.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("badmilk.out")));
        int N = sc.nextInt(); int M = sc.nextInt(); int D = sc.nextInt(); int S = sc.nextInt();
        int [][] matrix = new int[D][3]; int [][] sick = new int[S][2];
        for(int i = 0; i < D; i++){
            for(int j = 0; j < 3; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < S; i++){
            for(int j = 0; j < 2; j++){
                sick[i][j] = sc.nextInt();
            }
        }


        int ans = 0;
        int counter = 0;

        for(int i = 0 ; i < M; i++){
            int [] people = new int[N];
            int drank = 0; int possible =  0;
            counter++;
            for(int j = 0; j < D; j++) {
                if(counter == matrix[j][1]) {
                    int person = matrix[j][0];
                    int sickTime = 0;
                    int personTime = matrix[j][2];
                    for (int k = 0; k < S; k++) {
                        if (sick[k][0] == person) {
                            sickTime = sick[k][1];
                            break;
                        }
                    }
                    if (personTime < sickTime) {
                        if (people[person - 1] == 0) {
                            people[person - 1] = 1;
                        }
                    }
                    if(sickTime == 0){
                        people[person - 1] = 2;
                    }

                }
            }
            for(int j = 0; j < people.length; j++){
                if(people[j] == 1){
                    drank++;
                }
                if(people[j] == 2){
                    possible++;
                }
            }
            if(drank == S){
                ans = Math.max(ans, drank + possible);
            }
        }
        out.println(ans);
        out.close();
    }
}


