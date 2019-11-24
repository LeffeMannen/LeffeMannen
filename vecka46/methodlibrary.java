package vecka46;

public class methodlibrary {

	public static void main(String[] args) {

		System.out.println(FahToKel(100) + " Kelvin");
		System.out.println(KelToCel(0) + " Celcius");
		System.out.println(KmToM(90) + " meter per sekund");
		System.out.println(kEnergi(2, 2) + " Joule");
		System.out.println(pEnergi(2, 5) + " Joule");
		System.out.println(medelv�rde1(1, 5, 9) + " �r medelv�rdet");
		System.out.println(medelv�rde2(-1, 6, 10) + " �r medelv�rdet");
		System.out.println("PaParaZZi".trim().toLowerCase());
		System.out.println("Jag vill bli godk�nd i programmering! <3".replace("o", "0").trim().toUpperCase());
		System.out.println(svtTime(10, 2) + " meter per sekund");
		System.out.println(work(50, 10) + " arbetskraft");
		System.out.println(velocityToHeight(9.82) + " meter");
		System.out.printf("%.3f", 1.684);
		System.out.println(" cm3");
		System.out.println(sphereDiameterToRadius(20) + " cm");
		System.out.println(triangle(4, 6) + " cm2");

	}
/**
 * Omvandlar fahrenheit till Kelvin
 * @param fahrenheit
 * @return kelvin
 */
	public static double FahToKel(double fahrenheit) {

		double kelvin = (fahrenheit - 32) * 5 / 9 + 273.15;
		return kelvin;
	}
/**
 * Omvandlar kelvin till celcius
 * @param kelvin
 * @return celcius
 */
	public static double KelToCel(double kelvin) {

		double celcius = (kelvin - 273.15);
		return celcius;
	}
/**
 * Omvandlar hastighet i timmen till meter per sekund
 * @param velocityKmH
 * @return meter per sekund
 */
	public static double KmToM(double velocityKmH) {

		double velocityConversion = (velocityKmH / 3.6);
		return velocityConversion;
	}
/**
 * Multiplicerar massan med hastigheten f�r att f� fram kinetisk energi
 * @param mass
 * @param velocity
 * @return kinetisk energi
 */
	public static double kEnergi(double mass, double velocity) {

		double kinetiskenergi = mass * velocity;
		return kinetiskenergi;
	}
/**
 * Multiplicerar massan med h�jden g�nger gravitationen f�r att f� fram potentiell energi
 * @param mass
 * @param height
 * @return potentiell energi
 */
	public static double pEnergi(double mass, double height) {

		double potentiellenergi = mass * 9.82 * height;
		return potentiellenergi;
	}
/**
 * R�knar ut medelv�rdet p� 3 tal
 * @param first
 * @param second
 * @param last
 * @return medelv�rdet1
 */
	public static double medelv�rde1(double first, double second, double last) {
		double medelv�rde1 = (first + second + last) / 3;
		return medelv�rde1;
	}
/**
 * R�knar ut medelv�rdet p� 3 tal
 * @param first
 * @param second
 * @param last
 * @return medelv�rde2
 */
	public static double medelv�rde2(double first, double second, double last) {
		double medelv�rde2 = (first + second + last) / 3;
		return medelv�rde2;
	}
/**
 * R�knar ut tiden om man g�ngar str�cka med hastigheten
 * @param distance
 * @param velocity
 * @return tid
 */
	public static double svtTime(double distance, double velocity) {
		double svtTime = distance / velocity;
		return svtTime;
	}
/**
 * R�knar ut arbetskraften med hj�lp av kraft och str�cka
 * @param force
 * @param distance
 * @return arbetskraft
 */
	public static double work(double force, double distance) {
		double work = force * distance;
		return work;
	}
/**
 * R�knar ut hur h�gt ett f�rem�l med en viss hastighet upp�t kommer
 * @param velocity
 * @return h�jd
 */
	public static double velocityToHeight(double velocity) {
		double velocityToHeight = Math.pow(velocity, 2)/(2 * 9.82);
		return velocityToHeight;
	}
/**
 * R�knar ut radien p� ett klot med en viss volym
 * @param Volume
 * @return radie
 */
	public static double sphereVolumeToRadius(double Volume) {
		double sphereVolumeToRadius = Math.cbrt((3 * Volume / (4 * 3.14)));
		return sphereVolumeToRadius;
	}
/**
 * R�knar ut radien av diametern p� en cirkel
 * @param diameter
 * @return radie
 */
	public static double sphereDiameterToRadius(double diameter) {
		double sphereDiameterToRadius = diameter / 2;
		return sphereDiameterToRadius;
	}
/**
 * R�knar ut arean p� en triangle
 * @param bas
 * @param height
 * @return arean
 */
	public static double triangle(double bas, double height) {
		double circleVolume = bas * height / 2;
		return circleVolume;
	}
}
