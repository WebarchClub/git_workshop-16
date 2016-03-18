import java.util.Scanner;

class DayOfTheYear{
	final int MAX_DAYS = 365;
	int i,day;
	String month;
	int day_array[] = {31,59,90,120,151,181,212,243,273,304,334,365};
	String month_array[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	DayOfTheYear(int day_num) {
		if(day_num > MAX_DAYS || day_num <=0){
			System.out.println("Invalid value entered");
			return;
		}
		day =day_num;
		DayCalc();
		Display();
	}
	public void DayCalc(){
		for(i=0; i<12; i++) {
			if(day_array[i]<day){
				continue;
			}
			else {
				month = month_array[i];
				if(i==0)
					return;
				else {
					day = day - day_array[i-1];
					return;
				}
			}
		}
	}
	
	public void Display() {
		System.out.println("The date is " + month + " " + day);
	}
	
}
public class Executer {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int day;
		System.out.println("Enter a day (MAX 365): ");
		day = scan.nextInt();
		DayOfTheYear obj = new DayOfTheYear(day);
		scan.close();
	}
}
