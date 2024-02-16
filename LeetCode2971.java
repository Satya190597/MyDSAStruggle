/*
    Question : https://leetcode.com/problems/find-polygon-with-the-largest-perimeter/?envType=daily-question&envId=2024-02-15
 */

// TODO: Implement Own Sorting Logic. Only dum person like me use in-build soring functions.
import java.util.Arrays;

public class LeetCode2971 {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long totalSum = 0;
        long result = -1;
        for(int i = 0; i < nums.length; i++)
        {
            if(totalSum>nums[i])
                result = totalSum + nums[i];
            totalSum += nums[i];
        }
        return result;

    }
}
