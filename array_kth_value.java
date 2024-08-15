package array_questions;
import java.util.Arrays;
import java.util.Scanner;
// this question is like when you will given an array and will be asked to say the kth value array elements i.e if a array arr={145,30,10,6,8} is given and you were asked to find the second smallest and second largest number to find in array ?
public class array_kth_value {
    
    static int[] array_kvalue(int[] arr)
    {
        Arrays.sort(arr);
        
        System.out.println("the second largest number is "+arr[arr.length-2]+"the second smallest number is "+arr[1]);
        return arr;
        
    }
    public static void main(String[] args) {
        int size=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array you want :");
        size=sc.nextInt();

        int [] arr=new int[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();

        }
        array_kvalue(arr);
        sc.close();

    }
}
