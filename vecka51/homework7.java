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
			System.out.println(" - Välkommen till Inet - ");
			System.out.println(" (1) - Datorer ");
			System.out.println(" (2) - Datorkomponenter ");
			System.out.println(" (3) - Bildskärm ");
			System.out.println(" (4) - Datortillbehör ");
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
					System.out.println("Acer Aspire XC-885 perfekt för dig som vill ha en stationär dator "
							+ "\nsom klarar dagliga uppgifter och vanliga underhållning."
							+ "\nDen är byggd i ett slimmat chassi utrustad med 8:e generationens"
							+ "\nCore i5-processor, 8GB RAM och en SSD på 256GB.");
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
					System.out.println("Enklare gamingdator som klarar de flesta spelen på"
							+ " \nmedium-inställningar i Full-HD. Datorn är utrustad med "
							+ " \n9:e generationens Intel Core i3-processor, 8 GB DDR4 RAM"
							+ " \noch GeForce GTX 1650 vilket kommer ge dig en snabb "
							+ " \nentry-dator perfekt för gaming.");
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
					System.out.println("Om du älskar spel och vill kunna spela på de högsta inställningarna "
							+ " \nför grafiken, då ska du välja en Nitro 50. Den är utformad för spel,"
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
					System.out.println("Om du älskar spel och vill kunna spela på höga grafikinställningarna,"
							+ " \ndå ska du välja en Nitro 50. Den är utformad för spel, och har den"
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
					System.out.println("Plato X8 från Akasa är ett fläktlöst chassi till "
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
							+ " \nhanterar de specifika behoven hos alla kreativa yrkesmänniskor. "
							+ " \nDen levererar en kraftfull och stabil prestanda för CAD-arbetsflöden "
							+ " \nför arkitektur, teknik och tillverkning kombinerat med en snygg "
							+ " \nkompakt design som enkelt smälter in i alla arbetsmiljöer. "
							+ " \nMed nionde generationens Intel Core i9-processorer och "
							+ " \nNVIDIA Quadro-grafik och supersnabb lagring är detta ett "
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
				System.out.println(" 2 - ASUS GeForce GT 1030 2GB LP Fläktlös");
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
					System.out.println("AMD Radeon RX 5700 seriens grafikkort är utvecklade med nya "
							+ " \nRDNA-arkitekturen och designade från grunden för högpresterande "
							+ " \ngaming i 1440p.\r\n" + "Hög energieffektivitet för högupplöst gaming. "
							+ " \n8GB GDDR6 minne och stöd för PCI Express 4.0.");
					System.out.println();
					System.out.println("Pris - 6 690 kr");
					System.out.println("https://www.inet.se/produkt/5410466/asrock-radeon-rx-5700-xt-8gb-taichi-oc");
					System.out.println();
					System.out.println(" 7 - Back ");
					choice2 = input.nextInt();
					break;

				case 2:

					System.out.println("  -( ASUS GeForce GT 1030 2GB LP Fläktlös )-  ");
					System.out.println();
					System.out.println("Nvidia GeForce GT 1030 är grafikkortet för dig som behöver hög "
							+ " \nupplösning på skärmen men samtidigt vill hålla elräkningen i schack. "
							+ " \nTill GT 1030 behövs ingen extra strömförsörjning utan drivs helt "
							+ " \nenkelt direkt från moderkortet.\r\n" + "");
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
					System.out.println("Enklare grafikkort som stödjer 3 skärmar");
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
					System.out.println("Nvidia GeForce GTX 1050 Ti är ett spelgrafikkort med alla finesser "
							+ " \nfrån den senaste Pascal-arkitekturen med ett nedskalat pris samt "
							+ " \nextremt låg strömförbrukning. Kortet passar bra att använda för att "
							+ " \nt.ex. uppgradera en äldre dator eller vill bygga en ny med slimmad "
							+ " \nbudget som passar för dig som är casual-gamer.");
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
					System.out.println("GeForce GTX 1650 är kortet för dig som siktar på e-sport i 1080p "
							+ " \nmed 60 fps, eller behöver mer kraft för ditt kreativa skapande "
							+ " \nän vad integrerad grafik ger.");
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
					System.out.println("GeForce GTX 1650 är kortet för dig som siktar på e-sport i 1080p med "
							+ " \n60 fps, eller behöver mer kraft för ditt kreativa skapande än "
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

				System.out.println(" - Bildskärm - ");
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
					System.out.println("EB243YB erbjuder bra ergonomi och flexibla placeringsmöjligheter "
							+ " \ntillsammans med tunna kanter om du vill ställa flera bredvid varandra "
							+ " \noch få en bra upplevelse. Skärmen har såväl höjd- som pivotjustering. "
							+ " \nDet följer dessutom VESA-standarden vilket ger dig möjlighet att hänga "
							+ " \nupp skärmen på väggen eller på ett stativ. Tack vare den kristallklara "
							+ " \nIPS-panelen får du 178 ° betraktningsvinkel, så du kan ställa skärmen "
							+ " \ndär den tar minst plats utan att tumma på bildkvaliteten.");
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
					System.out.println("Den här skärmen är perfekt om du vill ha flera skärmar bredvid varandra. "
							+ " \nDen supertunna kanten gör att du får en mycket liten kant mellan de olika "
							+ " \ndisplayerna. Vinklar du dem så kommer du ändå se alla detaljer och färger "
							+ " \ntack vare den breda betraktningsvinkeln på hela 178° som VA-panelen erbjuder. "
							+ " \nDessutom finns det rikligt med anslutningsmöjligheter.");
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
							"Acer XB252Q är en vrålsnabb Full HD, 1 ms, TN-panel med 240 Hz uppdateringsfrekvens "
									+ " \noch stöd för FreeSync, som gör rörelser mjukare och du slipper så kallad tearing. "
									+ " \nSkärmen har HDR10 för ett större intensitetsomgång vilket skapar en bättre känsla "
									+ " \nnär du spelar och tittar på film. Med inbyggd BlueLightShield förhindrar du trötta "
									+ " \nögon genom att minska skadligt blått ljus. XB252Q är även helt ergonomisk med pivot, "
									+ " \ntilt samt höj- och sänkbar.");
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
							.println("XV240YP är en FreeSync-kompatibel spelskärm med 165 Hz uppdateringhastighet via "
									+ " \nDisplayPort. Den kristallklara IPS-panelen garanterar breda betraktningsvinklar "
									+ " \nsamt naturtrogna färger med 99 % sRGB. Skärmen har HDR10 för ett större "
									+ " \nintensitetsomgång vilket skapar en bättre känsla när du spelar och tittar "
									+ " \npå film. Med full ergonomi, inklusive pivot, kan du anpassa skärmen efter "
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
					System.out.println("Acer XB241YU är försedd med WQHD upplösning på 2560x1440 pixlar och visar "
							+ " \nen mer fantastisk och hög bildkvalitet än någonsin. Hög upplösning höjer "
							+ " \ninte bara detaljåtergivningen, utan skapar också en enastående visuell "
							+ " \nnjutning för varje användare, som aldrig tidigare skådats på en spelskärm. "
							+ " \nUtrustad med G-Sync blir rörelser mjukare och du slipper så kallad tearing.");
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
					System.out.println("Acer SA240YA är en mångsidig skärm för dig som vill ha en stabil kontorsskärm, "
							+ " \nmen som du även vill kunna spela på. Den kristallklara IPS-panelen erbjuder "
							+ " \ngoda betraktningsvinklar och fina färger samtidigt som 75 Hz och FreeSync "
							+ " \nser till att spel flyter på som de ska. Skärmen har både Flicker-free och "
							+ " \nBlue Light Filter-teknologi som gör den mer skonsam mot ögonen.");
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

				System.out.println(" - Datortillbehör - ");
				System.out.println(" 1 - Logitech G502 Hero Wireless");
				System.out.println(" 2 - Logitech G PRO Wireless Gaming Mouse");
				System.out.println(" 3 - Ducky One 2 Mini MX Brown RGB");
				System.out.println(" 4 - ASUS ROG Sheath");
				System.out.println(" 5 - DELTACO Gaming Tangentbord Mekaniskt RGB 60%");
				System.out.println(" 6 - Tryckluft på burk, 400ml");
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
									+ " \ntrådlös anslutbarhet. En nästa generations HERO-sensor levererar DPI-ledande "
									+ " \n16k-prestanda och energieffektivitet – upp till 60 timmars oavbrutet spelande. "
									+ " \nElva programmerbara knappar hjälper dig att optimera spelandet med anpassade "
									+ " \nsnabbknappar och makron. Sex justerbara vikter låter dig hitta rätt muskänsla. "
									+ " \nKoppla ihop med POWERPLAY för ändlös laddning.");
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
					System.out.println("PRO Wireless är konstruerad så att den uppfyller de precisa kvalitetsskrav som "
							+ " \nnågra av världens mest framstående yrkesmässiga e-sportare ställer. Den har "
							+ " \nden senaste och mest avancerade teknik som finns att få och väger dessutom "
							+ " \nenbart 80 gram. Med LIGHTSPEED-tekniken har PRO Wireless fått bukt med begränsningar "
							+ " \nsom fördröjning, anslutnings- och energiproblem och skapat en bergsäker, supersnabb "
							+ " \nförbindelse med bara 1 ms reaktionstid.");
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
							.println("Ducky One 2 Mini är utrustat med MX Cherry brytare och högkvalitativa tangenter "
									+ " \ni PBT-plast vilket tar kvalitén till en ny nivå. De 5 robusta gummidynorna och "
									+ " \n2 gummifötterna ser till att tangentbordet stannar på plats under dina spelsessioner.");
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
					System.out.println("Stor musmatta från Asus med gummerad undersida förebygger att musmattan glider "
							+ " \nrunt. Sydda kanter ger musmattan längre hållbarhet.");
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
					System.out.println("Detta är det perfekta tangentbordet för dig som skall på LAN eller som har en "
							+ " \nportabel gaminghörna eller helt enkelt för dig som vill maximera "
							+ " \nskrivsbordsytan – oavsett anledning kommer detta tangentbord maximera din "
							+ " \nspelyta. Tangentbordet är bland annat utrustat med mekaniska brytare, "
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

					System.out.println("  -( Tryckluft på burk, 400ml )-  ");
					System.out.println();
					System.out.println("Komprimerad gas (tryckluft på burk) för att avlägsna damm och partiklar "
							+ " \nfrån svåråtkomliga ställen i datorer och annan utrustning.");
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
				System.out.println(" 1 - DELTACO Strömbrytare WiFi");
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

					System.out.println("  -( DELTACO Strömbrytare WiFi )-  ");
					System.out.println();
					System.out.println("SH-P01 är en trådlös strömbrytare som enkelt kan startas eller stängas av "
							+ " \nvia din telefon, både när du är hemma eller på distans. SH-P01 kan användas "
							+ " \ntill samtliga enheter som har rätt stickkontakt (max 10A). Perfekt för "
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
					System.out.println("Vanliga lampor är trista. Om du längtar efter en möjlighet att fullständigt "
							+ " \ntransformera sättet du lyser upp hemma och sätta din personliga prägel som "
							+ " \nom det vore ett blankt papper så finns det nu en ljuspanel för det.\r\n" + "\r\n"
							+ "Nanoleaf Canvas är en fyrkantig LED-platta utan kanter så du kan täcka "
							+ " \nhela väggar och tak och få dem att agera som en stor enhet.");
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
					System.out.println("Twinkly är den revolutionerande LED-ljussträngen som ger den mest avancerade "
							+ " \ntekniken till dina juldekorationer. Den kombinerar 250 ljusa, färgglada "
							+ " \nRGB-lysdioder, en Wi-Fi / Bluetooth-kontroller och en modern "
							+ " \nsmartphoneapplikation, redo att utföra fantastiska animationer enkelt "
							+ " \noch snabbt. Twinkly erbjuder ett brett utbud av fantastiska effekter, "
							+ " \nredo att spelas och anpassas, och full tillgång till onlinegalleriet, "
							+ " \ndär nya animationer alltid finns att ladda ner.");
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
							.println("Nanoleaf Aurora är det senaste inom smarta hem gadgets. Med 16,7 miljoner olika "
									+ " \nfärger lyser Nanoleaf Aurora upp ditt hem i all världens designkombinationer "
									+ " \noch låter dig styra stämningen i ditt vardagsrum, på ditt kontor, i ditt "
									+ " \nsovrum eller kök.");
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
					System.out.println("Även julgranar förtjänar RGB när det är juletider! Med 3:e generationens "
							+ " \nLED-teknik får du en klar och färgrik upplevelse. Varje ljus är omgivet "
							+ " \nav en skyddande och speciellt formad lins med ett platt huvud och ett "
							+ " \nopakt lager för att förstärka ljuseffekterna.");
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
					System.out.println("Med detta anspråkslösa lilla tillbehör kan du förvandla alla lampor, även "
							+ " \nen som du inte kan använda med en Hue-lampa, till smarta lampor så att "
							+ " \nde kan styras via Hue-appen eller din röst.");
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
				System.out.println(" 2 - Nintendo Switch - Konsol - Grå (2019)");
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
							+ " \noch spela där, möjligheterna är oändliga med VIVEs nya tracking system.");
					System.out.println();
					System.out.println("Pris - 9 490 kr");
					System.out.println("https://www.inet.se/produkt/2000254/htc-vive-cosmos");
					System.out.println();
					System.out.println(" 7 - Back ");
					choice6 = input.nextInt();
					break;

				case 2:

					System.out.println("  -( Nintendo Switch - Konsol - Grå (2019) )-  ");
					System.out.println();
					System.out.println("Det speciella med Nintendo Switch är att den både är en spelkonsol som "
							+ " \ndu kan använda i hemmet ansluten till din TV och en bärbar spelkonsol "
							+ " \nmed otrolig flexibilitet. Nu kan du spela dina favoritspel på ett "
							+ " \noptimalt sätt var du vill, när du vill.");
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
					System.out.println("Battlefield V utspelar sig under andra världskriget och i år har Dice "
							+ " \noch EA lagt mycket fokus på samarbete i laget. Det kommer som vanligt "
							+ " \nfinnas fyra klasser att levla upp plus ett gäng specialklasser, så "
							+ " \nkallade Archetypes. Nytt är att det inte kommer att släppas något "
							+ " \nsäsongspass vilket betyder att nya banor som släpps blir "
							+ " \ntillgängliga för alla spelare.");
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
					System.out.println("Xbox Series X kommer att innehålla en specialdesignad CPU baserad på "
							+ " \nAMDs Zen 2 och Radeon RDNA-arkitektur. Microsoft använder också en "
							+ " \nNVMe SSD på Xbox Series X, vilket lovar att snabba på laddtider. "
							+ " \nXbox Series X kommer också att stödja 8K-spel, ray tracing "
							+ " \n(strålspårning) och variabelt uppdateringsfrekvensstöd.");
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
					System.out.println("En svår och främmande väg väntar dig i en häpnadsväckande återberättelse "
							+ " \nav en klassisk historia. Följ Kratos när han äventyrar genom en djup "
							+ " \nberättelse om uppväxt, våld och önskan att bli en bättre man för sin "
							+ " \nsons skull. I en värld av monster, drakar och gudar vilar ansvaret "
							+ " \ntungt på dina axlar, och när ditt liv fylls av blod och kaos, "
							+ " \nhur ska du då hindra förflutna misstag från att påverka " + " \ndin framtid?");
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
					System.out.println("Upplev den förbättrade komforten och känslan av nya Xbox Wireless "
							+ " \nController, med snygg design, bra grepp och Bluetooth®-teknik "
							+ " \nför spel på Windows 10-enheter.");
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
