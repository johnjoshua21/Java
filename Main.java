import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        int size = arr.length;
        int cnt = 0;
        int flag = arr[0];
        int i = 1;
        for (; i < size - 1; i++) {
            if (arr[i] == arr[i + 1] && arr[i] != flag) {
                flag = arr[i];
            } else if (arr[i] == arr[i + 1] && arr[i] == flag) {
                for (int j = i; j < size - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                cnt++;
            }
        }
        System.out.println(size - cnt);
        System.out.println(Arrays.toString(arr));
    }
}