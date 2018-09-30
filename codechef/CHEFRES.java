/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t=1; t<=T; t++){
		    int N = sc.nextInt();
		    int M = sc.nextInt();
		    NavigableMap<Integer, Integer> nm = new TreeMap<Integer, Integer>();
		    for (int i=0; i<N; i++){
		        int L = sc.nextInt();
		        int R = sc.nextInt();
		        nm.put(L, 1);
		        nm.put(R, 0);
		    }
		    for (int i=0; i<M; i++){
		        int P = sc.nextInt();
		        if(nm.higherKey(P) == null){
		            System.out.println("-1");
		            continue;
		        }
		        int nextKey = nm.higherKey(P);
		        int nextKeyValue = nm.get(nextKey);
		        if(nextKeyValue == 0){
		            System.out.println("0");
		        }
		        else if(nextKeyValue == 1){
		            System.out.println(nextKey-P);
		        }
		        else{
		            System.out.println("-1");
		        }
		    }
		}
	}
}
