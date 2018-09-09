/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static int c = 0;
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t=1; t<=T; t++){
		    int N = sc.nextInt();
		    int arr[] = new int[N];
		    for (int i=0; i<N; i++){
		        arr[i] = sc.nextInt();
		    }
		    c = 0;
		    int comb[]=new int[2];
		    combinations(arr, N, 2, 0, comb, 0);
		    System.out.println(c);
		}
	}
	
	static void combinations(int arr[], int n, int r, int index, int comb[], int i)
    {
        if (index == r)
        {
            int ai = comb[0];
            int aj = comb[1];
            if(ai==aj){
                return;
            }
            if((ai%2==0 && aj%2==0) || (ai%2!=0 && aj%2!=0)){
                if (((ai%4==0 && (ai+2)==aj)||(aj%4==0 && (aj+2)==ai)) || ((ai%4==1 && (ai+2)==aj)||(aj%4==1 && (aj+2)==ai)) ){
                    return;
                }
                c++;
            }
            return;
        }
        if (i >= n)
            return;
        comb[index] = arr[i];
        combinations(arr, n, r, index+1, comb, i+1);
        combinations(arr, n, r, index, comb, i+1);
    }
    
}
