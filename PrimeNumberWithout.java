//WAP to print prime numbers between 2 to 100 excluding those numbers which contains 3 or 7 in it.


package Java;

public class PrimeNumberWithout {

	public static void main(String[] args) {
		
	
		int flag = 0;
		for(int i =2;i<=100;i++) {
			flag=0;
			for(int j =2;j<i;j++) {
				if(i%j ==0) {
					flag =1;
				}
			}
			if(flag ==0) {
			    //System.out.println(i);
			    String  n = Integer.toString(i);
			    if(n.contains("3") || n.contains("7")) {
			    	continue;
			    }else {
			    	System.out.println(i);
			    }
			   }
		}
			
		}

	}


