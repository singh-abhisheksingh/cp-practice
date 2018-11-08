/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

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
		    int countArr[] = new int[N+1];
		    Multimap<Integer, Integer> multimap = ArrayListMultimap.create();
		    for (int i=1; i<=N; i++){
		        int input = sc.nextInt();
		        countArr[input]++;
		        multimap.put(input ,i);
		    }
		    
		    int flag = 0;
		    for (int i=1; i<=N; i++){
		        if(countArr[i]>=2){
	               
	                HashMap<Integer, Integer> hmap = new HashMap<>();
	                int count = 0;
                    for (Integer value : multimap.get(i)){
                        Integer c = hmap.get(value);
                        if(c==null){
                            hmap.put(value, 1);
                            if(multimap.containsKey(value)){
                                count++;
                            }
                        }
                        else{
                            hmap.put(value, ++c);
                        }
                        if(count>=2){
                            flag = 1;
                            break;
                        }
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
