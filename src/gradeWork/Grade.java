package gradeWork;

public class Grade {

	public static void main(String[] args) {
//		Q.1
		int grade = 79;
		if(grade>=90){
		    System.out.println("A");
		}
		else if(grade>=80 && grade <=89){
			 System.out.println("B");
		}
		else if(grade>=70 && grade <=79){
			 System.out.println("C");
		}
		else if(grade>=55 && grade <=69){
			 System.out.println("D");
		}
		else{
			 System.out.println("F");
	}
//		Q.2
		int day =9;
		switch(day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid days of the week");
		}
		
//		Q.3
		int num = 22;
		if(num%2==1) {
			System.out.println("Cool");
		}
		else if (num%2==0 && num>=2 && num<=5) {
			System.out.println("Not Cool");
		}
		
		else if (num%2==0 && num>=6 && num<=20) {
			System.out.println("Cool");
		}
		else if (num%2==0 && num>20) {
			System.out.println("Not Cool");
		}

}
}
