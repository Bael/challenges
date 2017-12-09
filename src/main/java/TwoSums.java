import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


// https://leetcode.com/problems/two-sum/description/
public class TwoSums {


        public int[] twoSum(int[] nums, int target) {

            int[] answer = new int[2];

            Map<Integer, Integer> arrayNumbers = new HashMap<>();
            for (int i=0; i < nums.length; i++) {
                Integer current = nums[i];
                Integer currentIndex = i;


                if (arrayNumbers.containsKey(target - current)) {
                    answer[0] = arrayNumbers.get(target - current);
                    answer[1] = i;
                    break;
                }
                arrayNumbers.put(current, currentIndex);

            }

            return answer;

        }

}
