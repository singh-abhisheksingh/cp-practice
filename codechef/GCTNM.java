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
		for(int t=1; t<=T; t++){
		    String s = sc.nextLine();
		    s = s + " ";
		    int c = 0, len = 0, flag = 1;
		    String str = "Government College of Engineering & Textile Technology Berhampore ";
		    str = str.toLowerCase();
		    s = s.toLowerCase();
		    for(int i=0; i<s.length(); i++){
		        char ch = s.charAt(i);
		        if(ch != ' '){
		            len++;
		            if(ch != str.charAt(i)){
		                c++;
		            }
		        }
		        else{
		            if(c > len/2){
		                flag = 0;
		            }
		            c = 0;
		            len = 0;
		        }
		    }
		    if(flag == 1)
		       System.out.println("accept");
		    else 
		       System.out.println("reject");
		}
	}
}