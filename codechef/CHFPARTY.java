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
		    int arr[] = new int[N];
		    int sum = 0;
		    for(int i=0; i<N; i++){
		        arr[i] = sc.nextInt();
		    }
		    Arrays.sort(arr);
		    for(int i=0; i<N; i++){
		        if(arr[i]<=sum){
		            sum++;
		        }
		    }
		    System.out.print(sum+"\n");
		} 
	}
}