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
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int ar=0, br=0, cr=0;
		    for(int i=0; i<N; i++){
		        int n = sc.nextInt();
		        if(n%a==0){
		            if(n%b==0){
		                cr++;
		            }
		            else{
		                ar++;
		            }
		        }
		        else if(n%b==0){
		            br++;
		        }
		    }
		  //  System.out.println("a="+ar+" b="+br+" c="+cr);
		    if(ar==br){
		        if(cr==0){
		            System.out.println("ALICE");
		        }
		        else{
		            System.out.println("BOB");
		        }
		    }
		    else if(ar<br){
                System.out.println("ALICE");
		    }
		    else{
		        System.out.println("BOB");
		    }
		} 
	}
}
