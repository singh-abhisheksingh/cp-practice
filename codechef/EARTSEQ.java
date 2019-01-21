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
		    if(N==3){
		        System.out.print("6 10 15\n");
		        continue;
		    }
		    int x = 4, flag = 1, mainFlag = 0, temp = 49957, unique = 49957;
		  //  System.out.print("20011,49927\n49927,3\n3,49957\n");
		    System.out.print("999089197 149781 149871 ");
		    for(int i=4; i<=N; i++){
		        
		        if(i==N){
	               // System.out.println("!--------------------------");
	               // System.out.print(unique+",20011");
	                System.out.print(unique*20011);
	                break;
		        }
		        
		        if(x<=19999&&mainFlag==0){
		            if(flag==1){
    		          //  System.out.print(temp+","+x+"\n");
    		            System.out.print(temp*x+" ");
    		            unique = x;
    		            if(temp==49957){
    		                temp = 49943;
    		            }
    		            else{
    		                temp = 49957;
    		            }
		            }
		            else{
		                if(x==19999&&temp==49957){
		                    x++;
		                    temp = 49939;
		                    mainFlag = 1;
		                  //  System.out.println("Continuing");
		                    continue;
		                }
		              //  System.out.print(x+","+temp+"\n");
		                System.out.print(temp*x+" ");
		                unique = temp;
		                x++;
		            }
		            flag*=-1;
		        }
		        else{
		            if(x==20000){
		              //  System.out.println("--------------------------");
		                x--;
		            }
		            if(flag==1){
    		          //  System.out.print(temp+","+x+"\n");
    		            System.out.print(temp*x+" ");
    		            unique = x;
    		            if(temp==49939){
    		                temp = 49937;
    		            }
    		            else{
    		                temp = 49939;
    		            }
		            }
		            else{
		              //  System.out.print(x+","+temp+"\n");
		                System.out.print(temp*x+" ");
		                unique = temp;
		                x--;
		            }
		            flag*=-1;
		        }
		    }
		    System.out.print("\n");
		}
	}
}