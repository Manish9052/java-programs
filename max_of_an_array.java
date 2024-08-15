package array_questions;

public class max_of_an_array {
    void max_array()
    {
         int max=0;
        int arr[]={1,5,3};
        for(int i=0;i<3;i++)
        {
             if(max<arr[i])
             {
                max=arr[i];
             }

        }
        System.out.println("output: "+max);
    }
    public static void main(String[] args) {
        max_of_an_array obj = new max_of_an_array();
        obj.max_array();
    }
    
}
