
/*
ID: your_id_here
LANG: JAVA
TASK: notlast
*/
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
public class notlast
{
    public static void main(String[ ] args) throws IOException {
        Scanner sc = new Scanner(new File("notlast.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("notlast.out")));
        int rows = 7, column = 2; int N = sc.nextInt();
        String [] cows = { "Bessie", "Elsie", "Daisy", "Gertie", "Annabelle", "Maggie", "Henrietta"};
        Object[][] arr = new Object[rows][column];
        Object [][] logs = new Object[N][2];
        for (int row = 0; row < arr.length; row++)
        {
            for (int col = 0; col < arr[row].length; col++)
            {
                arr[row][0] = cows[row];
                arr[row][1] = 0;
            }
        }
        for(int i = 0; i < N; i++){
            logs[i][0] = sc.next();
            logs[i][1] = sc.nextInt();
        }
        for(int i = 0 ; i < 7; i++){
            String a1 = (String) arr[i][0];

            for(int j = 0; j < N; j++){
                String a2 = (String) logs[j][0];
                if(a1.equals(a2)){
                    int a = (int) arr[i][1];
                    int b = (int) logs[j][1];
                    arr[i][1] = a + b;
                }
            }
        }
        int [] values = new int[7];
        for(int i = 0; i < 7; i++){
            int integer = (int) arr[i][1];
            values[i]= integer;
        }

        Arrays.sort(values);
        int least = values[0]; int counter = 0;
        String ans = "";
        int ans1 = 0;
        boolean stop = false;
        for (int value : values) {
            if (value != least) {
                stop = true;
                int cout = 0;
                for (int j = 0; j < 7; j++) {
                    if ((int) arr[j][1] == value) {
                        ans = (String) arr[j][0];
                        ans1 = value;
                        cout++;
                    }
                }
                if (cout == 1) {
                    out.println(ans);
                    out.close();

                } else if (cout > 1 || ans1 == 0) {
                    out.println("Tie");
                    out.close();
                }
                break;
            }
        }
        if(!stop){
            out.println("Tie");
            out.close();
        }
    }
}
