package Array;

public class Minelement {
    static void main(String[] args) {
        int arr[]={1,2,3,4,5,-7,2,3,56,98,45,5};
        int min=Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
            System.out.println(min);
    }
}
