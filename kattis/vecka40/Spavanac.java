package kattis;

import java.util.Scanner;

public class Spavanac {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int h = input.nextInt();
		int m = input.nextInt();

		m = m - 45;

		if (m < 0) {
			m = m + 60;
			h = h - 1;
		}
		if (h < 0) {
			h = h + 24;
		}

		System.out.println(h + " " + m);
	}

}
