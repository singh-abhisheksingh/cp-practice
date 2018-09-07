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
		    int X = sc.nextInt();
		    int S = sc.nextInt();
		    int ans = X;
		    for (int i=1; i<=S; i++){
		        int a = sc.nextInt();
		        int b = sc.nextInt();
		        if(ans==a){
		            ans = b;
		        }
		        else if(ans==b){
		            ans = a;
		        }
		    }
		    System.out.println(ans);
		} 
	}
}
