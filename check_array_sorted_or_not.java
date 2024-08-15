package array_questions;

public class check_array_sorted_or_not {
    void check_array_sorted()
    {
        int []arr={1,2,3,4,5};
        String temp="true";
        for(int i= 1;i<arr.length;i++)
        {
            if(arr[i-1]<arr[i])
            {
                temp="sorted";
                break;
            }
            else{
                temp="unsorted";
            }
        }
        System.out.println("the array is "+temp);

    }
    public static void main(String[] args) {
        check_array_sorted_or_not obj = new check_array_sorted_or_not();
        obj.check_array_sorted();
    }

    
}
