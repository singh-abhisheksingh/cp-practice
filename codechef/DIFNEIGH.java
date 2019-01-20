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
		    if(N==1&&M==1){
		        System.out.println("1");
		        System.out.println("1");
		    }
		    else if(N==2&&M==1){
		        System.out.println("1");
		        System.out.println("1\n1");
		    }
		    else if(N==1&&M==2){
		        System.out.println("1");
		        System.out.println("1 1");
		    }
		    else if(N==2&&M==2){
		        System.out.println("2");
		        System.out.println("1 2\n1 2");
		    }
		    else if(N>=3&&M==1){
		        System.out.println("2");
		        for(int i=1; i<=N; i++){
		            if(i%4==1||i%4==2){
		                System.out.println("1");
		            }
		            else{
		                System.out.println("2");
		            }
		        }
		    }
		    else if(N==1&&M>=3){
		        System.out.println("2");
		        for(int i=1; i<=M; i++){
		            if(i%4==1||i%4==2){
		                System.out.print("1 ");
		            }
		            else{
		                System.out.print("2 ");
		            }
		        }
		        System.out.println();
		    }
		    else if(N==2&&M>=3){
		        System.out.println("3");
		        int a = 1;
		        for(int i=1; i<=N; i++){
		            for(int j=1; j<=M; j++){
		                System.out.print(a+" ");
		                a++;
		                if(a==4){
		                    a=1;
		                }
		            }
		            System.out.println();
		            a=1;
		        }
		    }
		    else if(N>=3&&M==2){
		        System.out.println("3");
		        for(int i=1; i<=N; i++){
		            int a = i%3;
	                if(a==0){
	                    a=3;
	                }
		            for(int j=1; j<=M; j++){
		                System.out.print(a+" ");
		            }
		            System.out.println();
		        }
		    }
		    else{
		        System.out.println("4");
		        int a = 1, b = 3;
		        for(int i=1; i<=N; i++){
		            for(int j=1; j<=M; j++){
		                if(i%4==1||i%4==2){
    		                System.out.print(a+" ");
    		                a++;
		                }
		                else{
		                    System.out.print(b+" ");
		                    b++;
		                }
		                if(a==5){
		                    a=1;
		                }
		                if(b==5){
		                    b=1;
		                }
		            }
		            System.out.println();
		            a = 1;
		            b = 3;
		        }
		    }
		} 
	}
}