package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        ArrayList<String> vowels= new ArrayList<>(Arrays.asList("a","e","i","o","u"));
        ArrayList<Integer> presum=new ArrayList<Integer>(Collections.nCopies(words.length+1,0));
        for(int i=0;i<words.length;i++)
        {
            var first= String.valueOf(words[i].charAt(0));
            int i1 = words[i].length() - 1;
            var finals= String.valueOf(words[i].charAt(i1));
            if(vowels.contains(first) & vowels.contains(finals))
            {
                presum.set(i+1, presum.get(i) + 1);
            }
            else{
                presum.set(i+1, presum.get(i));
            }
        }
        int[] ans = new int[queries.length];
        int j=0;
        for (var i:queries)
        {

            int x=i[0];
            int y=i[1];
            ans[j++]=presum.get(y+1)- presum.get(x);
        }
        return ans;
    }


}