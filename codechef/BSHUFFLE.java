/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static HashMap<String, Integer> map = new HashMap<>();
    static int max = 0, min = 0;
    static String maxval, minval;
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char arr[] = new char[N];
		for (int i=0; i<N; i++){
		    arr[i] = Integer.toString(i+1).charAt(0);
		}
// 		System.out.println("Initial Mappings are: " + map);
		printAllKLength(arr, N);
// 		System.out.println("Finally the map looks like this: " + map);
		
        Map.Entry<String, Integer> minn = null;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (minn == null || minn.getValue() > entry.getValue()) {
                minn = entry;
            }
        }
		minval = minn.getKey();
		
// 		System.out.println("Max Value: " + maxval + " with count= " + max);
// 		System.out.println("Min Value: " + minval + " with count= " + minn);
		
		String maxprint = "", minprint = "";
		for (int i=0; i < maxval.length(); i++){
		    maxprint = maxprint + maxval.charAt(i) + " ";
		    minprint = minprint + minval.charAt(i) + " ";
		}
		maxprint.trim();
		minprint.trim();
		
		System.out.println(maxprint);
		System.out.println(minprint);
		
	}
	
    static void printAllKLength(char[] set, int k) 
    { 
        int n = set.length;  
        printAllKLengthRec(set, "", n, k); 
    } 

    static void printAllKLengthRec(char[] set, String prefix, int n, int k) 
    {
        if (k == 0){
            String finalprefix = randomizing(prefix);
            Integer c = map.get(finalprefix); 
            
            if (map.get(finalprefix) == null) 
                map.put(finalprefix, 1); 
            else{
                ++c;
                if(max < c){
                    max = c;
                    maxval = finalprefix;
                }
                map.put(finalprefix, c);
            }
                
            return; 
        }
        
        for (int i = 0; i < n; ++i) {
            String newPrefix = prefix + set[i];
            printAllKLengthRec(set, newPrefix, n, k - 1);  
        } 
    }
    
    static String randomizing(String str){
        char arr[] = new char[str.length()];
        for (int i=0; i<arr.length; i++){
		    arr[i] = Integer.toString(i+1).charAt(0);
		}
        for (int i=0; i<arr.length; i++){
            char ch = str.charAt(i);
            int pos = (int)ch - 49;
            char temp = arr[i];
            arr[i] = arr[pos];
            arr[pos] = temp;
        }
        String newstr = new String(arr);
        return newstr;
    }
	
}
