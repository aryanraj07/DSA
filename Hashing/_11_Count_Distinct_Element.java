package Hashing;

import java.util.HashSet;

public class _11_Count_Distinct_Element {
    public static void main(String[] args) {
        int []nums={4,3,2,5,6,7,3,4,2,1};
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);

        }
        System.out.println("Size of the distinct element is "+set.size());
    }
}