import java.util.Scanner;

public class Repetition {

	public static void main(String[] args) {
		int MaxDays[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		System.out.println("반복횟수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int Number = sc.nextInt();
		System.out.println("월을 입력하세요.");
		for (int i = 1; i < Number+1; i++) {
			System.out.println(i);
			
		}
		for(int j = 1; j < Number+1; j++) {
			System.out.printf("%d월은 %d일까지 있습니다.\n", j, MaxDays[j-1]);
		}
	}
			
}


