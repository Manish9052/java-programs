package array_questions;

import java.util.Arrays;
import java.util.Scanner;

public class find_largest_of_array {
    static int[] array_max_mix(int[] arr) {

        Arrays.sort(arr);
        int ans[] = { arr[0], arr[arr.length - 1] };
        System.out.println("the array after sorting with the smallest number is arr{"+ans[0]+"} and the largest number is arr{"+ans[ans.length-1]+"}");
        return ans;
       

    }

    public static void main(String[] args) {

        System.out.println("enter the array size :");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("enter array elements : ");
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            System.out.println(arr[i]);

        }
        array_max_mix(arr);
        
        sc.close();
    }

}
