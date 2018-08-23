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
		int t = sc.nextInt();
		for(int i=1; i<=t; i++){
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    int arr[] = new int[n];
		    int score=0, player=1;
		    for(int j=0; j<n; j++){
		        arr[j] = sc.nextInt();
		        if((arr[j]==1) && (player==1)){
		            if(score<0)
		                score--;
		            else
		               score++;
		        }
		        else if((arr[j]==1) && (player==-1)){
                    if(score<0)
		                score++;
		            else
		               score--;
		        }
		        player=player*-1;
		    }
		    if(Math.abs(score)>=k)
		        System.out.println(1);
		    else
		        System.out.println(2);
		}
	}
}
