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
	    int N = sc.nextInt();
	    int M = sc.nextInt();
	    HashMap<Long, Integer> hmap = new HashMap<>();
	    int count = 0, flag = 0;
	    int a[] = new int[N];
	    int b[] = new int[M];
	    for(int i=0; i<N; i++){
	        a[i] = sc.nextInt();
	    }
	    for(int i=0; i<M; i++){
	        b[i] = sc.nextInt();
	        if(flag==1){
	            break;
	        }
	        for(int j=0; j<N; j++){
	            if(count==N+M-1){
	                flag = 1;
	                break;
	            }
	            long sum = (long)b[i] + (long)a[j];
	            if(hmap.containsKey(sum)){
	                continue;
	            }
	            else{
	                hmap.put(sum, 1);
	                count++;
	                System.out.println(j+" "+i);
	            }
	        }
	    }
	}
}
