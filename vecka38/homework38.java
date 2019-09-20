package vecka38;

import java.util.Scanner;

public class homework38 {

	public static void main(String[] args) {
	
		
		Boolean svar = true;
		double heltal1 = 0;
		double heltal2 = 0;
		double heltal3 = 0;
		double heltal4 = 0;
		double heltal5 = 0;
		double big = 0;
		double small = 0;
		double medelvarde = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv in 5 heltal:");
		heltal1 = input.nextInt();
		heltal2 = input.nextInt();
		heltal3 = input.nextInt();
		heltal4 = input.nextInt();
		heltal5 = input.nextInt();
		
		if(heltal1 >= heltal2 && heltal1 >= heltal3 && heltal1 >= heltal4 && heltal1 >= heltal5) {
			big = heltal1;
		}
		else if(heltal2 >= heltal1 && heltal2 >= heltal3 && heltal2 >= heltal4 && heltal2 >= heltal5) {
			big = heltal2;
		}
		else if(heltal3 >= heltal1 && heltal3 >= heltal2 && heltal3 >= heltal4 && heltal3 >= heltal5) {
			big = heltal3;
		}
		else if(heltal4 >= heltal1 && heltal4 >= heltal2 && heltal4 >= heltal3 && heltal4 >= heltal5) {
			big = heltal4;
		}
		else if(heltal5 >= heltal1 && heltal5 >= heltal2 && heltal5 >= heltal3 && heltal5 >= heltal4) {
			big = heltal5;
		}
		
		//större tal
		
		
		
		if(heltal1 <= heltal2 && heltal1 <= heltal3 && heltal1 <= heltal4 && heltal1 <= heltal5) {
			small = heltal1;
		}
		else if(heltal2 <= heltal1 && heltal2 <= heltal3 && heltal2 <= heltal4 && heltal2 <= heltal5) {
			small = heltal2;
		}
		else if(heltal3 <= heltal1 && heltal3 <= heltal2 && heltal3 <= heltal4 && heltal3 <= heltal5) {
			small = heltal3;
		}
		else if(heltal4 <= heltal1 && heltal4 <= heltal2 && heltal4 <= heltal3 && heltal4 <= heltal5) {
			small = heltal4;
		}
		else if(heltal5 <= heltal1 && heltal5 <= heltal2 && heltal5 <= heltal3 && heltal5 <= heltal4) {
			small = heltal5;
		}
		
		
		//mindre tal
		
		
		
		
		double medelvarde1 = (heltal1 + heltal2 + heltal3 + heltal4 + heltal5)/5;
		
		
		
		//medelvärde tal
		
		
		
		System.out.println("Det Högsta talet:" + big);
		System.out.println("Det Lägsta talet:" + small);
		System.out.println("Medelvärdet på alla tal:" + medelvarde1);
		
	}

}
