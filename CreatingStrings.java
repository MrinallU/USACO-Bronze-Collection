
/*
ID: your_id_here
LANG: JAVA
TASK: square
*/
import java.io.*;

import java.util.*;
// Class for the customer

public class CreatingStrings{
 
     public static int[] swap(int data[], int left, int right) 
    { 
  
      
        int temp = data[left]; 
        data[left] = data[right]; 
        data[right] = temp; 
  
         
        return data; 
    } 
  
    // Function to reverse the sub-array 
    // starting from left to the right 
    // both inclusive 
    public static int[] reverse(int data[], int left, int right) 
    { 
  
        // Reverse the sub-array 
        while (left < right) { 
            int temp = data[left]; 
            data[left++] = data[right]; 
            data[right--] = temp; 
        } 
  
        // Return the updated array 
        return data; 
    } 
  
    // Function to find the next permutation 
    // of the given integer array 
    public static boolean findNextPermutation(int data[]) 
    { 
  
        // If the given dataset is empty 
        // or contains only one element 
        // next_permutation is not possible 
        if (data.length <= 1) 
            return false; 
  
        int last = data.length - 2; 
  
        // find the longest non-increasing suffix 
        // and find the pivot 
        while (last >= 0) { 
            if (data[last] < data[last + 1]) { 
                break; 
            } 
            last--; 
        } 
  
        // If there is no increasing pair 
        // there is no higher order permutation 
        if (last < 0) 
            return false; 
  
        int nextGreater = data.length - 1; 
  
        // Find the rightmost successor to the pivot 
        for (int i = data.length - 1; i > last; i--) { 
            if (data[i] > data[last]) { 
                nextGreater = i; 
                break; 
            } 
        } 
  
        // Swap the successor and the pivot 
        data = swap(data, nextGreater, last); 
  
        // Reverse the suffix 
        data = reverse(data, last + 1, data.length - 1); 
  
        // Return true as the next_permutation is done 
        return true; 
    } 
  
 public static void main(String[] args) throws Exception {
        FastIO sc = new FastIO(System.in);
      
	 String s = sc.next(); int N = s.length(); HashMap<String, Integer> strings = new HashMap<>();    
	HashMap<Integer, Character> map = new HashMap<>(); int [] a = new int[N];
	for(int i = 0 ; i < N; i++){
		a[i] = i; map.put(i, s.charAt(i)); 
	}
	do{
		char [] arr = new char[a.length]; 
		for(int i = 0; i < a.length; i++){
			arr[i] = map.get(a[i]); 
		}
		String s1;
		StringBuilder s2 = new StringBuilder();

        for (char i: arr) {
            s2.append(i);
        }
        s1 = s2.toString();
		if(!strings.containsKey(s1)){
			strings.put(s1, 0); 
		}

	 
	}while(findNextPermutation(a));
	     String [] ans = new String[strings.size()];
	System.out.println(strings.size());
	int val = 0;
     for (String key: strings.keySet()) {

         ans[val] = key;
         val++;

     }
     java.util.Arrays.sort(ans, new java.util.Comparator<String>() {
         public int compare(String a, String b) {
             return CharSequence.compare(a, b);
         }
     });
     for (String i: ans) {
         System.out.println(i);
     }
 	 
    }

    // new FastIO("file_name") to read a file
    // new FastIO(System.in) to read from stdin
    // has similar syntax to Scanner, though much faster :)
    static class FastIO {
        InputStream dis;
        byte[] buffer = new byte[1 << 17];
        int pointer = 0;
        public FastIO(String fileName) throws Exception {
            dis = new FileInputStream(fileName);
        }
        public FastIO(InputStream is) throws Exception {
            dis = is;
        }
        int nextInt() throws Exception {
            int ret = 0;
            byte b;
            do {
                b = nextByte();
            } while (b <= ' ');
            boolean negative = false;
            if (b == '-') {
                negative = true;
                b = nextByte();
            }
            while (b >= '0' && b <= '9') {
                ret = 10 * ret + b - '0';
                b = nextByte();
            }
            return (negative) ? -ret : ret;
        }
        long nextLong() throws Exception {
            long ret = 0;
            byte b;
            do {
                b = nextByte();
            } while (b <= ' ');
            boolean negative = false;
            if (b == '-') {
                negative = true;
                b = nextByte();
            }
            while (b >= '0' && b <= '9') {
                ret = 10 * ret + b - '0';
                b = nextByte();
            }
            return (negative) ? -ret : ret;
        }
        byte nextByte() throws Exception {
            if (pointer == buffer.length) {
                dis.read(buffer, 0, buffer.length);
                pointer = 0;
            }
            return buffer[pointer++];
        }
        String next() throws Exception {
            StringBuffer ret = new StringBuffer();
            byte b;
            do {
                b = nextByte();
            } while (b <= ' ');
            while (b > ' ') {
                ret.appendCodePoint(b);
                b = nextByte();
            }
            return ret.toString();
        }
    }
}
