*/
#Find the missing letter

Write a method that takes an array of consecutive (increasing) letters as input and that returns the missing letter in the array.

You will always get an valid array. 
And it will be always exactly one letter be missing. 
The length of the array will always be at least 2.
The array will always contain letters in only one case.
*/

public class Kata
{
  public static char findMissingLetter(char[] array)
  {
  
  int a, b;
  
  for(int i = 0; i < array.length; i++)
  {
      if(i != (array.length - 1))
      {
          a = (int)array[i];
          b = (int)array[i + 1];
          
          if((b - a) == 2)
              return (char) (a + 1);
          
       }
  }
  return 'a';
}
}