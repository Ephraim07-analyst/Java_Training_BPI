package ph.com.bpi.helloworld;

public class Activity5 {

	    public static int calculateSum(int n) {
	        int sum = 0;
	        for (int i = 1; i <= n; i++) {
	            sum += i; 
	        }
	        return sum;
	    }

	    public static void main(String[] args) {
	        int n = 50;
	        int result = calculateSum(n);
	        System.out.println("The sum is " + result);
	    }

}
