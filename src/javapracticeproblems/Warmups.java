
package javapracticeproblems;


public class Warmups {

    //    The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is     not a weekday or we're on vacation. Return true if we sleep in.
    public static boolean sleepIn(boolean weekday, boolean vacation) 
    {
        return weekday == false || vacation == true;
    }
    
    //Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
    public static int diff21(int n) 
    {
        if(n>21) return 2*(n-21);
        else return (21-n);
    }
    

    //Given a string and a non-negative int n, return a larger string that is n copies of the original string. 
    public static String stringMult(String phrase, int num)
    {
        String totalString = new String();
        for(int i=0; i<num; ++i){
            totalString = totalString + phrase;
        }
        return totalString;
    }
    
    //Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
    public static boolean count123(int[] nums)
    {
        boolean check123 = false;
        for(int i=0; i<(nums.length-2); ++i) {
            // if 1 is found, check for 2,3. Set check to true if found.
            if(nums[i] == 1)
                if(nums[i+1] == 2)
                    if(nums[i+2] == 3)
                        check123 = true;
        }
        return check123;
    }
}
