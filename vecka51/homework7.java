package vecka50;

import java.util.Scanner;

public class homework7 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int choice0 = 0;
		int choice1 = 0;
		int choice2 = 0;
		int choice3 = 0;
		int choice4 = 0;
		int choice5 = 0;
		int choice6 = 0;

		do {
			System.out.println(" - V�lkommen till Inet - ");
			System.out.println(" (1) - Datorer ");
			System.out.println(" (2) - Datorkomponenter ");
			System.out.println(" (3) - Bildsk�rm ");
			System.out.println(" (4) - Datortillbeh�r ");
			System.out.println(" (5) - Smarta Hem ");
			System.out.println(" (6) - Spel / Konsol / VR ");
			System.out.println();

			choice0 = input.nextInt();

			switch (choice0) {

			case 1:
				System.out.println(" - Datorer - ");
				System.out.println(" 1 - Acer Aspire XC-885 - i5 8GB 256GB");
				System.out.println(" 2 - Acer Nitro N50-600 - i3 8GB 256GB GTX 1650");
				System.out.println(" 3 - Acer Nitro N50-600 - i5 8GB 256GB GTX 1660Ti");
				System.out.println(" 4 - Acer Nitro N50-600 - i3 8GB 512GB GTX 1650");
				System.out.println(" 5 - Akaso Plato X8 Slim Fanless 8th Gen Intel NUC");
				System.out.println(" 6 - ASUS ProArt PA90 MiniPC - i9 32GB 512GB Quadro P4000");
				System.out.println();
				System.out.println(" 7 - Back ");
				System.out.println();

				choice1 = input.nextInt();
				switch (choice1) {
				case 1:

					System.out.println("  -( Acer Aspire XC-885 - i5 8GB 256GB )-  ");
					System.out.println();
					System.out.println("Acer Aspire XC-885 perfekt f�r dig som vill ha en station�r dator "
							+ "\nsom klarar dagliga uppgifter och vanliga underh�llning."
							+ "\nDen �r byggd i ett slimmat chassi utrustad med 8:e generationens"
							+ "\nCore i5-processor, 8GB RAM och en SSD p� 256GB.");
					System.out.println();
					System.out.println("Pris - 5 990 kr");
					System.out.println("https://www.inet.se/produkt/1978388/acer-aspire-xc-885-i5-8gb-256gb");
					System.out.println();
					System.out.println(" 7 - Back ");
					choice1 = input.nextInt();
					break;

				case 2:

					System.out.println("  -( Acer Nitro N50-600 - i3 8GB 256GB GTX 1650 )-  ");
					System.out.println();
					System.out.println("Enklare gamingdator som klarar de flesta spelen p�"
							+ " \nmedium-inst�llningar i Full-HD. Datorn �r utrustad med "
							+ " \n9:e generationens Intel Core i3-processor, 8 GB DDR4 RAM"
							+ " \noch GeForce GTX 1650 vilket kommer ge dig en snabb "
							+ " \nentry-dator perfekt f�r gaming.");
					System.out.println();
					System.out.println("Pris - 7 990 kr");
					System.out.println("https://www.inet.se/produkt/1978394/acer-nitro-n50-600-i3-8gb-256gb-gtx-1650");
					System.out.println();
					System.out.println(" 7 - Back ");
					choice1 = input.nextInt();
					break;

				case 3:

					System.out.println("  -( Acer Nitro N50-600 - i5 8GB 256GB GTX 1660Ti )-  ");
					System.out.println();
					System.out.println("Om du �lskar spel och vill kunna spela p� de h�gsta inst�llningarna "
							+ " \nf�r grafiken, d� ska du v�lja en Nitro 50. Den �r utformad f�r spel,"
							+ " \noch har den absolut senaste teknologin i form av Nvidia GeForce GTX"
							+ " \n1660Ti och nionde generationens Intel Core-processor.");
					System.out.println();
					System.out.println("Pris - 9 999 kr");
					System.out
							.println("https://www.inet.se/produkt/1978391/acer-nitro-n50-600-i5-8gb-256gb-gtx-1660ti");
					System.out.println();
					System.out.println(" 7 - Back ");
					choice1 = input.nextInt();
					break;
				case 4:

					System.out.println("  -( Acer Nitro N50-600 - i3 8GB 512GB GTX 1650 )-  ");
					System.out.println();
					System.out.println("Om du �lskar spel och vill kunna spela p� h�ga grafikinst�llningarna,"
							+ " \nd� ska du v�lja en Nitro 50. Den �r utformad f�r spel, och har den"
							+ " \nabsolut senaste teknologin i form av Nvidia GeForce GTX 1650 och nionde "
							+ "\ngenerationens Intel Core i5-processor.");
					System.out.println();
					System.out.println("Pris - 8 999 kr");
					System.out.println("https://www.inet.se/produkt/1978394/acer-nitro-n50-600-i3-8gb-256gb-gtx-1650");
					System.out.println();
					System.out.println(" 7 - Back ");
					choice1 = input.nextInt();
					break;
				case 5:

					System.out.println("  -( Akasa Plato X8 Slim Fanless 8th Gen Intel NUC )-  ");
					System.out.println();
					System.out.println("Plato X8 fr�n Akasa �r ett fl�ktl�st chassi till "
							+ "\n8e generationen Intel NUC (Bean Canyon) boards.");
					System.out.println();
					System.out.println("Pris - 1 499 kr");
					System.out.println(
							"https://www.inet.se/produkt/6903559/akasa-plato-x8-slim-fanless-8th-gen-intel-nuc");
					System.out.println();
					System.out.println(" 7 - Back ");
					choice1 = input.nextInt();
					break;
				case 6:

					System.out.println("  -( ASUS ProArt PA90 MiniPC - i9 32GB 512GB Quadro P4000 )-  ");
					System.out.println();
					System.out.println("Den splitternya ASUS Mini PC ProArt-serien med arbetsstationsklass "
							+ " \nhanterar de specifika behoven hos alla kreativa yrkesm�nniskor. "
							+ " \nDen levererar en kraftfull och stabil prestanda f�r CAD-arbetsfl�den "
							+ " \nf�r arkitektur, teknik och tillverkning kombinerat med en snygg "
							+ " \nkompakt design som enkelt sm�lter in i alla arbetsmilj�er. "
							+ " \nMed nionde generationens Intel Core i9-processorer och "
							+ " \nNVIDIA Quadro-grafik och supersnabb lagring �r detta ett "
							+ " \nriktigt kraftpaket.");
					System.out.println();
					System.out.println("Pris - 37 490 kr");
					System.out.println(
							"https://www.inet.se/produkt/2214219/asus-proart-pa90-minipc-i9-32gb-512gb-quadro-p4000");
					System.out.println();
					System.out.println(" 7 - Back ");
					choice1 = input.nextInt();
					break;
				}
				break;

			case 2:
				System.out.println(" - Datorkomponenter - ");
				System.out.println(" 1 - ASRock Radeon RX 5700 XT 8GB Taichi OC+");
				System.out.println(" 2 - ASUS GeForce GT 1030 2GB LP Fl�ktl�s");
				System.out.println(" 3 - ASUS GeForce GT 710 2GB Silent");
				System.out.println(" 4 - ASUS GeForce GTX 1050 Ti 4GB STRIX");
				System.out.println(" 5 - ASUS GeForce GTX 1650 4GB DUAL OC");
				System.out.println(" 6 - ASUS GeForce GTX 1650 4GB ROG STRIX GAMING OC");
				System.out.println();
				System.out.println(" 7 - Back ");
				System.out.println();

				choice2 = input.nextInt();
				switch (choice2) {
				case 1:

					System.out.println("  -( ASRock Radeon RX 5700 XT 8GB Taichi OC+ )-  ");
					System.out.println();
					System.out.println("AMD Radeon RX 5700 seriens grafikkort �r utvecklade med nya "
							+ " \nRDNA-arkitekturen och designade fr�n grunden f�r h�gpresterande "
							+ " \ngaming i 1440p.\r\n" + "H�g energieffektivitet f�r h�guppl�st gaming. "
							+ " \n8GB GDDR6 minne och st�d f�r PCI Express 4.0.");
					System.out.println();
					System.out.println("Pris - 6 690 kr");
					System.out.println("https://www.inet.se/produkt/5410466/asrock-radeon-rx-5700-xt-8gb-taichi-oc");
					System.out.println();
					System.out.println(" 7 - Back ");
					choice2 = input.nextInt();
					break;

				case 2:

					System.out.println("  -( ASUS GeForce GT 1030 2GB LP Fl�ktl�s )-  ");
					System.out.println();
					System.out.println("Nvidia GeForce GT 1030 �r grafikkortet f�r dig som beh�ver h�g "
							+ " \nuppl�sning p� sk�rmen men samtidigt vill h�lla elr�kningen i schack. "
							+ " \nTill GT 1030 beh�vs ingen extra str�mf�rs�rjning utan drivs helt "
							+ " \nenkelt direkt fr�n moderkortet.\r\n" + "");
					System.out.println();
					System.out.println("Pris - 990 kr");
					System.out.println("https://www.inet.se/produkt/5403345/asus-geforce-gt-1030-2gb-lp-flaktlos");
					System.out.println();
					System.out.println(" 7 - Back ");
					choice2 = input.nextInt();
					break;

				case 3:

					System.out.println("  -( ASUS GeForce GT 710 2GB Silent )-  ");
					System.out.println();
					System.out.println("Enklare grafikkort som st�djer 3 sk�rmar");
					System.out.println();
					System.out.println("Pris - 749 kr");
					System.out.println("https://www.inet.se/produkt/5410524/asus-geforce-gt-710-2gb-silent");
					System.out.println();
					System.out.println(" 7 - Back ");
					choice2 = input.nextInt();
					break;

				case 4:

					System.out.println("  -( ASUS GeForce GTX 1050 Ti 4GB STRIX )-  ");
					System.out.println();
					System.out.println("Nvidia GeForce GTX 1050 Ti �r ett spelgrafikkort med alla finesser "
							+ " \nfr�n den senaste Pascal-arkitekturen med ett nedskalat pris samt "
							+ " \nextremt l�g str�mf�rbrukning. Kortet passar bra att anv�nda f�r att "
							+ " \nt.ex. uppgradera en �ldre dator eller vill bygga en ny med slimmad "
							+ " \nbudget som passar f�r dig som �r casual-gamer.");
					System.out.println();
					System.out.println("Pris - 2 390 kr");
					System.out.println("https://www.inet.se/produkt/x125601/asus-geforce-gtx-1050-ti-4gb-strix");
					System.out.println();
					System.out.println(" 7 - Back ");
					choice2 = input.nextInt();
					break;

				case 5:

					System.out.println("  -( ASUS GeForce GTX 1650 4GB DUAL OC )-  ");
					System.out.println();
					System.out.println("GeForce GTX 1650 �r kortet f�r dig som siktar p� e-sport i 1080p "
							+ " \nmed 60 fps, eller beh�ver mer kraft f�r ditt kreativa skapande "
							+ " \n�n vad integrerad grafik ger.");
					System.out.println();
					System.out.println("Pris - 1 999 kr");
					System.out.println("https://www.inet.se/produkt/5407745/asus-geforce-gtx-1650-4gb-dual-oc");
					System.out.println();
					System.out.println(" 7 - Back ");
					choice2 = input.nextInt();
					break;

				case 6:

					System.out.println("  -( ASUS GeForce GTX 1650 4GB ROG STRIX GAMING OC )-  ");
					System.out.println();
					System.out.println("GeForce GTX 1650 �r kortet f�r dig som siktar p� e-sport i 1080p med "
							+ " \n60 fps, eller beh�ver mer kraft f�r ditt kreativa skapande �n "
							+ " \nvad integrerad grafik ger.");
					System.out.println();
					System.out.println("Pris - 2 290 kr");
					System.out.println(
							"https://www.inet.se/produkt/5407995/asus-geforce-gtx-1650-4gb-rog-strix-gaming-oc");
					System.out.println();
					System.out.println(" 7 - Back ");
					choice2 = input.nextInt();
					break;

				}

				break;

			case 3:

				System.out.println(" - Bildsk�rm - ");
				System.out.println(" 1 - Acer 24\" EB243YB IPS Pivot");
				System.out.println(" 2 - Acer 24\" KA241Y Full HD");
				System.out.println(" 3 - Acer 24\" Nitro XF252Q HDR 240 Hz FreeSync");
				System.out.println(" 4 - Acer 24\" Nitro XV240YP IPS 165 Hz");
				System.out.println(" 5 - Acer 24\" Predator XB241YU WQHD 144 Hz G-Sync");
				System.out.println(" 6 - Acer 24\" SA240YA IPS 75Hz FreeSync");
				System.out.println();
				System.out.println(" 7 - Back ");
				System.out.println();

				choice3 = input.nextInt();
				switch (choice3) {
				case 1:

					System.out.println("  -( Acer 24\" EB243YB IPS Pivot )-  ");
					System.out.println();
					System.out.println("EB243YB erbjuder bra ergonomi och flexibla placeringsm�jligheter "
							+ " \ntillsammans med tunna kanter om du vill st�lla flera bredvid varandra "
							+ " \noch f� en bra upplevelse. Sk�rmen har s�v�l h�jd- som pivotjustering. "
							+ " \nDet f�ljer dessutom VESA-standarden vilket ger dig m�jlighet att h�nga "
							+ " \nupp sk�rmen p� v�ggen eller p� ett stativ. Tack vare den kristallklara "
							+ " \nIPS-panelen f�r du 178 � betraktningsvinkel, s� du kan st�lla sk�rmen "
							+ " \nd�r den tar minst plats utan att tumma p� bildkvaliteten.");
					System.out.println();
					System.out.println("Pris - 1 990 kr");
					System.out.println("https://www.inet.se/produkt/2214702/acer-24-eb243yb-ips-pivot");
					System.out.println();
					System.out.println(" 7 - Back ");
					choice3 = input.nextInt();
					break;

				case 2:

					System.out.println("  -( Acer 24\" KA241Y Full HD )-  ");
					System.out.println();
					System.out.println("Den h�r sk�rmen �r perfekt om du vill ha flera sk�rmar bredvid varandra. "
							+ " \nDen supertunna kanten g�r att du f�r en mycket liten kant mellan de olika "
							+ " \ndisplayerna. Vinklar du dem s� kommer du �nd� se alla detaljer och f�rger "
							+ " \ntack vare den breda betraktningsvinkeln p� hela 178� som VA-panelen erbjuder. "
							+ " \nDessutom finns det rikligt med anslutningsm�jligheter.");
					System.out.println();
					System.out.println("Pris - 1 590 kr");
					System.out.println("https://www.inet.se/produkt/2212208/acer-24-ka241y-full-hd");
					System.out.println();
					System.out.println(" 7 - Back ");
					choice3 = input.nextInt();
					break;

				case 3:

					System.out.println("  -( Acer 24\" Nitro XF252Q HDR 240 Hz FreeSync )-  ");
					System.out.println();
					System.out.println(
							"Acer XB252Q �r en vr�lsnabb Full HD, 1 ms, TN-panel med 240 Hz uppdateringsfrekvens "
									+ " \noch st�d f�r FreeSync, som g�r r�relser mjukare och du slipper s� kallad tearing. "
									+ " \nSk�rmen har HDR10 f�r ett st�rre intensitetsomg�ng vilket skapar en b�ttre k�nsla "
									+ " \nn�r du spelar och tittar p� film. Med inbyggd BlueLightShield f�rhindrar du tr�tta "
									+ " \n�gon genom att minska skadligt bl�tt ljus. XB252Q �r �ven helt ergonomisk med pivot, "
									+ " \ntilt samt h�j- och s�nkbar.");
					System.out.println();
					System.out.println("Pris - 4 490 kr");
					System.out.println("https://www.inet.se/produkt/2300076/acer-24-nitro-xf252q-hdr-240-hz-freesync");
					System.out.println();
					System.out.println(" 7 - Back ");
					choice3 = input.nextInt();
					break;

				case 4:

					System.out.println("  -( Acer 24\" Nitro XV240YP IPS 165 Hz )-  ");
					System.out.println();
					System.out
							.println("XV240YP �r en FreeSync-kompatibel spelsk�rm med 165 Hz uppdateringhastighet via "
									+ " \nDisplayPort. Den kristallklara IPS-panelen garanterar breda betraktningsvinklar "
									+ " \nsamt naturtrogna f�rger med 99 % sRGB. Sk�rmen har HDR10 f�r ett st�rre "
									+ " \nintensitetsomg�ng vilket skapar en b�ttre k�nsla n�r du spelar och tittar "
									+ " \np� film. Med full ergonomi, inklusive pivot, kan du anpassa sk�rmen efter "
									+ " \ndin perfekta setup.");
					System.out.println();
					System.out.println("Pris - 2 690 kr");
					System.out.println("https://www.inet.se/produkt/2215863/acer-24-nitro-xv240yp-ips-165-hz");
					System.out.println();
					System.out.println(" 7 - Back ");
					choice3 = input.nextInt();
					break;

				case 5:

					System.out.println("  -( Acer 24\" Predator XB241YU WQHD 144 Hz G-Sync )-  ");
					System.out.println();
					System.out.println("Acer XB241YU �r f�rsedd med WQHD uppl�sning p� 2560x1440 pixlar och visar "
							+ " \nen mer fantastisk och h�g bildkvalitet �n n�gonsin. H�g uppl�sning h�jer "
							+ " \ninte bara detalj�tergivningen, utan skapar ocks� en enast�ende visuell "
							+ " \nnjutning f�r varje anv�ndare, som aldrig tidigare sk�dats p� en spelsk�rm. "
							+ " \nUtrustad med G-Sync blir r�relser mjukare och du slipper s� kallad tearing.");
					System.out.println();
					System.out.println("Pris - 5 490 kr");
					System.out.println("https://www.inet.se/produkt/2205434/acer-24-predator-xf240h-144-hz");
					System.out.println();
					System.out.println(" 7 - Back ");
					choice3 = input.nextInt();
					break;

				case 6:

					System.out.println("  -( Acer 24\" SA240YA IPS 75Hz FreeSync )-  ");
					System.out.println();
					System.out.println("Acer SA240YA �r en m�ngsidig sk�rm f�r dig som vill ha en stabil kontorssk�rm, "
							+ " \nmen som du �ven vill kunna spela p�. Den kristallklara IPS-panelen erbjuder "
							+ " \ngoda betraktningsvinklar och fina f�rger samtidigt som 75 Hz och FreeSync "
							+ " \nser till att spel flyter p� som de ska. Sk�rmen har b�de Flicker-free och "
							+ " \nBlue Light Filter-teknologi som g�r den mer skonsam mot �gonen.");
					System.out.println();
					System.out.println("Pris - 1 590 kr");
					System.out.println("https://www.inet.se/produkt/2214723/acer-24-sa240ya-ips-75hz-freesync");
					System.out.println();
					System.out.println(" 7 - Back ");
					choice3 = input.nextInt();
					break;

				}

				break;

			case 4:

				System.out.println(" - Datortillbeh�r - ");
				System.out.println(" 1 - Logitech G502 Hero Wireless");
				System.out.println(" 2 - Logitech G PRO Wireless Gaming Mouse");
				System.out.println(" 3 - Ducky One 2 Mini MX Brown RGB");
				System.out.println(" 4 - ASUS ROG Sheath");
				System.out.println(" 5 - DELTACO Gaming Tangentbord Mekaniskt RGB 60%");
				System.out.println(" 6 - Tryckluft p� burk, 400ml");
				System.out.println();
				System.out.println(" 7 - Back ");
				System.out.println();

				choice4 = input.nextInt();
				switch (choice4) {
				case 1:

					System.out.println("  -( Logitech G502 Hero Wireless )-  ");
					System.out.println();
					System.out
							.println("Nu kan du spela snabbare och mer exakt med G502 Lightspeed med supersnabb 1 ms, "
									+ " \ntr�dl�s anslutbarhet. En n�sta generations HERO-sensor levererar DPI-ledande "
									+ " \n16k-prestanda och energieffektivitet � upp till 60 timmars oavbrutet spelande. "
									+ " \nElva programmerbara knappar hj�lper dig att optimera spelandet med anpassade "
									+ " \nsnabbknappar och makron. Sex justerbara vikter l�ter dig hitta r�tt musk�nsla. "
									+ " \nKoppla ihop med POWERPLAY f�r �ndl�s laddning.");
					System.out.println();
					System.out.println("Pris - 1 490 kr");
					System.out.println("https://www.inet.se/produkt/6608533/logitech-g502-hero-wireless");
					System.out.println();
					System.out.println(" 7 - Back ");
					choice4 = input.nextInt();
					break;

				case 2:

					System.out.println("  -( Logitech G PRO Wireless Gaming Mouse )-  ");
					System.out.println();
					System.out.println("PRO Wireless �r konstruerad s� att den uppfyller de precisa kvalitetsskrav som "
							+ " \nn�gra av v�rldens mest framst�ende yrkesm�ssiga e-sportare st�ller. Den har "
							+ " \nden senaste och mest avancerade teknik som finns att f� och v�ger dessutom "
							+ " \nenbart 80 gram. Med LIGHTSPEED-tekniken har PRO Wireless f�tt bukt med begr�nsningar "
							+ " \nsom f�rdr�jning, anslutnings- och energiproblem och skapat en bergs�ker, supersnabb "
							+ " \nf�rbindelse med bara 1 ms reaktionstid.");
					System.out.println();
					System.out.println("Pris - 1 190 kr");
					System.out.println("https://www.inet.se/produkt/6100527/logitech-g-pro-wireless-gaming-mouse");
					System.out.println();
					System.out.println(" 7 - Back ");
					choice4 = input.nextInt();
					break;

				case 3:

					System.out.println("  -( Ducky One 2 Mini MX Brown RGB )-  ");
					System.out.println();
					System.out
							.println("Ducky One 2 Mini �r utrustat med MX Cherry brytare och h�gkvalitativa tangenter "
									+ " \ni PBT-plast vilket tar kvalit�n till en ny niv�. De 5 robusta gummidynorna och "
									+ " \n2 gummif�tterna ser till att tangentbordet stannar p� plats under dina spelsessioner.");
					System.out.println();
					System.out.println("Pris - 1 389 kr");
					System.out.println("https://www.inet.se/produkt/6100547/ducky-one-2-mini-mx-brown-rgb");
					System.out.println();
					System.out.println(" 7 - Back ");
					choice4 = input.nextInt();
					break;

				case 4:

					System.out.println("  -( ASUS ROG Sheath )-  ");
					System.out.println();
					System.out.println("Stor musmatta fr�n Asus med gummerad undersida f�rebygger att musmattan glider "
							+ " \nrunt. Sydda kanter ger musmattan l�ngre h�llbarhet.");
					System.out.println();
					System.out.println("Pris - 199 kr");
					System.out.println("https://www.inet.se/produkt/6100126/asus-rog-sheath");
					System.out.println();
					System.out.println(" 7 - Back ");
					choice4 = input.nextInt();
					break;

				case 5:

					System.out.println("  -( DELTACO Gaming Tangentbord Mekaniskt RGB 60% )-  ");
					System.out.println();
					System.out.println("Detta �r det perfekta tangentbordet f�r dig som skall p� LAN eller som har en "
							+ " \nportabel gamingh�rna eller helt enkelt f�r dig som vill maximera "
							+ " \nskrivsbordsytan � oavsett anledning kommer detta tangentbord maximera din "
							+ " \nspelyta. Tangentbordet �r bland annat utrustat med mekaniska brytare, "
							+ " \nRGB-belysning, Anti-Ghosting och N-Key Rollover.");
					System.out.println();
					System.out.println("Pris - 490 kr");
					System.out
							.println("https://www.inet.se/produkt/6100606/deltaco-gaming-tangentbord-mekaniskt-rgb-60");
					System.out.println();
					System.out.println(" 7 - Back ");
					choice4 = input.nextInt();
					break;

				case 6:

					System.out.println("  -( Tryckluft p� burk, 400ml )-  ");
					System.out.println();
					System.out.println("Komprimerad gas (tryckluft p� burk) f�r att avl�gsna damm och partiklar "
							+ " \nfr�n sv�r�tkomliga st�llen i datorer och annan utrustning.");
					System.out.println();
					System.out.println("Pris - 99 kr");
					System.out.println("https://www.inet.se/produkt/6301289/tryckluft-pa-burk-400ml");
					System.out.println();
					System.out.println(" 7 - Back ");
					choice4 = input.nextInt();
					break;
				}

				break;

			case 5:

				System.out.println(" - Smarta Hem - ");
				System.out.println(" 1 - DELTACO Str�mbrytare WiFi");
				System.out.println(" 2 - Nanoleaf Canvas, Smart Light Squares, 9 Paneler");
				System.out.println(" 3 - Twinkly Strings Julgransbelysning 250 RGB LED 20 m Generation II");
				System.out.println(" 4 - Nanoleaf Aurora Rhythm Smarter Kit, 15-pack");
				System.out.println(" 5 - Twinkly Strings Julgransbelysning 56 RGB LED 8 m");
				System.out.println(" 6 - Philips Hue Smart Kontakt");
				System.out.println();
				System.out.println(" 7 - Back ");
				System.out.println();

				choice5 = input.nextInt();
				switch (choice5) {
				case 1:

					System.out.println("  -( DELTACO Str�mbrytare WiFi )-  ");
					System.out.println();
					System.out.println("SH-P01 �r en tr�dl�s str�mbrytare som enkelt kan startas eller st�ngas av "
							+ " \nvia din telefon, b�de n�r du �r hemma eller p� distans. SH-P01 kan anv�ndas "
							+ " \ntill samtliga enheter som har r�tt stickkontakt (max 10A). Perfekt f�r "
							+ " \nt.ex. TV, dator, lampor eller annan belysning.");
					System.out.println();
					System.out.println("Pris - 99 kr");
					System.out.println("https://www.inet.se/produkt/3301123/deltaco-strombrytare-wifi");
					System.out.println();
					System.out.println(" 7 - Back ");
					choice5 = input.nextInt();
					break;

				case 2:

					System.out.println("  -( Nanoleaf Canvas, Smart Light Squares, 9 Paneler )-  ");
					System.out.println();
					System.out.println("Vanliga lampor �r trista. Om du l�ngtar efter en m�jlighet att fullst�ndigt "
							+ " \ntransformera s�ttet du lyser upp hemma och s�tta din personliga pr�gel som "
							+ " \nom det vore ett blankt papper s� finns det nu en ljuspanel f�r det.\r\n" + "\r\n"
							+ "Nanoleaf Canvas �r en fyrkantig LED-platta utan kanter s� du kan t�cka "
							+ " \nhela v�ggar och tak och f� dem att agera som en stor enhet.");
					System.out.println();
					System.out.println("Pris - 1 990 kr");
					System.out.println(
							"https://www.inet.se/produkt/3300792/nanoleaf-canvas-smart-light-squares-9-paneler");
					System.out.println();
					System.out.println(" 7 - Back ");
					choice5 = input.nextInt();
					break;

				case 3:

					System.out.println("  -( Twinkly Strings Julgransbelysning 250 RGB LED 20 m Generation II )-  ");
					System.out.println();
					System.out.println("Twinkly �r den revolutionerande LED-ljusstr�ngen som ger den mest avancerade "
							+ " \ntekniken till dina juldekorationer. Den kombinerar 250 ljusa, f�rgglada "
							+ " \nRGB-lysdioder, en Wi-Fi / Bluetooth-kontroller och en modern "
							+ " \nsmartphoneapplikation, redo att utf�ra fantastiska animationer enkelt "
							+ " \noch snabbt. Twinkly erbjuder ett brett utbud av fantastiska effekter, "
							+ " \nredo att spelas och anpassas, och full tillg�ng till onlinegalleriet, "
							+ " \nd�r nya animationer alltid finns att ladda ner.");
					System.out.println();
					System.out.println("Pris - 799 kr");
					System.out.println(
							"https://www.inet.se/produkt/5410374/twinkly-strings-julgransbelysning-250-rgb-led-20-m-generation-ii");
					System.out.println();
					System.out.println(" 7 - Back ");
					choice5 = input.nextInt();
					break;

				case 4:

					System.out.println("  -( Nanoleaf Aurora Rhythm Smarter Kit, 15-pack )-  ");
					System.out.println();
					System.out
							.println("Nanoleaf Aurora �r det senaste inom smarta hem gadgets. Med 16,7 miljoner olika "
									+ " \nf�rger lyser Nanoleaf Aurora upp ditt hem i all v�rldens designkombinationer "
									+ " \noch l�ter dig styra st�mningen i ditt vardagsrum, p� ditt kontor, i ditt "
									+ " \nsovrum eller k�k.");
					System.out.println();
					System.out.println("Pris - 2 190 kr");
					System.out
							.println("https://www.inet.se/produkt/3300670/nanoleaf-aurora-rhythm-smarter-kit-15-pack");
					System.out.println();
					System.out.println(" 7 - Back ");
					choice5 = input.nextInt();
					break;

				case 5:

					System.out.println("  -( Twinkly Strings Julgransbelysning 56 RGB LED 8 m )-  ");
					System.out.println();
					System.out.println("�ven julgranar f�rtj�nar RGB n�r det �r juletider! Med 3:e generationens "
							+ " \nLED-teknik f�r du en klar och f�rgrik upplevelse. Varje ljus �r omgivet "
							+ " \nav en skyddande och speciellt formad lins med ett platt huvud och ett "
							+ " \nopakt lager f�r att f�rst�rka ljuseffekterna.");
					System.out.println();
					System.out.println("Pris - 399 kr");
					System.out.println(
							"https://www.inet.se/produkt/5406309/twinkly-strings-julgransbelysning-56-rgb-led-8-m");
					System.out.println();
					System.out.println(" 7 - Back ");
					choice5 = input.nextInt();
					break;

				case 6:

					System.out.println("  -( Philips Hue Smart Kontakt )-  ");
					System.out.println();
					System.out.println("Med detta anspr�ksl�sa lilla tillbeh�r kan du f�rvandla alla lampor, �ven "
							+ " \nen som du inte kan anv�nda med en Hue-lampa, till smarta lampor s� att "
							+ " \nde kan styras via Hue-appen eller din r�st.");
					System.out.println();
					System.out.println("Pris - 299 kr");
					System.out.println("https://www.inet.se/produkt/8309548/philips-hue-smart-kontakt");
					System.out.println();
					System.out.println(" 7 - Back ");
					choice5 = input.nextInt();
					break;

				}
				break;

			case 6:

				System.out.println(" - Spel / Konsol / VR - ");
				System.out.println(" 1 - HTC VIVE Cosmos");
				System.out.println(" 2 - Nintendo Switch - Konsol - Gr� (2019)");
				System.out.println(" 3 - Battlefield V - PC");
				System.out.println(" 4 - Microsoft Xbox Series X");
				System.out.println(" 5 - God of War - PS4");
				System.out.println(" 6 - Microsoft Xbox One Wireless Controller Svart (Till PC)");
				System.out.println();
				System.out.println(" 7 - Back ");
				System.out.println();

				choice6 = input.nextInt();
				switch (choice6) {
				case 1:

					System.out.println("  -( HTC VIVE Cosmos )-  ");
					System.out.println();
					System.out.println("Med VIVE Cosmos flyttar all teknologi in i headsettet, ingen mer montering "
							+ " \nav sensorer. Ta med den hem eller till kontoret. Ta med den till en kompis "
							+ " \noch spela d�r, m�jligheterna �r o�ndliga med VIVEs nya tracking system.");
					System.out.println();
					System.out.println("Pris - 9 490 kr");
					System.out.println("https://www.inet.se/produkt/2000254/htc-vive-cosmos");
					System.out.println();
					System.out.println(" 7 - Back ");
					choice6 = input.nextInt();
					break;

				case 2:

					System.out.println("  -( Nintendo Switch - Konsol - Gr� (2019) )-  ");
					System.out.println();
					System.out.println("Det speciella med Nintendo Switch �r att den b�de �r en spelkonsol som "
							+ " \ndu kan anv�nda i hemmet ansluten till din TV och en b�rbar spelkonsol "
							+ " \nmed otrolig flexibilitet. Nu kan du spela dina favoritspel p� ett "
							+ " \noptimalt s�tt var du vill, n�r du vill.");
					System.out.println();
					System.out.println("Pris - 3 748 kr");
					System.out.println("https://www.inet.se/produkt/6609670/nintendo-switch-konsol-gra-2019");
					System.out.println();
					System.out.println(" 7 - Back ");
					choice6 = input.nextInt();
					break;

				case 3:

					System.out.println("  -( Battlefield V - PC )-  ");
					System.out.println();
					System.out.println("Battlefield V utspelar sig under andra v�rldskriget och i �r har Dice "
							+ " \noch EA lagt mycket fokus p� samarbete i laget. Det kommer som vanligt "
							+ " \nfinnas fyra klasser att levla upp plus ett g�ng specialklasser, s� "
							+ " \nkallade Archetypes. Nytt �r att det inte kommer att sl�ppas n�got "
							+ " \ns�songspass vilket betyder att nya banor som sl�pps blir "
							+ " \ntillg�ngliga f�r alla spelare.");
					System.out.println();
					System.out.println("Pris - 199 kr");
					System.out.println("https://www.inet.se/produkt/6335201/battlefield-v-pc");
					System.out.println();
					System.out.println(" 7 - Back ");
					choice6 = input.nextInt();
					break;

				case 4:

					System.out.println("  -( Microsoft Xbox Series X )-  ");
					System.out.println();
					System.out.println("Xbox Series X kommer att inneh�lla en specialdesignad CPU baserad p� "
							+ " \nAMDs Zen 2 och Radeon RDNA-arkitektur. Microsoft anv�nder ocks� en "
							+ " \nNVMe SSD p� Xbox Series X, vilket lovar att snabba p� laddtider. "
							+ " \nXbox Series X kommer ocks� att st�dja 8K-spel, ray tracing "
							+ " \n(str�lsp�rning) och variabelt uppdateringsfrekvensst�d.");
					System.out.println();
					System.out.println("Pris - 9 999 kr");
					System.out.println("https://www.inet.se/produkt/6335950/microsoft-xbox-series-x");
					System.out.println();
					System.out.println(" 7 - Back ");
					choice6 = input.nextInt();
					break;

				case 5:

					System.out.println("  -( God of War - PS4 )-  ");
					System.out.println();
					System.out.println("En sv�r och fr�mmande v�g v�ntar dig i en h�pnadsv�ckande �terber�ttelse "
							+ " \nav en klassisk historia. F�lj Kratos n�r han �ventyrar genom en djup "
							+ " \nber�ttelse om uppv�xt, v�ld och �nskan att bli en b�ttre man f�r sin "
							+ " \nsons skull. I en v�rld av monster, drakar och gudar vilar ansvaret "
							+ " \ntungt p� dina axlar, och n�r ditt liv fylls av blod och kaos, "
							+ " \nhur ska du d� hindra f�rflutna misstag fr�n att p�verka " + " \ndin framtid?");
					System.out.println();
					System.out.println("Pris - 149 kr");
					System.out.println("https://www.inet.se/produkt/6609374/god-of-war-ps4");
					System.out.println();
					System.out.println(" 7 - Back ");
					choice6 = input.nextInt();
					break;

				case 6:

					System.out.println("  -( Microsoft Xbox One Wireless Controller Svart (Till PC) )-  ");
					System.out.println();
					System.out.println("Upplev den f�rb�ttrade komforten och k�nslan av nya Xbox Wireless "
							+ " \nController, med snygg design, bra grepp och Bluetooth�-teknik "
							+ " \nf�r spel p� Windows 10-enheter.");
					System.out.println();
					System.out.println("Pris - 699 kr");
					System.out.println(
							"https://www.inet.se/produkt/6605184/microsoft-xbox-one-wireless-controller-svart-till-pc");
					System.out.println();
					System.out.println(" 7 - Back ");
					choice6 = input.nextInt();
					break;
				}

				break;

			default:
				System.out.println("error:. Wrong Command");
				System.out.println();
				break;
			}

		} while (choice6 == 7 || choice5 == 7 || choice4 == 7 || choice3 == 7 || choice2 == 7 || choice1 == 7);

	}

}
