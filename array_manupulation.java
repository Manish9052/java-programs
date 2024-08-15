package array_questions;
 //find the unique number given Array where all the elements are being repeated twice with one value being unique
public class array_manupulation {
    int ans=0;
      void  array_unique_manupulation(){
        int[] arr={1,2,3,4,2,1,3};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                  arr[i]=-1;
                  arr[j]=-1;  
                }
                
            }
        }
        for(int i=0;i<arr.length;i++)
        {

        
        if(arr[i]>=0)
        {
            ans=arr[i];
        }
        
    }
    System.out.println(ans);
     }
     public static void main(String[] args) {
        array_manupulation obj=new array_manupulation();
         obj.array_unique_manupulation();
     }

    
}
