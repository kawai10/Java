import java.util.Scanner;

public class Gugudanproject {

	public static void main(String[] args) {
		System.out.println("입력 값 : ");
		Scanner scanner = new Scanner(System.in);
		String Number = scanner.nextLine();
		String[] splitedValue = Number.split(",");
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		
		System.out.println("Number : " + Number);
		
		for (int i = 2; i <= first; i++) {
			for (int j = 1; j<= second; j++ ) {
				System.out.println(i * j);
			}
		}
		
		
		

	}

}
