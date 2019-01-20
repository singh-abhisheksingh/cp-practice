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
		    int P = sc.nextInt();
		    int i = (N/2)+1;
		    int rem = N%i;
		    int answer=0;
		    if((N==2)||(N==1)){
		        answer = (P-rem)*(P-rem)*(P-rem);
		    }
		    else
		    {
    		    answer = (P-rem)*(P-rem);
    		    if(P>N){
    		        answer += (P-N)*(P-rem);
    		        answer += (P-N)*(P-N);
    		    }
		    }
		   
            System.out.print(answer+"\n");
		} 
	}
}
