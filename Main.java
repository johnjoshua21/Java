import java.util.Arrays;
public class Main {

    public static void Bubble(int[] arr,int size){
        for (int i=0;i<size;i++){
            for (int j=0;j<size-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {8, 2, 3, 7, 9, 1, 5, 6, 4};
        int size = arr.length;
        System.out.println("Bfore Sorting");
        for (int nums : arr) {
            System.out.print(nums+" ");
        }
        Bubble(arr,size);
        System.out.println("\nAfter Sorting");
        for (int nums : arr) {
            System.out.print(nums+" ");
        }
    }
}