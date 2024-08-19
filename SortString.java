package Java;

public class SortString {

	public static void main(String[] args) {
		String [] Countries = {"Autrial","India","Germany","Spain","Russian","Egypt"};
		
		bubblesort(Countries);
		System.out.println(java.util.Arrays.toString(Countries));
	}
		
		public static void bubblesort(String [] arr) {
			
			
			int n = arr.length;
			for(int i =0;i<n-1;i++) {
				for(int j =0;j<n-1-i;j++) {
					if(arr[j].compareTo(arr[j+1])>0) {
						String temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					}
				}
			}
			
			
		}

	}


