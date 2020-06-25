/*
ID: your_id_here
LANG: JAVA
TASK: friday
*/
import java.io.*;
import java.util.*;
public class friday {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(new File("friday.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("friday.out")));
        int N = s.nextInt();
        int [] a =  new int [7];
        int wd = 1;
        int day = 30;
        for(int u = 0; u < N; u++){
            boolean century = false;
            boolean leap=  false;
            int year = 1900 + u;
            if(year % 100 == 0){
                century = true;
            }
            if(century && year % 400 == 0){
                leap = true;
            }
            if(!century && year % 4 == 0){
                leap = true;
            }
            for(int d = 0; d < 12; d++){

                if(d == 1){
                    if(leap){
                        day = 29;
                    }else{
                        day = 28;
                    }
                }
                if(d == 8 || d ==  3 || d == 5 || d == 10){
                    day = 30;
                }else if(d == 0 || d == 2 ||d == 4 || d == 6 || d == 7 || d == 9 ||d == 11){
                    day = 31;
                }
                for(int i = 0; i < day; i++){

                    if(i == 12){
                        if(wd == 6){
                            a[0] += 1;
                        }
                        if(wd == 7){
                            a[1] += 1;
                        }
                        if(wd == 1){
                            a[2] += 1;
                        }
                        if(wd == 2){
                            a[3] += 1;
                        }
                        if(wd == 3){
                            a[4] += 1;
                        }
                        if(wd == 4){
                            a[5] += 1;
                        }
                        if(wd == 5){
                            a[6] +=  1;
                        }
                    }
                    wd++;
                    if(wd == 8){
                        wd = 1;
                    }
                }
            }
        }
       for(int i = 0 ; i < a.length;  i++){
            if(i < a.length - 1) {
                out.print(a[i] + " ");
            }else{
                out.print(a[i]);
            }
        }
        out.println("");
        out.close();
    }
}


