/*Complete the method/function so that it converts dash/underscore delimited words into camel casing.
The first word within the output should be capitalized only if the original word was capitalized.

Examples:

 returns "theStealthWarrior"
toCamelCase("the-stealth-warrior") 

 returns "TheStealthWarrior"
toCamelCase("The_Stealth_Warrior")
*/

import java.lang.StringBuilder;
class Solution{

  static String toCamelCase(String s){
  
  if(s.equals(""))
  return "";
  
  String[] array;
  
  if(s.contains("-"))
  array = s.split("-");
  
  else
  array = s.split("_");
  
  String result = array[0];
  String camelCased = "";
  Character leadingLetter;
  
  for(int i = 1; i < array.length; i++)
  {
      leadingLetter = array[i].charAt(0);
      leadingLetter = leadingLetter.toUpperCase(leadingLetter);
      
      camelCased = array[i].substring(1);
      
      camelCased = leadingLetter + camelCased;
      
      result += camelCased;     
  }  
    return result;
  }
}