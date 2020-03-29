package easy;

/**
 * @author ：cuiyang
 * @description：非递减数列
 * 给你一个长度为 n 的整数数组，请你判断在 最多 改变 1 个元素的情况下，该数组能否变成一个非递减数列。
 *
 * 我们是这样定义一个非递减数列的： 对于数组中所有的 i (1 <= i < n)，总满足 array[i] <= array[i + 1]。
 *
 * 要满足条件，需要如下调整：
 * 1，当x<z,让y=z
 * 2，当x>z,让z=y
 * 3, 当x=z,让y=z
 * 综合以上可以得到：当x存在且x>z，就让z=y，否则让y=z
 * 当变更超过2次就不再满足条件
 * @date ：Created in 2020/3/29 12:18
 */
public class SolutionCheckPossibility {
    public boolean checkPossibility(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]>nums[i+1]){
                count++;
                //此处数组调整，有上一个元素且上一个元素大于下一个元素
                if(i-1>=0&&nums[i-1]>nums[i+1]){
                    nums[i+1]=nums[i];
                }else{
                    nums[i] = nums[i+1];
                }
            }
            if(count > 1){
                return false;
            }
        }
        return true;
    }
}
