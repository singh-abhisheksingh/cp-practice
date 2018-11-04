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
		    HashMap<Integer, Integer> tmap = new HashMap<Integer, Integer>();
		    int N = sc.nextInt();
		    for (int i=0; i<N; i++){
		        int temp = sc.nextInt();
		        Integer c = tmap.get(temp);
                if (tmap.get(temp) == null) 
                    tmap.put(temp, 1);
                else
                    tmap.put(temp, ++c); 
            }
            int total = 0;
            for(Map.Entry<Integer, Integer> entry1 : tmap.entrySet()){
                for(Map.Entry<Integer, Integer> entry2 : tmap.entrySet()){
                    
                    Integer a = entry1.getKey();
                    Integer b = entry2.getKey();
                
                    int a_count = tmap.get(a);
                    int b_count = tmap.get(b);
                    
                    if((b_count>=a)&&(a_count>=b)){
                        total++;
                    }
                }
            }
            System.out.println(total);
		}
	}
}
