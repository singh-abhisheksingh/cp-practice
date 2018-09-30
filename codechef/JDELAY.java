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
		    int count = 0;
		    for(int i=1; i<=N; i++){
		        int s = sc.nextInt();
		        int j = sc.nextInt();
		        if(j-s > 5){
		            count++;
		        }
		    }
		   System.out.println(count);
		} 
	}
}
