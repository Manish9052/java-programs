package array_questions;

public class arrays_q1 {
    void sum()
    {
        int sum=0;
        int arr[]={1,5,3};
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("output:"+sum);
    }
    public static void main(String[] args) {
        arrays_q1 obj=new arrays_q1();
        obj.sum();
    }
    
}
