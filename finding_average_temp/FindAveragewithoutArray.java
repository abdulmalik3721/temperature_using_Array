package finding_average_temp;
import java.util.Scanner;

public class FindAveragewithoutArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("how many days'temperature? ");
		int numDays=scanner.nextInt();
		int sum =0;
		for(int i=1;i<=numDays;i++) {
			System.out.print("Day " + i + " 's high temperature: ");
			int next = scanner.nextInt();
			sum+=next;
		}
		
		double averageTemp = sum/numDays;
		System.out.println();
		System.out.println("average temp " + averageTemp);

	}

}
