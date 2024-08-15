package array_questions;

public class array_reference {
    static void display_array(int[] arr)
    {
         for(int i = 0;i<arr.length;i++)
         {
      System.out.println(arr[i]);
         }
    }

    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        System.out.println("original array ");
         display_array(arr1);
         int[] arr_2 = arr1;
         System.out.println("original array 2");
         display_array(arr_2);
         arr_2[0]=0;
         arr_2[1]=0;
         System.out.println("arr1 after changing index values of arr2 --> ");
         display_array(arr1);
         System.out.println("arr2 after changing the values of arr2 ");
         display_array(arr_2);
    }
    
}
/* this happens because reference concept of java as the reference of arr2 is refering the arr1 and arr1 is actually stored in heap memory where -> the memory location is of same arr1  and the changes were seen in the arr2 and arr1 both ! due of reference concept of java by the stack and heap memoryu  */
