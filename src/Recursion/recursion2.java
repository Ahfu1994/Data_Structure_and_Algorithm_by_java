package Recursion;

public class recursion2 {

	public static void main(String[] args) {
		
		firstMethod();
	}
	
	public static void firstMethod() {
		secondMethod();
		System.out.println("Im the first method");
	}
	public static void secondMethod() {
		thirdMethod();
		System.out.println("Im the second method");
	}
	public static void thirdMethod() {
		fourthMethod();
		System.out.println("Im the third method");
	}
	public static void fourthMethod() {
		System.out.println("Im the fourth method");
	}

}
