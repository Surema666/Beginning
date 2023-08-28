import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int score = 0;
		char letterGrade = 'X';
		boolean safe = true;
		
		System.out.print("Enter Grade: ");
		try {
		score = (new Scanner(System.in)).nextInt();
		} catch (Exception e) {
			System.out.print("invalid response");
			safe = false;
		}
		/*
		if (score < 100 && score >= 90) {
			letterGrade = 'A';
		} else if (score < 90 && score >= 80) {
			letterGrade = 'B';
		}else if (score < 80 && score >= 70) {
			letterGrade = 'C';
		}else if (score < 70 && score >= 60) {
			letterGrade = 'D';
		}else if (score < 60 && score >= 0){
			letterGrade = 'F';
		} else {
			System.out.println("Invalid score!");
		}*/
		
		/*alternate method*/
		if (safe = true) {
		switch (score/10) {
		case 10:
		case 9: 
			letterGrade = 'A';
			break;
		case 8: 
			letterGrade = 'B';
			break;
		case 7: 
			letterGrade = 'C';
			break;
		case 6: 
			letterGrade = 'D';
			break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			letterGrade = 'F';
			break;
		default:
			System.out.println("invalid score!");
		} 
		}
		
		System.out.println(score + " >>> " + letterGrade);
	}

}
