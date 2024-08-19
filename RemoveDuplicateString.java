package Java;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		String text  = "happy";
		char [] ar = text.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(int i =0;i<ar.length;i++) {
			boolean repeated = false;
			for(int j = i+1;j<ar.length;j++) {
				if(ar[i]==ar[j]) {
					repeated = true;
					break;
				}
			}
			if(!repeated) {
				sb.append(ar[i]);
			}
		}
		
		System.out.println(sb);
	}

}
