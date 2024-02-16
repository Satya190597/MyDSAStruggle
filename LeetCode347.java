/*
    Question : https://leetcode.com/problems/top-k-frequent-elements/description/
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode347 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> frequencyMap = new HashMap<>();
        for(Integer element : nums)
        {
            if(frequencyMap.containsKey(element))
                frequencyMap.put(element,frequencyMap.get(element)+1);
            else
                frequencyMap.put(element,1);
        }
        Map<Integer, List<Integer>> buckets = new HashMap<>();
        for(Integer key : frequencyMap.keySet())
        {
            int bucketKey = frequencyMap.get(key);
            if(buckets.containsKey(bucketKey))
            {
                List<Integer> list = new ArrayList<>(buckets.get(bucketKey));
                list.add(key);
                buckets.put(bucketKey,list);
            }
            else
            {
                buckets.put(bucketKey,List.of(key));
            }
        }
        int counter = 0;
        int[] result = new int[k];
        for(int i = nums.length; i > 0; i--)
        {
            if(buckets.containsKey(i)) {
                for(Integer element : buckets.get(i))
                {
                    if(counter>=k)
                        return result;
                    result[counter] = element;
                    counter++;
                }
            }
        }
        return result;
    }
}
