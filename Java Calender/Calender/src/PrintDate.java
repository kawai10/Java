import java.util.Scanner;

public class PrintDate {

	public static void main(String[] args) {
		int date[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		System.out.println("달을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int Month = sc.nextInt();
		
		System.out.printf("%d월은 %d일까지 있습니다.\n", Month, date[Month -1]);
		
		
	}

}
