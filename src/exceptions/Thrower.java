package exceptions;

public class Thrower {
	public static void main(String[] args) {
		Thrower t = new Thrower();

		try {
			t.throw1();
		} catch (RecordException re) {
			System.out.println("A RecordException has ocurred");
		}
	}

	private void throw1() throws RecordException {
		throw2();
	}

	private void throw2() throws RecordException {
		throw3();
	}

	private void throw3() throws RecordException {
		throw4();
	}

	private void throw4() throws RecordException {
		throw new RecordException();
	}

}
