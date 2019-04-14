package exceptions;

public class Example {
	
	public static void main(String[] args) {
		System.out.println("Bread");
		try {
			throw new NumberFormatException(); // unchecked exception
		} finally {
			System.out.println(" and "); // this gets executed!
		}
		//System.out.println(" butter"); // this statement is not reached
		/*
		 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		 * Unreachable code
		 * 
		 * at exceptions.Example.main(Example.java:11)
		 */
	}
}
