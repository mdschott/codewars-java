*/
The number 89 is the first integer with more than one digit that fulfills the property partially introduced in the title of this kata. 
What's the use of saying "Eureka"? Because this sum gives the same number.

In effect: 89 = 8^1 + 9^2

The next number in having this property is 135.

See this property again: 135 = 1^1 + 3^2 + 5^3

We need a function to collect these numbers, 
that may receive two integers a, b that defines the range [a, b] (inclusive),
and outputs a list of the sorted numbers in the range that fulfills the property described above.
*/

import java.util.*;
class SumDigPower {
    
    public static List<Long> sumDigPow(long a, long b) {
        // your code
        List<Long> result = new ArrayList<Long>();
        
        
        long x = 0;
        
        for(long i = a; i <= b; i++)
        {
        List<Long> myList = new ArrayList<Long>();
        long num = i;
        int n = 0;
        x = num;
		
		//Formula:
		//(K/10^(N-1)) mod 10 
        while(x >= 1)
        {
            myList.add((long)(num / (Math.pow(10, n))) % 10);
            n++;
            x = x / 10;
        }
        
        n = 1;
        long check = 0; 
        for(int j = myList.size() - 1; j >= 0; j--)
        {
           check += ((long)Math.pow(myList.get(j), n));
           n++;
        }
        
        if(check == i)
        {
            result.add(i);
        }
        
        }
          
        return result;
    }
}