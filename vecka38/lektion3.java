package vecka38;

import java.util.Scanner;

public class lektion3 {

	public static void main(String[] args) {
		
		
		Boolean svar = true;
		int age = 0;
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Hur gammal �r du?");
		age = input.nextInt();
		
		if(age >= 18) {
			System.out.println("DU �r gammal nog att k�ra bil hahahaHAHAahahAHAahHa");
		}
		
		else{
			System.out.println("F�rs�k igen om n�gra �r");
		}
	}

}

 