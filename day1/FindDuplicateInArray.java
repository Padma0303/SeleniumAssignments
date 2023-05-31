package week2.day1;

public class FindDuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,5,7,7,5,9,2,3};
		int length = nums.length;
		System.out.println("The length of the array is :"+length);
		
		for (int i = 0;i<length; i++)
		{
			for (int j =i+1; j<length; j++)
			{
				if (nums[i]==nums[j])
				{
					System.out.println(nums[i]);
				}
			}
		}

	}

}
