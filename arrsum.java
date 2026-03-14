package Array;

import java.util.Scanner;

public class arrsum {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr = new int[10];
        System.out.println("Enter the number: ");
        for (int i =0; i<10;i++){
            arr[i]=sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i<10;i++){
            sum=sum +arr[i];
        }
        System.out.println(sum);
    }
}
