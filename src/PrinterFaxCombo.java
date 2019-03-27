import java.io.File;

public class PrinterFaxCombo implements Fax, Printer {
	private Object incomingFax;
	private int inkLevel;

	@Override
	public void sendFax(File f, int number) {
		dialNumber(number);
		faxFile(f);
		
	}

	@Override
	public Object getReceivedFaxes() {
		return incomingFax;
	}
	
	@Override
	public void printFile(File f) {
		sendFileToPrinter(f);	
	}

	@Override
	public int getInkLevel() {
		return inkLevel;
	}
	
	private boolean dialNumber(int number) {
		boolean success = true;
		// TODO Dial number set success to false if it is not successful
		return success;
	}

	private void faxFile(File f) {
		// TODO Send the File f as a fax
	}
	
	private void sendFileToPrinter(File f) {
		// TODO Print the File f
	}
	
	/*
	 * This class would contain many more methods to
	 * implement all of this functionality.
	 */
}
