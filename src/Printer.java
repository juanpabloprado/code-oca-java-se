import java.io.File;

public interface Printer {
	void printFile(File f);
	
	default int getInkLevel() {
		return 0;
	}
}
