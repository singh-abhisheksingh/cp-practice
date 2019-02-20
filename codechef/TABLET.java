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
		    int B = sc.nextInt();
		    int max = 0;
		    for(int i=0; i<N; i++){
		        int W = sc.nextInt();
		        int H = sc.nextInt();
		        int P = sc.nextInt();
		        int area = W*H;
		        if(area>max && P<=B){
		            max = area;
		        }
		    }
		    if(max==0){
		        System.out.print("no tablet\n");
		    }
		    else{
		        System.out.print(max+"\n");
		    }
		} 
	}
}