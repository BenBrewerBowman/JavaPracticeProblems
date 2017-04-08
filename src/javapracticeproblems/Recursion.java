
package javapracticeproblems;


public class Recursion {
    
    // factorial recursive problem
    public static long factorial(int n) { 
        if (n == 1) return 1; 
        return n * factorial(n-1); 
    } 
    
    //Given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to the given target with this additional constraint: If a value in the array is chosen to be in the group, the value immediately following it in the array must notbe chosen. (No loops needed.)
    public static int fibNums(int n, int num, int prevNum)
    {
        if(n<=1) return num;
        return fibNums(n-1, num+prevNum, num);
    }
    
    //Given an array of ints, compute recursively if the array contains somewhere a value followed in the array by that value times 10. We'll use the convention of considering only the part of the array that begins at the given index. In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.
    public static boolean array220(int[] nums, int index) 
    {
        if(index>=nums.length) return false;
        if(index>0)
            if(nums[index] == 10*nums[index-1]) return true;
        return array220(nums, index+1);
    }
    
    // Given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to the given target? This is a classic backtracking recursion problem. Once you understand the recursive backtracking strategy in this problem, you can use the same pattern for many problems to search a space of choices. Rather than looking at the whole array, our convention is to consider the part of the array starting at index start and continuing to the end of the array. The caller can specify the whole array simply by passing start as 0. No loops are needed -- the recursive calls progress down the array.
    public boolean groupSum(int start, int[] nums, int target) 
    {
        // if target reached, true
        if(target == 0) return true;
        // if end reached and target not, return false
        if(start>=nums.length) return false;
        // if number is found to put target to 0, return true
        if(groupSum(start + 1, nums, target - nums[start])) return true;
        // pass target, do not subtract number
        return(groupSum(start + 1, nums, target));
    }

       
}
