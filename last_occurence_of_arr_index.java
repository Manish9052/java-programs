package array_questions;

public class last_occurence_of_arr_index {
    void last_occurence()
    {
        int x= 5;
        int occurence_last=-1;
        int []arr={ 1,2,3,4,5,6,7,8,5,7,8,6,5,7,7,77,0};
        for(int i=0;i<arr.length;i++)
        {
            if(x==arr[i])
            {
                occurence_last=i;

            }
        }
        System.out.println("the last index  where "+x+" last occuered was at index "+occurence_last);
    }
    public static void main(String[] args) {
        last_occurence_of_arr_index obj= new last_occurence_of_arr_index();
        obj.last_occurence();
    }
    
}
