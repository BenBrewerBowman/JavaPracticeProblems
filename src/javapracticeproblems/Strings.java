
package javapracticeproblems;


public class Strings {
    
    //Given a string, return a string where for every char in the original, there are two chars.
    public static String doubleChar(String str)
    {
        String doubleStr = new String();
        for(int i=0; i<str.length(); ++i)
        {
            String s = Character.toString(str.charAt(i));
            doubleStr += s + s;
        }
        return doubleStr;  
    }
    
    
}
