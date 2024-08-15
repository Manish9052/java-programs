package array_questions;

// in this question find the total number of pairs in the array whose sum is equal to the given x value ? 
public class target_sum_array_question {


    static void target_sum(int []arr,int target)
    {
        int ans=0;
       for(int i=0;i<arr.length;i++)
       {
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[i]+arr[j]==target)
            {
                ans++;
            }
        }
       }
       System.out.println(ans);
    }
    public static void main(String[] args) {
        System.out.println("enter the size of array ");
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int [] arr= new int[size];
        System.out.println("enter the array elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the target sum you want");
        int target= sc.nextInt();

        target_sum(arr, target);

    }
}
