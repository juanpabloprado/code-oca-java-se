import java.io.File;

public interface Fax {
	void sendFax(File f, int number);
	Object getReceivedFaxes();
}
