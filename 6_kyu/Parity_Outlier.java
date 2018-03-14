*/
You are given an array (which will have a length of at least 3, but could be very large) containing integers. 
The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single integer N. 
Write a method that takes the array as an argument and returns this "outlier" N.
*/

public class FindOutlier{
  static int find(int[] integers){
  
  if(integers.length < 3)
  return 0;
  
 int result = 0;
  boolean oddOrEven;
  String check = "";
  
  if((integers[0] % 2) == 0)
      check += "1";
  else
      check += "0";
  
  if((integers[1] % 2) == 0)
      check += "1";
  else
      check += "0";
  
  if((integers[2] % 2) == 0)
      check += "1";
  else
      check += "0";
  
  if(check.indexOf("1") == check.lastIndexOf("1"))
      oddOrEven = false;
  else
      oddOrEven = true;
  
  
  for(int i = 0; i < integers.length; i++)
  {
      if(oddOrEven == false)
      {
          if((integers[i] % 2) == 0)
              result = integers[i];
      }
      else
          if(((integers[i] % 2) == 1) || ((integers[i] % 2) == -1))
              result = integers[i];
  }
  
  return result;
}
}