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
	    int n[] = new int[N];
	    int m[] = new int[M];

	    int maxN=Integer.MIN_VALUE, maxNi=0;
	    int minM=Integer.MAX_VALUE, minMi=0;

	    for(int i=0; i<N; i++){
            n[i] = sc.nextInt();
            if(n[i]>maxN){
                maxN = n[i];
                maxNi = i;
            }
	    }
	    for(int i=0; i<M; i++){
	        m[i] = sc.nextInt();
            if(m[i]<minM){
                minM = m[i];
                minMi = i;
            }
	    }
	    
	    for(int i=0; i<N; i++){
	        System.out.println(i+" "+minMi);
	    }
	    for(int i=0; i<M; i++){
	        if(i==minMi){
	            continue;
	        }
	        System.out.println(maxNi+" "+i);
	    }
	  
	}
}
