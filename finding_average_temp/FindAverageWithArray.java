package finding_average_temp;
import java.util.Scanner;

public class FindAverageWithArray {

	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		System.out.print("how many day's tempertature ? ");
		int numDays=scanner.nextInt();
		
		int[] temps=new int[numDays];
		int sum=0;
		for(int i=0;i<numDays;i++) {
			System.out.print("Day " + (i+1) + " 's high temperature ");
			temps[i]=scanner.nextInt();
			sum+=temps[i];
		}
		double average =sum/numDays;
		int above=0;
		for(int i=0;i<temps.length;i++) {
			if(temps[i]>average) {
				above++;
			}
		}
		System.out.println();
		System.out.println("average temp = " + average);
		System.out.println(above + " days above average ");

	}

}
