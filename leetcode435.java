package com.company;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        int[][] add =  {{1,2},{1,2}};
	    Solution sl = new Solution();
        System.out.println(sl.eraseOverlapIntervals(add));
    }
}
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length == 0 ){
            return 0;
        }
        Arrays.sort(intervals, new Comparator<int[]>(){
            public int compare(int[] a1, int[] a2){
                return a1[1] - a2[1];
            }
        } );
        int end = intervals[0][1];
        int count = 1;
        for(int i = 0 ; i < intervals.length ; i ++ ){
            if(intervals[i][0] < end){
                continue;
            }
            end = intervals[i][1];
            count ++ ;
        }
        return intervals.length - count;
    }
}
