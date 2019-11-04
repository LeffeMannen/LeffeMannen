package vecka43;

import java.util.Scanner;

public class homework5 {

	public static void main(String[] args) {

		lol();

		int tal1;
		int tal2;
		Scanner input = new Scanner(System.in);
		System.out.println("skriv in två helal tal");
		tal1 = input.nextInt();
		tal2 = input.nextInt();

		System.out.println(max(tal1, tal2));

		
		int number;
		number = input.nextInt();
		count(number);																

		double celcius;
		celcius = input.nextDouble();
		System.out.println(kelvin(celcius));

		int fahrenheit;
		fahrenheit = input.nextInt();
		System.out.println(fahrenheit(fahrenheit));

		int age;
		age = input.nextInt();
		ageControl(age);

		int steps;
		steps = input.nextInt();
		stair(steps);																

	}

	public static void lol() {

		System.out.println("HAHAHAHAHAHAHA");
	}

	public static int max(int tal3, int tal4) {
		int tal5;
		if (tal3 >= tal4) {
			tal5 = tal3;
		} else {
			tal5 = tal4;
		}
		return tal5;
	}

	public static void count(int number) {
for (int i = 1; i <= number; i++){
	System.out.println(i);
}
	}

	public static double kelvin(double celcius) {
		double kelvin = 273.15;
		kelvin += celcius;
		return kelvin;
	}

	public static int fahrenheit(int fahrenheit) {

		int celcius = -40;
		celcius += fahrenheit;
		return celcius;
	}

	public static void ageControl(int age) {
		if (age <= 5) {
			System.out.println("Småbarn får inte göra något.");
		}

		else if (age <= 12) {
			System.out.println("Du får spela Fortnite.");
		}

		else if (age <= 14) {
			System.out.println("Du är tonåring.");
		}

		else if (age <= 17) {
			System.out.println("Du får köra moppe.");
		}

		else if (age <= 20) {
			System.out.println("Du får köra bil.");
		}

		else if (age <= 64) {
			System.out.println("Du får vuxenstraff om du gör något dumt.");
		}

		else if (age <= 99) {
			System.out.println("Du är pensionär.");
		}

		else {
			System.out.println("R.I.P?");
		}

	}

	public static void stair(int steps) {
		int steg;
		for(int i = 0; i <steps; i++) {
			
			steg = steps - i;
			for (int j = 0; j < steps; j++) {
                if (j < steg) {
                    System.out.print (" ");
                } else {
                    System.out.print ("X");

                }
            }
            System.out.println();

	}
	}
}
