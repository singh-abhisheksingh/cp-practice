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
		int arrmax[] = new int[N+1];
		int arrmin[] = new int[N+1];
		for (int i=1; i<=N; i++){
		    arrmax[i] = i+1;
		    arrmin[i] = i-1;
		}
		arrmax[N] = 1;
		arrmin[1] = N;
		
	    int temp = arrmax[N];
        arrmax[N] = arrmax[(N+1)/2];
        arrmax[(N+1)/2] = temp;
	
		for (int i=1; i<=N; i++){
		    System.out.print(arrmax[i]+" ");
		}
		System.out.println();
		for (int i=1; i<=N; i++){
		    System.out.print(arrmin[i]+" ");
		}
	}
}
