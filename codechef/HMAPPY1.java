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
		int Q = sc.nextInt();
		int K = sc.nextInt();
		int arr[] = new int[N];
		for (int i=0; i<N; i++){
		    arr[i] = sc.nextInt();
		}
		
		String str = sc.next();
		int pos = 0;
		while(pos<Q){
    		char ch = str.charAt(pos);
		    if(ch=='?'){
		        int max = 0, count = 0;
		        for (int i=0; i<N; i++){
        		    if(arr[i]==1){
        		        count++;
        		    }
        		    else{
        		        if(count>max){
        		            max = count;
        		        }
        		        count = 0;
        		    }
        		}
        		if(count>max){
		            max = count;
		        }
        		if(max<K){
        		    System.out.println(max);
        		}
        		else{
        		    System.out.println(K);
        		}
		    }
		    else{
		        int temp = arr[N-1];
		        for(int i=N-2; i>=0; i--){
		            arr[i+1] = arr[i];
		        }
		        arr[0] = temp;
		    }
		    pos++;
		}
	}
}
