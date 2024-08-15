package array_questions;

import java.util.Arrays;

public class second_largest {
     static void second_large(int[] arr)

    {
        Arrays.sort(arr);
       System.out.println("the second largest number is : "+arr[arr.length-1]);

    }
    public static void main(String[] args) {
        System.out.println("enter the array size ");
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        System.out.println("enter  "+size+" elements");
        int arr[]= new int[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        second_large(arr);
    }
    
}
