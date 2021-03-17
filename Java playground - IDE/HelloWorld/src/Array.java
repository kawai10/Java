import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
//		int[] result = new int[9];
//		for (int i = 0; i < result.length; i++) {
//			result[i] = 2 * (i + 1);
//		}
//		
//		for (int i = 0; i < result.length; i++) {
//			System.out.println(result[i]);
//		}
		
		
		int[] result = new int[9];
		System.out.println("구구단 중 출력할 단은? : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println("입력값 : " + number);
		
		if (number < 2 || number > 9) {
			System.out.println("잘못 입력하였습니다.");
		} else {
			for (int j = 1; j < 10; j++) {
				System.out.println(number * j);
			
			}
		
		}
	}

}
