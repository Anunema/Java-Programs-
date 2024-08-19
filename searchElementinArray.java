//search the target element in array 
package Java;

public class searchElementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar [] = {1,2,3,4,5};
		int target = 2;
		boolean check = false;
		
		for(int i =0;i< ar.length;i++) {
			if(ar[i]==target) {
				System.out.println("found");
				check = true;
				break;
			}
		}
			if (!check) {
				System.out.println("not found");
				
				
			}
		}

	}


