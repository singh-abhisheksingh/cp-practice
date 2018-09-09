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
		    int M = sc.nextInt();
		    int X = sc.nextInt();
		    int Y = sc.nextInt();
		    int pq = (N-1);
		    int kq = (M-1);
		    if((pq==0 && kq==0) || (pq==1 && kq==1)){
		        System.out.println("Chefirnemo");
		    }
		    else{
		        int a = pq % X;
		        int b = kq % Y;
		        if((a==0 && b==0) || (a==1 && b==1)){
		            System.out.println("Chefirnemo");
		        }
		        else{
		            pq--;
    		        kq--;
    		        if((pq<0) || (kq<0)){
    		            System.out.println("Pofik");
    		            continue;
    		        }
    		        pq = pq % X;
		            kq = kq % Y;
		            if(pq==0 && kq==0){
    		            System.out.println("Chefirnemo");
    		        }
    		        else{
    		            System.out.println("Pofik");
    		        }
		        }
		    }
		}
	}
}
