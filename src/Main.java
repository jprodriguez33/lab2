import java.util.Arrays;
public class Main{

  public static void main(String[] args){

    int[] nums = {3,5,2,6,8,4,4,6,4,4,3};
    int p1 = 0, p2 = nums.length - 1, index = 0;
    int temp;


    while (index <= p2) {
      if (nums[index] < 5) {
        temp = nums[index];
        nums[index] = nums[p1];
        nums[p1]= temp;
        p1++;
      }
      if (nums[index] > 5) {
        temp = nums[index];
        nums[index] = nums[p2];
        nums[p2] = temp;
        p2--;
        index--;
      }
      index++;
    }
    System.out.println(Arrays.toString(nums));
  }
}



