
/*
ID: your_id_here
LANG: JAVA
TASK: circlecross
*/
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
public class circlecross{
    public static void main(String[ ] args) throws IOException {
        Scanner sc = new Scanner(new File("circlecross.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("circlecross.out")));
        String s = sc.next(); char [] arr = s.toCharArray();
        int pair = 0;
        char [] a =  {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        for(int i = 0; i < 26; i++){
            for(int j = 0; j < 26; j++){
                    char letter1 = a[i]; char letter2 = a[j];
                 
                    int count1 = 0; int count2 = 0 ;
                    int l1Start =0 ; int l2Start =0 ;
                    int l1End = 0;  int l2End =  0;
                    for(int k = 0 ;  k < arr.length; k++){
                        if(count1 == 1 && a[i] == arr[k]){
                            l1End = k;
                            count1++;
                        
                        }
                        if(count1 == 0 && a[i] == arr[k]){
                            l1Start = k;
                            count1++;
                           
                        }

                        if(count2 == 1 && a[j] == arr[k]){
                            l2End = k;
                            count2++;
                        }
                        if(count2 == 0 && a[j] == arr[k]){
                            l2Start = k;
                            count2++;
                        }

                    }
                if(l1Start < l2Start && l1End < l2End && l2Start < l1End){
                    pair++;
                }
            }
        }
        out.println(pair);
        out.close();
    }
}
