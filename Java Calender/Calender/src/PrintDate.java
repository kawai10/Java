import java.util.Scanner;

public class PrintDate {
	
	private static final int[] MaxDays = {31,28,31,30,31,30,31,31,30,31,30,31};

	public int getMaxDaysOfMonth(int Month) {
		return MaxDays[Month -1];
	}
	
	public static void main(String[] args) {
		System.out.println("달을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		PrintDate Date = new PrintDate();
		int Month = sc.nextInt();
		System.out.printf("%d월은 %d일까지 있습니다.\n", Month, Date.getMaxDaysOfMonth(Month));
		
	
	}

}
