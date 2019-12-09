package vecka48;

import java.util.Arrays;

public class homework6arrays {

	public static void main(String[] args) {
		// 100 tal i intervallet [0-9]
		int[] numbers = { 1, 1, 1, 2, 6, 7, 8, 4, 3, 7, 8, 9, 3, 1, 3, 7, 8, 5, 3, 4, 8, 9, 6, 4, 2, 4, 7, 9, 7, 4, 3,
				2, 3, 6, 7, 8, 7, 7, 5, 7, 9, 6, 1, 4, 0, 8, 6, 5, 6, 8, 9, 0, 7, 5, 4, 3, 2, 4, 5, 9, 8, 5, 9, 8, 8, 4,
				5, 6, 7, 8, 9, 0, 9, 0, 9, 7, 5, 2, 1, 2, 3, 4, 5, 4, 4, 5, 3, 4, 5, 0, 8, 7, 0, 7, 9, 7, 0, 6, 5, 4 };

		// 100 namn
		String[] names = { "Crystal", "Tam", "Ed", "Beulah", "Daina", "Benjamin", "Kia", "Clelia", "Cassy", "Gita",
				"Celsa", "Karoline", "Talitha", "Lewis", "Betsy", "Colin", "Glendora", "Carola", "Rosalba", "Jeanie",
				"Yevette", "Armand", "Neal", "Lilla", "Dorethea", "Delta", "Maye", "Nikita", "Shoshana", "Carola",
				"Margie", "Haywood", "Venessa", "Natacha", "Gilbert", "Kandi", "Tyisha", "Tammie", "Blossom", "Penney",
				"Diana", "Audrey", "Willard", "Zoraida", "Drusilla", "Jacquline", "Cyndy", "Janiece", "Tressie", "Kami",
				"Lashanda", "Leann", "Tom", "Santana", "Junita", "Gisela", "Tom", "Marquerite", "Bryant", "Lauralee",
				"Yael", "Kelle", "Samantha", "Tom", "Meta", "Lanette", "Wanetta", "Carola", "Jana", "Neal", "Brady",
				"Rigoberto", "Felicia", "Hellen", "Georgeann", "Carola", "Isaias", "Ellis", "Roseanne", "Lenard", "Ela",
				"Ophelia", "Alesha", "Mafalda", "Flor", "Kelsi", "Autumn", "Sondra", "Pasty", "Jacquelyne", "Benjamin",
				"Emmie", "Mickie", "Lang", "Jamee", "Felice", "Daniella", "Carola", "Nathalie", "Genevive" };

		System.out.println(numberOf7(numbers));
		System.out.println(numberOfTom(names));
		System.out.println(mostNumbers(numbers));
		System.out.println(leastNumbers(numbers));
		System.out.println(Drusilla(names));
		System.out.println(Summa(numbers));
		System.out.println(antalTal(numbers));
		System.out.println(L(names));
		System.out.println(fem(names));
		System.out.println(unik(names));
		System.out.println(flestgånger(names));
	}

// hur många 7:or finns det i numbers?
	public static int numberOf7(int[] numbers) {
		int howMany7 = 0;

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] == 7) {
				howMany7++;
			}
		}
		return howMany7;
	}

	// hur många Tom finns det i names?
	public static int numberOfTom(String[] names) {
		int tom = 0;

		for (int i = 0; i < names.length; i++) {

			if (names[i].contains("Tom")) {
				tom++;
			}
		}
		return tom;
	}

	public static int mostNumbers(int[] numbers) {

		int most = 0;
		int amount = 0;
		int max = 0;

		for (int i = 0; i < 10; i++) {
			amount = 0;
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[j] == i) {
					amount++;
				}
			}
			if (amount > max) {
				most = i;
				max = amount;
			}

		}

		return most;
	}

	public static int leastNumbers(int[] numbers) {

		int least = 0;
		int min = 100;

		for (int i = 0; i < 10; i++) {
			int amount = 0;
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[j] == i) {
					amount++;
				}
			}
			if (amount < min) {
				least = i;
				min = amount;
			}

		}

		return least;
	}

	public static int Drusilla(String[] names) {

		int index = 0;

		for (int i = 0; i < names.length; i++) {
			if (names[i].contains("Drusilla")) {
				index = i;
			}
		}

		return index;
	}

	public static int Summa(int[] numbers) {

		int summa = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				summa += numbers[i];
			}
		}
		return summa;
	}

	public static String antalTal(int[] numbers) {

		int noll = 0;
		int ett = 0;
		int två = 0;
		int tre = 0;
		int fyra = 0;
		int fem = 0;
		int sex = 0;
		int sju = 0;
		int åtta = 0;
		int nio = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 0) {
				noll++;
			} else if (numbers[i] == 1) {
				ett++;
			} else if (numbers[i] == 2) {
				två++;
			} else if (numbers[i] == 3) {
				tre++;
			} else if (numbers[i] == 4) {
				fyra++;
			} else if (numbers[i] == 5) {
				fem++;
			} else if (numbers[i] == 6) {
				sex++;
			} else if (numbers[i] == 7) {
				sju++;
			} else if (numbers[i] == 8) {
				åtta++;
			} else if (numbers[i] == 9) {
				nio++;
			}
		}
		String antal = "Antal nollor: " + noll + "\nAntal ettor: " + ett + "\nAntal tvåor: " + två + "\nAntal treor: "
				+ tre + "\nAntal fyror: " + fyra + "\nAntal femor: " + fem + "\nAntal sexor: " + sex + "\nAntal sjuor: "
				+ sju + "\nAntal åttor: " + åtta + "\nAntal nior: " + nio;
		return antal;
	}

	public static int L(String[] names) {
		int L = 0;

		for (int i = 0; i < names.length; i++) {

			if (names[i].startsWith("L")) {
				L++;
			}
		}
		return L;
	}

	public static int fem(String[] names) {
		int fem = 0;

		for (int i = 0; i < names.length; i++) {

			int bokstav = 0;

			for (int j = 0; j < names[i].length(); j++) {
				bokstav++;
			}
			if (bokstav == 5) {
				fem++;
			}
		}
		return fem;
	}

	public static int unik(String[] names) {
		int unik = 0;
		int summa = 0;

		for (int i = 0; i < names.length; i++) {
			unik = 0;
			for (int j = 0; j < names.length; j++) {
				if (names[i] == names[j]) {

					unik++;

				}

			}
			if (unik == 1) {
				summa++;
			}

		}
		return summa;
	}

	public static String flestgånger(String[] names) {
		String svar = "";
		int mest = 0;
		int max = 0;

		for (int i = 0; i < names.length; i++) {
			mest = 0;
			for (int j = 0; j < names.length; j++) {
				if (names[i] == names[j]) {

					mest++;

				}

			}
			if (mest > max) {
				svar = names[i];
				max = mest;
			}

		}
		return svar;
	}
}
