
import java.io.*;
import java.util.*;

    public class sheepSave{
        String dfs(char [][] a, int pos, int pos1){
            if(pos + 1 < a.length){
                if(a[pos + 1][pos1] == 'W'){
                    return "NO";
                }
            }
            if(pos1 - 1 >= 0){
                if(a[pos][pos1 - 1] == 'W'){
                    return "NO";
                }
            }
            if(pos - 1 >= 0){
                if(a[pos - 1][pos1] == 'W'){
                    return "NO";
                }
            }
            if(pos1 + 1 < a[0].length){
                if(a[pos][pos1 + 1] == 'W'){
                    return "NO";
                }
            }
            return "YES";
        }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(); int c = sc.nextInt(); char [][] arr = new char[r][c];
        for(int i = 0; i < r; i++){
            String s = sc.next();
            arr[i] = s.toCharArray();
        }
        sc.close();
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(arr[i][j] == '.'){
                    arr[i][j] = 'D';
                }else if(arr[i][j] == 'S'){
                    String conf = new sheepSave().dfs(arr, i, j);
                    if(conf.equals("NO")){
                        System.out.print("No");
                        System.out.close();
                    }
                }
            }
        }
        System.out.println("Yes");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(i == r - 1 && j == c - 1){
                    System.out.print(arr[i][j]);
                }else if(j ==  c - 1){
                    System.out.println(arr[i][j]);
                }else {
                    System.out.print(arr[i][j]);
                }
            }
        }
        System.out.close();
    }
}




