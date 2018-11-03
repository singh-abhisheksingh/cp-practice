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
		int N = sc.nextInt();
		int Q = sc.nextInt();
		int arr[][] = new int[N][3];
		for (int i=0; i<N; i++){
		    arr[i][0] = sc.nextInt();
		    arr[i][1] = sc.nextInt();
		    arr[i][2] = sc.nextInt();
		}
		ArrayList<Double> MAX = new ArrayList<Double>();
		ArrayList<Double> MIN = new ArrayList<Double>();
		for (int i=0; i<N; i++){
	        for (int j=i+1; j<N; j++){
	            int x1 = arr[i][0], y1 = arr[i][1], r1 = arr[i][2];
	            int x2 = arr[j][0], y2 = arr[j][1], r2 = arr[j][2];
	            double dist = Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
	            double max = dist + r1 + r2;
	            double min = 0;
	            
	            if(dist>r1+r2){
	                min = dist - r1 - r2;
	            }
	            else if(dist<Math.abs(r1-r2)){
	                min = Math.abs(r1-r2) - dist;
	            }
	            MAX.add(max);
	            MIN.add(min);
	        }
		}
		for (int q=0; q<Q; q++){
		    int count = 0;
		    int K = sc.nextInt();
		    for (int i=0; i<MAX.size(); i++){
		        if((K<=MAX.get(i)) && (K>=MIN.get(i))){
		            count++;
		        }
		    } 
		    System.out.println(count);
		}
	}
}
