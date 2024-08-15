package array_questions;

public class count_the_number_of_ele_strictly_greaterthan_value_of_x {
    void greater_than_x()
    {
         int x= 4;
        int arr[] = { 1,2,3,4,5,5,6,7,8,89,10};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if( arr[i]>x)
            {
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        count_the_number_of_ele_strictly_greaterthan_value_of_x obj= new count_the_number_of_ele_strictly_greaterthan_value_of_x();
        obj.greater_than_x();
    }
    
}
