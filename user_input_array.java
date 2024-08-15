package array_questions;

import java.util.Scanner;

public  class user_input_array {
    void user_input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array you want : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter the elements of the array ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter index a[" + i + "] : ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i <= arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();

    }

    public static void main(String[] args) {
        user_input_array obj = new user_input_array();
        obj.user_input();
    }

}
