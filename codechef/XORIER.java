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
            LinkedHashMap<Long, Long> lhmap = new LinkedHashMap<Long, Long>();
            long odd = 0;
            long even = 0;
            for(int i=1; i<=N; i++){
                long element = sc.nextLong();
                if(element%2==0){
                    even++;
                }
                else{
                    odd++;
                }
                if(lhmap.get(element) == null){
                    long one = 1;
                    lhmap.put(element, one);
                }
                else{
                    long count = lhmap.get(element);
                    lhmap.put(element, ++count);
                }
            }
            long total = odd*(odd-1)/2 + even*(even-1)/2;
            // System.out.println(total);
            for (Map.Entry<Long, Long> m : lhmap.entrySet()){
                long element = m.getKey();
                long count = m.getValue();
                long duplicate = count*(count-1)/2;
                // System.out.println(duplicate+" of "+element);
                total -= duplicate;
                if((element%4==0 && lhmap.containsKey(element+2)) || (element%4==1 && lhmap.containsKey(element+2))){
                    Long i = element+2;
                    total -= count*lhmap.get(i);
                    // System.out.println(element+" "+(element+2)+" ka xor2 hata "+count+" baar");
                }
            }
            System.out.println(total);
        }
    }
}
