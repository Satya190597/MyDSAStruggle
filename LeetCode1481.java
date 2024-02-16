/*
    Question : https://leetcode.com/problems/least-number-of-unique-integers-after-k-removals/description/?envType=daily-question&envId=2024-02-16
 */

import java.util.*;

/*
    TODO : Improve the code using mean heap.
 */
public class LeetCode1481 {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer,Integer> dataMap = new HashMap<>();
        for(int element : arr)
        {
            if(dataMap.containsKey(element)) {
                int count = dataMap.get(element);
                count++;
                dataMap.put(element,count);
            }
            else {
                dataMap.put(element,1);
            }
        }
        List<Integer> mylist = new ArrayList();
        for(Integer key : dataMap.keySet())
        {
            mylist.add(dataMap.get(key));
        }
        Collections.sort(mylist);
        int sum = 0;
        for(Integer count : mylist)
        {
            if(k==0)
                sum+=1;
            else
                k = k-count;
            if(k<0)
                sum+=1;
        }
        return sum;
    }
}
