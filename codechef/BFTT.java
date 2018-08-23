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
		int t = sc.nextInt();
		for(int i=1; i<=t; i++){
		    long n = sc.nextLong();
		    int flag=1;
		    n++;
		    while(flag==1){
		        if(count(n)>=3){
		            System.out.println(n);
		            flag=0;
		        }
		        else
                    n++;		           
		    }
		}
	}
	public static int count(long num){
	    long temp = num;
	    int c=0;
	    while(temp != 0){
	        int d = (int)(temp%10);
	        if (d==3)
	            c++;
	        temp = temp/10;
	    }
	    return c;
	}
}
