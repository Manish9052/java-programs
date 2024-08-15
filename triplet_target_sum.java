package array_questions;

public class triplet_target_sum {

    static void target_sum(int[] arr, int target) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array ");

        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("enter the array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the target sum you want");
        int target = sc.nextInt();

        target_sum(arr, target);

    }
}
