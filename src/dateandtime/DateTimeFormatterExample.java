package dateandtime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class DateTimeFormatterExample {
	
	public static void main(String[] args) {
		String[] minutes = { "m", "mm" };
		String[] hours = { "h", "hh" };
		String[] days = { "d", "dd" };
		String[] months = { "M", "MM", "MMM", "MMMM", "MMMMM" };
		String[] years = { "y", "yy", "yyyy" };
		String converts = "\u2192"; // Right arrow
		
		LocalDateTime ldt = LocalDateTime.parse("2019-01-01T01:01:01");
		System.out.print("Hours:   ");
		Arrays.asList(hours).forEach(p -> {
			System.out.print(p + converts + ldt.format(DateTimeFormatter.ofPattern(p)) + "  ");
		});
		
		System.out.printf("%nMinutes: ");
		Arrays.asList(minutes).forEach(p -> {
			System.out.print(p + converts + ldt.format(DateTimeFormatter.ofPattern(p)) + "  ");
		});
		
		System.out.printf("%nMonths:  ");
		Arrays.asList(months).forEach(p -> {
			System.out.print(p + converts + ldt.format(DateTimeFormatter.ofPattern(p)) + "  ");
		});
		
		System.out.printf("%nDays:    ");
		Arrays.asList(days).forEach(p -> {
			System.out.print(p + converts + ldt.format(DateTimeFormatter.ofPattern(p)) + "  ");
		});
		
		System.out.printf("%nYears:   ");
		Arrays.asList(years).forEach(p -> {
			System.out.print(p + converts + ldt.format(DateTimeFormatter.ofPattern(p)) + "  ");
		});
	}
}
