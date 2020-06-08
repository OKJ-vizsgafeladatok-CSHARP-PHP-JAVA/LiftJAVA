import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static List<Lift> fajlBeolvas() {
		List<Lift> liftLista = new ArrayList<>();
		try {

			List<String> sorok = Files.readAllLines(Paths.get("lift.txt"));
			for (String sor : sorok.subList(0, sorok.size())) {
				String[] split = sor.split(" ");

				Lift o = new Lift((split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]),
						Integer.parseInt(split[3]));

				liftLista.add(o);
			}

		} catch (IOException ex) {

		}

		return liftLista;
	}

	public static Scanner beker = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("2.feladat: ");
		System.out.println("\t" + "A fájl tartalma beolvasva: ");
		List<Lift> liftek = fajlBeolvas();

		if (liftek.size() > 1000) {

		} else {

			for (Lift lift : liftek) {

				 System.out.println(lift);
			}

		}

		System.out.println("\n" + "3.feladat: ");

		int liftHasznalat = liftek.size();

		System.out.println("\t" + liftHasznalat + " alkalom.");

		System.out.println("\n" + " 4.feladat: ");

		int i = 0;
		String idotartam = " ";

		for (Lift lift : liftek) {
			if (i == 0) {

				idotartam = lift.getHaszn_id();

			} else if (i == liftek.size() - 1) {

				idotartam += " - " + lift.getHaszn_id();

			}
			i++;
		}
		System.out.println("\t" + idotartam);

		System.out.println("\n" + "5.feladat");

		int max = Integer.MIN_VALUE;
		Lift legnagyobb = null;

		for (Lift lift : liftek) {

			if (lift.getCélszint_sorszam() > max) {
				max = lift.getCélszint_sorszam();
				legnagyobb = lift;

			}

		}
		System.out.println("\t" + " A legnagyobb célszint sorszáma: " + legnagyobb.getCélszint_sorszam());

		System.out.println("6. feladat: ");
		System.out.println("Kérek egy kártya sorszámot: ");
		int kartyaszam;
		System.out.println("Kérek egy célszint számot:");
		int celszintszam;
		try {

			kartyaszam = Integer.parseInt(beker.nextLine());

		} catch (NumberFormatException ex) {

			kartyaszam = 5;

		}
		try {

			celszintszam = Integer.parseInt(beker.nextLine());

		} catch (NumberFormatException ex) {

			celszintszam = 5;

		}
		System.out.println(" A kártya száma: " + kartyaszam);
		System.out.println(" A célszint száma: " + celszintszam);

		System.out.println("\n" + "7. feladat: ");

		Boolean kartya = false;
		Boolean utazas = false;

		for (Lift lift : liftek) {
			if (kartyaszam == lift.getKartya_sorszam()) {

				kartya = true;

				if (celszintszam == lift.getCélszint_sorszam()) {

					utazas = true;
				}

			}

		}
		if (utazas) {

			System.out.println("A " + kartyaszam + " számú kártyával utaztak " + celszintszam + " célemeletre");

		} else {

			System.out.println("A " + kartyaszam + " számú kártyával nem utaztak " + celszintszam + " célemeletre");

		}
			
		   System.out.println("\n" + "8.feladat: ");
		
		  
		   
		   
		   
	}
}
