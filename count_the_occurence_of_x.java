package array_questions;

public class count_the_occurence_of_x {
    
   int arr[]={1,2,3,4,5,5,4,4,4,7};

   
   void count(){
    int x= 4;
    int count=0;
    for(int i=0;i<arr.length;i++)
    {
        if(x==arr[i])
        {
            count= count+1;

        }
    }
    System.out.println(count);
   }
   public static void main(String[] args) {
    count_the_occurence_of_x obj= new count_the_occurence_of_x();
    obj.count();
   }
    
}
