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
		for(int t=1; t<=T; t++){
		    int N = sc.nextInt();
		    int K = sc.nextInt();
		    int arr[] = new int[N];
		    String str = "";
		    for(int i=0; i<N; i++){
		        arr[i] = sc.nextInt();
		        if(K>=arr[i]){
		            str += "1";
		            K = K - arr[i];
		        }
		        else{
		            str += "0";
		        }
		    }
		    System.out.println(str);
		}
	}
}
