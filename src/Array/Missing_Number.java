package Array;

public class Missing_Number {

	public static void main(String[] args) {
		int intArray[] = {1, 2, 3, 4, 5, 6, 8, 9, 10};
		missingNumber(intArray);

	}
	
	 public static void missingNumber(int[] intArray) {
		 int sum1 = 0;
		 int sum2 = 0;
		 for (int i : intArray) {
			 sum1 += i;
		 }
		 sum2 = 10*(10+1)/2;
		 int dif = sum2- sum1;
		 System.out.println(dif);
	        
	 }

}
