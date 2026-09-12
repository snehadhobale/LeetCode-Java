//27.remove element from an array 

public class remove27{
	static int removeElement(int[] nums,int val){
		int len = nums.length();
		int i = 0;

		while(i<len){
			if(nums[i] == val){
				nums[i] = nums[i-1];
				len--;
				}
			else{
				i++;
			}
		}
		return val;
	}
	public static void main(String[] args){
		int[] nums = {3, 2, 2, 3};
		int val = 3;

		remove27 obj = new remove27();
		int k = obj.removeElement(nums,val);

		System.out.println("k ="+k);
		for(int j=0;j<k;j++){
			System.out.println(nums[j]+"");
		}
	}
}

