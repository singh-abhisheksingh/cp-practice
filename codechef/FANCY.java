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
		sc.nextLine();
		for (int t=1; t<=T; t++){
		    String s = sc.nextLine();
		    int flag  = 0;
		    if(s.equalsIgnoreCase("not")){
		        System.out.println("Real Fancy");
		        continue;
		    }
		    if(s.length()<4){
		        System.out.println("regularly fancy");
		        continue;
		    }
		    if((s.substring(0,4).equalsIgnoreCase("not "))||(s.substring(s.length()-4).equalsIgnoreCase(" not"))){
		        System.out.println("Real Fancy");
		        continue;
		    }
		    for(int i=0; i<s.length()-5; i++){
		        String temp = "";
		        for(int j=i; j<i+5; j++){
		            char ch = s.charAt(j);
		            temp += ch;
		        }
		        
		        if(temp.equalsIgnoreCase(" not ")){
		            flag  = 1;
		            break;
		        }
		        else{
		            temp = "";
		        }
		    }
		    if(flag==1){
		        System.out.println("Real Fancy");
		    }
		    else{
                System.out.println("regularly fancy");
		    }
		}
	}
}
