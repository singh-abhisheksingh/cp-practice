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
		    int Q = sc.nextInt();
		    int arr[] = new int[N];
		    
		    for (int i=0; i<N; i++){
		        arr[i] = sc.nextInt();
		    }
		    for (int q=1; q<=Q; q++){
		        int L = sc.nextInt();
		        int R = sc.nextInt();
		        
		        int count = 0;
		        for (int i=L-1; i<R; i++){
		            for (int j=i; j<R; j++){
		                long and = (long)arr[i];
		                for (int k=i; k<=j; k++){
		                  // System.out.print(k+" "); 
		                    and = and & (long)arr[k];
		                }
		                double perfect = Math.sqrt(and);
	                    if((perfect - Math.floor(perfect)) == 0){
	                        count++;
	                    }
		              //  System.out.println(and);
		            }
		        }
		        System.out.println(count);
		    }
		}
	}
}