package array_questions;
/*if there is multiple similar values of the searchable item or array element then we use break statement to stop the loop where it found  
 * 
 * this can be also called as linear search !
*/
public class check_presence_array {
    void check_presence()
    {
        int arr[]= { 1,3,5};
        int search_no=5;
        int ans=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==search_no)
            {
               ans=i;

            }
           
           
        }
        System.out.println(ans);
        
    }

    public static void main(String[] args) {
        check_presence_array obj =new check_presence_array();
        obj.check_presence();
    }
    /*let us assume the array to be like this arr[]={ 1,2,3,4,5,6,6,5,5,7,8} then the out put will shift to the last recent one where the compiler will find the array element 
     * but to avoid this we will use --> break statement just after receiving the required array element : ---> 
     * 
     * 
     * if(aa[i]<arr.length;i++)
     * {
     *  ans= i;
     * break; // this will end or you can say it will be broken
     *   }
     */
}
