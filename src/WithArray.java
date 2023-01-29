import java.util.Arrays;
public class WithArray {
    public static void main(String[] args) {
        int[] nums = {3, 5, 2, 6, 8, 4, 4, 6, 4, 4, 3};
        int x = 5;
        int[] array = reorder(nums, x);
        System.out.println(Arrays.toString(array));

    }
        public static int[] reorder( int[] arr, int index) {
            int[] array = new int[arr.length];
            int left = 0;
            int right = arr.length - 1;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < index) {
                    array[left++] = arr[i];
                }
                else if (arr[i] > index) {
                    array[right--] = arr[i];
                }
            }
            while (left <= right)
                array[left++] = index;

            return array;
        }

    }



