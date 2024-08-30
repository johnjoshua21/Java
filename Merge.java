//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {8888, 2, 3, 7,  1, 5, 6, 4,99};
        int size = arr.length;

        System.out.println("Before Sorting");

        for (int nums : arr) {
            System.out.print(nums + " ");
        }
        Mergesort(arr);
        System.out.println("\nAfter Sorting");
        for (int nums : arr) {
            System.out.print(nums + " ");
        }
    }

     static void Mergesort(int[] arr) {
        int size= arr.length;
        if (size<=1){
            return;
        }
        int mid=size/2;
        int[] larr=new int[mid];
        int[] rarr=new int[size-mid];
        int i=0;
        int j=0;
        for (;i<size;i++){
            if (i<mid){
                larr[i]=arr[i];

            }
            else {
                rarr[j]=arr[i];
                j++;
            }

        }
        Mergesort(larr);
        Mergesort(rarr);

        Merging(arr,larr,rarr);
     }

     static void Merging(int[] arr, int[] larr,int[] rarr) {
         int mid=arr.length/2;
       int ls=mid;
       int rs= arr.length-ls;
        int i=0,j=0,k=0;

        while (i<ls&&j<rs){
            if (larr[i]<rarr[j]){
                arr[k]=larr[i];
                i++;

            }
            else {
                arr[k]=rarr[j];
                j++;
            }
            k++;
        }
        while (i<ls){
            arr[k]=larr[i];
            i++;
            k++;
        }
         while (j<rs){
             arr[k]=rarr[j];
             j++;
             k++;
         }

    }
}