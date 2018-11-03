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
		    int i = 1;
		    long bitt=1, nibbble=0, bytee=0;
		    int count = 0;
		    while(i<=N){
		        if(count==2){
		            nibbble = bitt;
		            bitt = 0;
		        }
		        else if(count==10){
		            bytee = nibbble;
		            nibbble = 0;
		        }
		        else if(count==26){
		            bitt = 2*bytee;
		            bytee = 0;
		            count = 0;
		        }
		        count++;
		        i++;
		    }
		    System.out.println(bitt+" "+nibbble+" "+bytee);
		} 
	}
}
