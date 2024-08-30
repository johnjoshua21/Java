public class Insertion {
    public static void main(String[] args) {
        int[] arr = {8, 2, 3, 7,9,1, 5, 6, 4};
        int size = arr.length;

        System.out.println("Before Sorting");
        for (int nums : arr) {
            System.out.print(nums + " ");
        }
        insert(arr, size);
        System.out.println("\nAfter Sorting");
        for (int nums : arr) {
            System.out.print(nums + " ");
    }
}

     static void insert(int[] arr, int size) {
        int temp;
        int j=0;
        for (int i=0;i<size;i++){
            temp=arr[i];
            j=i-1;
            while (j>=0&&arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;

        }
    }
}
