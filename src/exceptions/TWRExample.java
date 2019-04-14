package exceptions;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class TWRExample {
	public void demonstrateTryWithResources() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Number of apples: ");
			int apples = sc.nextInt();
			System.out.println("Number of oranges: ");
			int oranges = sc.nextInt();
			System.out.println("Pieces of Fruit: " + (apples + oranges));
		} catch (InputMismatchException ime) {
			ime.printStackTrace();
		}
		
	}
	
	
	public void demonstrateMultiCatch() {
		try {
			Random random = new Random();
			int i = random.nextInt(2);
			if (i == 0) {
				throw new ArrayIndexOutOfBoundsException();
			} else {
				throw new NullPointerException();
			}
		} catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		TWRExample example = new TWRExample();
		example.demonstrateTryWithResources();
		example.demonstrateMultiCatch();
	}
}
