public class solution{
    public int majorityElement(int[] nums){
        int candidate = nums[0];
        int count = 0;

        for(int i;i<nums.length;i++){

            if(count == 0){
                candidate = nums[i];
            }
            if(nums[i] == candidate){
                count++;
            }else{
                count--;
            }
        }
        return candidate;

    }
}