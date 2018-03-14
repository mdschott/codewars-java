*/
This time no story, no theory. The examples below show you how to write function accum:

Examples:

Accumul.accum("abcd");    // "A-Bb-Ccc-Dddd"
Accumul.accum("RqaEzty"); // "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
Accumul.accum("cwAt");    // "C-Ww-Aaa-Tttt"
The parameter of accum is a string which includes only letters from a..z and A..Z.
*/

public class Accumul {
    
    public static String accum(String s) {
     // your code
     String result = "";
     String temp = "";
     s = s.toUpperCase();
     for(int i = 0; i < s.length(); i++)
     {
     temp = "";
     for(int j = 0; j < i; j++)
     temp += s.charAt(i);
      
     result += (s.charAt(i) + temp.toLowerCase());
     
     if(i != s.length() - 1)
     result += "-";
     
     }
     
     return result;
    }
}