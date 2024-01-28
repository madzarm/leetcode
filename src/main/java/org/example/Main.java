package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3,0,-2,-1,1,2};

        System.out.println(threeSum(nums));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> sets = new HashSet<>();
        for (int i = 0; i <= nums.length - 3; i++) {
            int firstNum = nums[i];
            for (int j = i + 1; j <= nums.length - 2; j++) {
                int secondNum = nums[j];
                for (int k = j + 1; k <= nums.length - 1; k++) {
                    int thirdNum = nums[k];
                    if ((firstNum + secondNum + thirdNum) == 0) {
                        List<Integer> temp = Arrays.asList(firstNum, secondNum, thirdNum);
                        Collections.sort(temp);
                        sets.add(temp);
                    }
                }
            }
        }
        return (List<List<Integer>>) new ArrayList(sets);
    }
}