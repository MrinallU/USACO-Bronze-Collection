
/*
ID: your_id_here
LANG: JAVA
TASK: lineup
*/
import java.io.*;
import java.util.*;
public class lineup{
    boolean check(String [][] logs, int [] arr){
        for(int i = 0; i < logs.length; i++){
            int a = 0; int b =  0;
            if(logs[i][0].equals("Beatrice")){
                a = 1;
            }
            if(logs[i][0].equals("Belinda")){
                a = 2;
            }
            if(logs[i][0].equals("Bella")){
                a = 3;
            }
            if(logs[i][0].equals("Bessie")){
                a = 4;
            }
            if(logs[i][0].equals("Betsy")){
                a = 5;
            }
            if(logs[i][0].equals("Blue")){
                a = 6;
            }
            if(logs[i][0].equals("Buttercup")){
                a = 7;
            }
            if(logs[i][0].equals("Sue")){
                a = 8;
            }
            if(logs[i][1].equals("Beatrice")){
                b= 1;
            }
            if(logs[i][1].equals("Belinda")){
                b = 2;
            }
            if(logs[i][1].equals("Bella")){
                b = 3;
            }
            if(logs[i][1].equals("Bessie")){
                b = 4;
            }
            if(logs[i][1].equals("Betsy")){
                b = 5;
            }
            if(logs[i][1].equals("Blue")){
                b = 6;
            }
            if(logs[i][1].equals("Buttercup")){
                b= 7;
            }
            if(logs[i][1].equals("Sue")){
                b = 8;
            }
            if(!finalCheck(a, b, arr)){
                return false;
            }
        }
        return true;
    }

    boolean finalCheck(int a, int b,int [] arr) {
        int indexa = 0; int indexb=  0;
        for(int i  = 0; i < arr.length; i++){
            if(arr[i] == a){
                indexa = i + 1;
            }
            if(arr[i] == b){
                indexb = i + 1;
            }
        }
        return Math.abs(indexa - indexb) == 1;
    }

    boolean nextPermutation(int[] array) {
        // Find longest non-increasing suffix
        int i = array.length - 1;
        while (i > 0 && array[i - 1] >= array[i])
            i--;
        // Now i is the head index of the suffix

        // Are we at the last permutation already?
        if (i <= 0)
            return false;

        // Let array[i - 1] be the pivot
        // Find rightmost element that exceeds the pivot
        int j = array.length - 1;
        while (array[j] <= array[i - 1])
            j--;
        // Now the value array[j] will become the new pivot
        // Assertion: j >= i

        // Swap the pivot with j
        int temp = array[i - 1];
        array[i - 1] = array[j];
        array[j] = temp;

        // Reverse the suffix
        j = array.length - 1;
        while (i < j) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }

        return true;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("lineup.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("lineup.out")));
        int N = sc.nextInt(); String [][] logs = new String[N][2]; String[] arr = new String [8]; int [] arr1  = new int[8];
        for(int i = 0; i < N; i++){
            logs[i][0] = sc.next();
            String a = sc.next();String b = sc.next();String c = sc.next();String d = sc.next();
            logs[i][1] = sc.next();
        }
        arr1[0] = 1;  arr1[1] =2; arr1[2] =3; arr1[3] = 4; arr1[4] = 5; arr1[5] = 6; arr1[6] = 7; arr1[7] = 8;
        arr[0] = "Beatrice";  arr[1] ="Belinda"; arr[2] ="Bella"; arr[3] = "Bessie"; arr[4] = "Betsy"; arr[5] = "Blue"; arr[6] = "Buttercup"; arr[7] = "Sue";
        while (new lineup().nextPermutation(arr1)){
            if(new lineup().check(logs, arr1)) {
                for (int i = 0; i < arr1.length; i++){
                    if(arr1[i] == 1){
                        out.println("Beatrice");
                    }
                    if(arr1[i] == 2){
                        out.println("Belinda");
                    }
                    if(arr1[i] == 3){
                        out.println("Bella");
                    }
                    if(arr1[i] == 4){
                        out.println("Bessie");
                    }
                    if(arr1[i] == 5){
                        out.println("Betsy");
                    }
                    if(arr1[i] == 6){
                        out.println("Blue");
                    }
                    if(arr1[i] == 7){
                        out.println("Buttercup");
                    }
                    if(arr1[i] == 8){
                        out.println("Sue");
                    }
                }

                break;
            }
        }


        out.close();
    }


}




