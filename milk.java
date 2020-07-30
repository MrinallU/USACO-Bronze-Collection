
/*
ID: your_id_here
LANG: JAVA
TASK: milk
*/
import java.io.*;
 
import java.util.*;

    public class milk{

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("milk.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("milk.out")));
        int milkDesired = sc.nextInt();
        int N = sc.nextInt();
        int[][] arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }


        int currentMilk = 0; int money = 0;

        while (currentMilk != milkDesired) {
            java.util.Arrays.sort(arr, (o1, o2) -> {
                if (o1[1] == 0 && o2[1] > 0) {
                    return Integer.compare(o2[1], o1[1]);
                } else if (o2[1] == 0 && o1[1] > 0) {
                    return Integer.compare(o2[1], o1[1]);
                } else if (o1[1] == 0 && o2[1] == 0) {
                    return Integer.compare(o1[1], o2[1]);
                }
                    return Integer.compare(o1[0], o2[0]);

            });
            if(currentMilk + arr[0][1] < milkDesired){
                currentMilk += arr[0][1];
                money += arr[0][0] * arr[0][1];
                arr[0][1] = 0;
            }else{
                int x = milkDesired - currentMilk;
                money += x * arr[0][0];
                break;
            }
        }
        out.println(money);
        out.close();
    }
}




