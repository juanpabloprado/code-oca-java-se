package erros;

import java.util.ArrayList;
import java.util.List;

public class Example {

	public void forceStackOverFlowError() {
		Integer counter = 0;
		List<Integer> unstoppable = new ArrayList<>();
		while(true) {
			unstoppable.add(counter);
			counter++;
			if(counter % 10000 == 0) {
				System.out.println(counter);
			}
		}
	}
	
	public void forceAssertionError() {
		https://stackoverflow.com/questions/5509082/eclipse-enable-assertions
		assert false;
		//throw new AssertionError();
	}
	
	public static void main(String[] args) {
		Example example = new Example();
		example.forceAssertionError();
	}
}
