/*
In this kata, you must create a digital root function.

A digital root is the recursive sum of all the digits in a number. 
Given n, take the sum of the digits of n. 
If that value has two digits, continue reducing in this way until a single-digit number is produced.
This is only applicable to the natural numbers.
*/

import java.util.*;

public class DRoot {
  public static int digital_root(int n) {
    
    int result = 0;
    Integer parsedN = n;
    String stringN = parsedN.toString();
    
    if(n < 0)
    return n;
    
    do
    {
    result = 0;
    for(int i = 0; i < stringN.length();i++)
    {
    if(stringN.charAt(i) == 48)
        result += 0;
    else
    result += (int)stringN.charAt(i) - 48;
    }
    Integer newResult = result;
    stringN = newResult.toString();
    }while (result >= 10);
    
    return result;
  }
}