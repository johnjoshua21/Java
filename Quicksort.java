//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {8, 2, 3, 7,  1, 5, 6, 4};
        int size = arr.length;

        System.out.println("Before Sorting");

        for (int nums : arr) {
            System.out.print(nums + " ");
        }
        Quick(arr, 0,size-1);
        System.out.println("\nAfter Sorting");
        for (int nums : arr) {
            System.out.print(nums + " ");
        }
 
    }

     static void Quick(int[] arr, int low, int high) {
        if (low<high){

            int pivot=part(arr,low,high);
            Quick(arr,low,pivot-1 );
            Quick(arr,pivot+1,high);
        }
    }

     static int part(int[] arr, int low, int high) {
        int p=arr[high];
        int i=low-1;
        for (int j=low;j<high;j++){
            if (arr[j]<p){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
         int temp=arr[i+1];
         arr[i+1]=arr[high];
         arr[high]=temp;

            return i+1;
    }


}