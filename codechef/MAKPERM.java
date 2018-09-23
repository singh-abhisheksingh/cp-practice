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
		    HashMap<Integer, Integer> hmap = new HashMap<>();
		    int count = 0;
		    for(int i=0; i<N; i++){
		        int input = sc.nextInt();
		        Integer c = hmap.get(input);
		        if(input>N){
		            count++;
		            continue;
		        }
		        if (hmap.get(input) == null){
		            hmap.put(input, 1); 
		        }
                else {
                    hmap.put(input, ++c);
                    count++;
                }
		    }
		    System.out.println(count);
		}
	}
}
