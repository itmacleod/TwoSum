
public class Main {

	public static void main(String[] args) {
		

	}
	public int[] twoSum(int[] nums, int target) {
		
		//created empty array of size two, since the list returned will have two integers in it
		int[] answer = new int[2];
		
		//embedded for loop; only looks at sums where i and j are not the same so as to avoid the same indices being added to the answer array
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums.length; j++) {
				if(i != j) {
					if(nums[i] + nums[j] == target) { //if the two numbers from the array equal the target value...
						answer[0] = j; //set first index of answer array to j's value
						answer[1] = i; //set second index of answer array to i's value
					}
				}
			}
		}
		
		//return array 
		return answer;
	}
	

}
