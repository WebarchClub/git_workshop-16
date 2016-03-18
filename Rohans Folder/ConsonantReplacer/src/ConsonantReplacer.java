import java.util.Scanner;

public class ConsonantReplacer {
	public static String AlterString(String text) {
		for(int i=0; text.charAt(i)!='\0';i++) {
			if(text.charAt(i)!='a' || text.charAt(i)!='e' || text.charAt(i)!='i' || text.charAt(i)!='o' || text.charAt(i)!='u') {
				text.charAt(i)+=1;
			}
		}
		return text;
	}
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String entry,result;
		System.out.println("Enter a string :");
		entry = scan.nextLine();
		result = AlterString(entry);
		System.out.println("The altered string is : " + result);
		scan.close();
	}
}
