package Array;

public class SecondLargest {
    static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9,45,23,54,87,98,65,21};
//        int max=Integer.MIN_VALUE;
//        int index=-1;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>max){
//                max=arr[i];
//                index=i;
//            }
//        }
//        arr[index]=Integer.MIN_VALUE;
//        max=Integer.MIN_VALUE;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>max){
//                max=arr[i];
//            }
//        }
//        System.out.println(max);
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>smax && arr[i]!=max){
                smax=arr[i];
            }
        }
        System.out.println(smax);


    }
}
