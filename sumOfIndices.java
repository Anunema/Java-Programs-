
/*Given a list of integers and a target sum, write a function to find the indices of the two numbers in the list that add up to the target sum. You may assume that each input would have exactly one solution, and you may not use the same element twice.
Example: 
int[] nums = {3, 2, 4}
target=6;
Output: [1, 2]*/

package Java;

public class sumOfIndices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3, 2, 4};
		int target =6;
		boolean found = false;
		for(int i = 0;i<nums.length;i++) {
			for(int j = i+1;j<nums.length;j++) { 
			if(nums[i]+nums[j] == target) {
				
				System.out.println("["+i+","+j+"]");
				found = true;
				break;
			}
            }
            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("not found");
        }
    }
}