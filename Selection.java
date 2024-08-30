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
        select(arr, size);
        System.out.println("\nAfter Sorting");
        for (int nums : arr) {
            System.out.print(nums + " ");
        }
    }

    static void select(int[] arr, int size) {
        int tmp = 0;
        int min = -1;
        for (int i = 0; i < size - 1; i++) {
            min = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            tmp = arr[min];
            arr[min] = arr[i];
            arr[i] = tmp;
        }
    }
}