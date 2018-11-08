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
		    HashMap<Integer, Integer> hmap = new HashMap<>();
		    HashMap<Integer, Integer> hmap2 = new HashMap<>();
		    int flag = 0;
		    
		    for (int i=1; i<=N; i++){
		        hmap.put(i, sc.nextInt());
		    }
		    for (Integer i : hmap.keySet()){
		        Integer value = hmap.get(i);
		        Integer finalValue = hmap.get(value);
		        hmap2.put(i, finalValue);
		    }
		    for (Integer i : hmap2.keySet()){
		        for (Integer j : hmap2.keySet()){
		            if((i==j)||(flag==1)){
		                continue;
		            }
		            if(hmap2.get(i)==hmap2.get(j)){
		                if(hmap.get(i)==hmap.get(j)){
		                    continue;
		                }
		                flag = 1;
		            }
		        }
		    }
		    if(flag==1){
		        System.out.println("Truly Happy");
		    }
		    else{
		        System.out.println("Poor Chef");
		    }
		}
	}
}
