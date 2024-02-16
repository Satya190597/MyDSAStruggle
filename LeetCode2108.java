/*
    Question : https://leetcode.com/problems/find-first-palindromic-string-in-the-array/?envType=daily-question&envId=2024-02-13
 */

public class LeetCode2108 {
    public String firstPalindrome(String[] words) {
        for(String word : words)
        {
            boolean result = isPalindrome(word);
            if(result)
                return word;
        }
        return "";

    }
    public boolean isPalindrome(String s) {
        int firstIndex = 0;
        int lastIndex = s.length()-1;
        while(firstIndex<lastIndex)
        {
            if(s.charAt(firstIndex)!=s.charAt(lastIndex))
                return false;
            firstIndex++;
            lastIndex--;
        }
        return true;
    }
}
