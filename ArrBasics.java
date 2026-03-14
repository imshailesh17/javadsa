package Array;

import java.util.Scanner;

public class ArrBasics {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] arr={1,2,3,4,5,6,7,8,9}; //this is one of the ways to define an array.
//        int n=arr.length;
//        for(int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }
        System.out.println("Enter the Size of array: 0 ");
        int x = sc.nextInt();
        int [] nums= new int[x];
//        int len=nums.length;
        System.out.println("enter the element: ");
        for(int i = 0;i<10;i++){
            nums[i]=sc.nextInt();
        }
        for (int i = 0;i<10;i++){
            System.out.print(nums[i]+" ");
        }

    }
}
