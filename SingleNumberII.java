import java.util.HashMap;
import java.util.Map;

public class SingleNumberII {
    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap();
        int maxCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);

            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                maxCount = entry.getKey();
            }
        }

        return maxCount;
    }
    public static void main(String[] args) {
        int [] arr={0,1,0,1,0,1,99};
        System.out.println(singleNumber(arr));
    }
}
