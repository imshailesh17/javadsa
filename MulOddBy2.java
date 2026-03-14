package Array;

import java.util.Scanner;

public class MulOddBy2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        for (int i = 0;i<n;i++){
            if(i%2==0){
                arr[i]=arr[i]+10;
            }
            else{
                arr[i]=arr[i]*2;
            }
        }
        for(int i = 0;i<n;i++){
            System.out.println(arr[i]+" ");
        }

    }
}
