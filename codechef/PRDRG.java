/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

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
		    BigDecimal bigVal = new BigDecimal("0");
		    BigDecimal bigCount = new BigDecimal("0.5");
		    BigDecimal deno = new BigDecimal("1");
		    BigInteger denominator = new BigInteger("1");
		    BigInteger numerator;
		    
		    while(N!=0){
		        bigVal = bigVal.add(bigCount);
		        bigCount = bigCount.multiply(new BigDecimal("-0.5"));
		        deno = deno.multiply(new BigDecimal("10"));
		        denominator = denominator.multiply(new BigInteger("10"));
		        N--;
		    }
		    bigVal = bigVal.multiply(deno);
		    numerator = bigVal.toBigInteger();
		  //  System.out.println("deno= "+deno);
		  //  System.out.println("numerator= "+numerator);	
		  //  System.out.println("denominator= "+denominator);
		    BigInteger hcf =  gcd(numerator, denominator);
		  //  System.out.println("gcd= "+hcf);
		    System.out.print(numerator.divide(hcf)+" "+denominator.divide(hcf)+" ");
		  
		}
	}
	static BigInteger gcd(BigInteger a, BigInteger b) 
    { 
        if (b.compareTo(new BigInteger("0")) == 0) 
            return a; 
        return gcd(b, a.mod(b)); 
    }
}
