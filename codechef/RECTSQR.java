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
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int big = Math.max(a,b);
		    int small = Math.min(a,b);
		    int area=0;
		    for(int side=1; side<=small; side++){
    		    for(int i=0; i<small; i++){
    		        int ai = side+i;
    		        if(ai>small){
    		            break;
    		        }
    		        for(int j=0; j<big; j++){
    		            int bi = side+j;
    		            if(bi>big){
    		                break;
    		            }
    		            area += side*side;
    		        }
    		    }
		    }
		    System.out.println(area);
		}
	}
}