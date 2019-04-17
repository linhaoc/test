import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

public class test {
 public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
	LocalDateTime mydatetime = LocalDateTime.now();
	System.err.println(mydatetime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL,FormatStyle.LONG)));
	
}
}
