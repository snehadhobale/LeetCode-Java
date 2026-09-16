public class solution{
    public int[] singleNumber(int[] nums){
        int result = 0;

        for(int i=0;i<nums.length;i++){
            int result = result ^ nums[i];
        }
        return result;
    }
}