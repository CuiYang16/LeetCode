package easy;
import	java.util.HashMap;
import	java.util.Arrays;
import java.util.Map;

/**
 * @author ：cuiyang
 * @description：有多少小于当前数字的数字
 * 给你一个数组 nums，对于其中每个元素 nums[i]，请你统计数组中比它小的所有数字的数目。
 *
 * 换而言之，对于每个 nums[i] 你必须计算出有效的 j 的数量，其中 j 满足 j != i 且 nums[j] < nums[i] 。
 *
 * 以数组形式返回答案。
 *
 * @date ：Created in 2020/3/29 11:51
 */
public class SolutionSmallerNumbersThanCurrent {
    public int[] smallerNumbersThanCurrent(int[] nums) {
    //必须声明备份数组，保存原有顺序
        int[] temp = Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums);
        int[] arr = new int[nums.length];

        Map<Integer, Integer> m = new HashMap<Integer, Integer> ();
        for(int i=0 ;i<nums.length; i++){
            if(i==0){
                m.put(nums[i], i);
            }else{
                if(nums[i] ==nums[i-1]){
                    m.put(nums[i],m.get(nums[i-1]));
                }  else{
                    m.put(nums[i], i);
                }
            }


        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] =m.get(temp[i]);
        }
        return arr;
    }
}
