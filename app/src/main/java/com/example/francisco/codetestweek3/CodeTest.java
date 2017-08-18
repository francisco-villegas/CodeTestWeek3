package com.example.francisco.codetestweek3;

import java.util.Vector;

/**
 * Created by FRANCISCO on 18/08/2017.
 */

public class CodeTest {

    public static void main(String[] args) {

        int numbers[] = {2,8,9,3,4,3,2,6,6,2,4,9,8};

        System.out.println("Normal Array");
        for(int i = 0;i < numbers.length;i++)
            System.out.print(numbers[i]+", ");

        int sort[] = merge_sort(numbers);


        System.out.println("\n\nArray Sorted");
        for(int i = 0;i < sort.length;i++)
            System.out.print(sort[i]+", ");


        String s = "frog";
        System.out.println("\n\nSubstrings in the same order: "+s+"\n");
        Vector <String> s_vector = charactersCombinations(s);
        for(int i=0;i<s_vector.size();i++)
            System.out.println(s_vector.elementAt(i));
    }

    //algorithm complexity nlog(n)
    public static int [] merge_sort(int[] numbers) {
        merge_sort(0, numbers.length - 1, numbers);
        return numbers;
    }

    private static void merge_sort(int lower, int higher, int[] numbers) {
        // check if lower is smaller than higher, if not then we don't have to do anything
        if (lower < higher) {
            // Get the index of the element which is in the mid
            int mid = lower + (higher - lower) / 2;
            // Sort the left side of the array
            merge_sort(lower, mid,numbers);
            // Sort the right side of the array
            merge_sort(mid + 1, higher,numbers);
            // Combine them both
            merge(lower, mid, higher, numbers);
        }
    }

    private static void merge(int lower, int mid, int higher , int[] numbers) {

        int helper[] = new int[numbers.length];
        // Copy both parts into the helper array -- used to save the old data and to be able to move it
        for (int i = lower; i <= higher; i++) {
            helper[i] = numbers[i];
        }

        int i = lower;
        int j = mid + 1;
        int k = lower;
        // Copy the smallest values from either the left or the right side back
        // to the original array
        while (i <= mid && j <= higher) {
            if (helper[i] <= helper[j]) {
                numbers[k] = helper[i];
                i++;
            } else {
                numbers[k] = helper[j];
                j++;
            }
            k++;
        }
        // Copy the rest of the left side of the array into the target array
        while (i <= mid) {
            numbers[k] = helper[i];
            k++;
            i++;
        }
        //at this point the right elements are sorted too so we don't need to copy them

    }

    public static Vector<String> charactersCombinations(String s){
        Vector<String> s_vector = new Vector<String> (10,10);
        for(int i=0; i<s.length();i++) {
            for (int x = i+1; x < s.length()+1; x++) {
                s_vector.addElement(s.substring(i,x));
            }
        }
        return s_vector;
    }
}
