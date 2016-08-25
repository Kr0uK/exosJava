package exos;

import java.util.Scanner;

public class Exos {

	static Scanner sc = new Scanner(System.in);
	int i = 0;
	static String exo = "";

	private static void choixExo() {
		try {
			System.out.println("Veuillez entrer le numéro de l'exercice :");
			exo = sc.nextLine();

			switch (exo) {
			case "1":
				exercice1();
				break;
			case "2":
				exercice2();
				break;
			case "3":
				exercice3();
				break;
			case "4":
				exercice4();
				break;
			case "5":
				exercice5();
				break;
			case "6":
				exercice6();
				break;
			case "7":
				exercice7();
				break;
			case "8":
				exercice8();
				break;
			case "9":
				exercice9();
				break;
			case "10":
				exercice10();
				break;
			case "11":
				exercice11();
				break;
			case "quitter":
			case "Q":
			case "exit":
				System.exit(0);

				choixExo();
				break;

			default:
				System.out.println("Veuillez rentrer un numéro valide (1-11)");

				choixExo();
				break;
			}
		} finally {

			if (sc != null) {
				sc.close();

			}

		}
	}

	public static void main(String[] args) {
		choixExo();
	}
	/*
	 * 11. Triangle de Pascal
	 * 
	 */

	private static void exercice11() {

		try {
			choixExo();
		} finally {

			if (sc != null) {
				sc.close();

			}

		}
	}
	/*
	 * 10. Ecrivez un algorithme qui demande un nombre entier à l’utilisateur.
	 * L’ordinateur affiche ensuite le message "Ce nombre est pair" ou
	 * "Ce nombre est impair" selon le cas.
	 * 
	 */

	private static void exercice10() {
		try {
			choixExo();
		} finally {

			if (sc != null) {
				sc.close();

			}

		}
	}
	/*
	 * 9. Une amélioration (relative) du principe précédent consiste à opérer
	 * avec un décalage non de 1, mais d’un nombre quelconque de lettres. Ainsi,
	 * par exemple, si l’on choisit un décalage de 12, les A deviennent des M,
	 * les B des N, etc. Réalisez un algorithme sur le même principe que le
	 * précédent, mais qui demande en plus quel est le décalage à utiliser.
	 * Votre sens proverbial de l'élégance vous interdira bien sûr une série de
	 * vingt-six "Si...Alors"
	 * 
	 */

	private static void exercice9() {
		try {
			choixExo();
		} finally {

			if (sc != null) {
				sc.close();

			}

		}
	}
	/*
	 * 8. Un des plus anciens systèmes de cryptographie (aisément déchiffrable)
	 * consiste à décaler les lettres d’un message pour le rendre illisible.
	 * Ainsi, les A deviennent des B, les B des C, etc. Ecrivez un algorithme
	 * qui demande une phrase à l’utilisateur et qui la code selon ce principe.
	 * Comme dans le cas précédent, le codage doit s’effectuer au niveau de la
	 * variable stockant la phrase, et pas seulement à l’écran.
	 * 
	 */

	private static void exercice8() {
		try {
			choixExo();
		} finally {

			if (sc != null) {
				sc.close();

			}

		}
	}
	/*
	 * 7. Ecrivez un algorithme qui demande une phrase à l’utilisateur. Celui-ci
	 * entrera ensuite le rang d’un caractère à supprimer, et la nouvelle phrase
	 * doit être affichée (on doit réellement supprimer le caractère dans la
	 * variable qui stocke la phrase, et pas uniquement à l’écran).
	 * 
	 */

	private static void exercice7() {
		try {
			choixExo();
		} finally {

			if (sc != null) {
				sc.close();

			}

		}
	}
	/*
	 * 6. Ecrivez un algorithme qui demande une phrase à l’utilisateur et qui
	 * affiche à l’écran le nombre de voyelles contenues dans cette phrase.On
	 * pourra écrire deux solutions. La première déploie une condition composée
	 * bien fastidieuse. La deuxième, en utilisant la fonction Trouve, allège
	 * considérablement l'algorithme.
	 * 
	 */

	private static void exercice6() {
		try {

			String str;
			int a = 0;
			int nbVoyelles = 0;
			System.out.println("Veuillez entrer une phrase");
			str = sc.nextLine();
			System.out.println("Veuillez choisir la méthode de fonctionnement du programme (1 ou 2)");
			a = Integer.parseInt(sc.nextLine());
			switch (a){
			case 1 : 
				nbVoyelles = exo6meth1(str);
				break;
			case 2 :
				nbVoyelles =exo6meth2(str);
				break;
			default :
				System.out.println("Veuillez entrer une réponse valide");
				exercice6();
		
			}
			System.out.println("Il y a "+ nbVoyelles + " voyelles dans la phrase que vous avez tapée.");
						
			choixExo();
		} finally {

			if (sc != null) {
				sc.close();

			}

		}
	}
	private static int exo6meth2(String phrase) {
	
		  
	int nbVoyelles;
	
	return nbVoyelles;	
	}

	private static int exo6meth1(String phrase) {
		
	
	int nbVoyelles;
	
	
	return nbVoyelles;
	}

	/*
	 * 5. Ecrivez un algorithme qui demande une phrase à l’utilisateur et qui
	 * affiche à l’écran le nombre de mots de cette phrase. On suppose que les
	 * mots ne sont séparés que par des espaces (et c'est déjà un petit peu
	 * moins bête)
	 * 
	 */

	private static void exercice5() {
		try {
			String str;

			int a = 0;
			System.out.println("Veuillez entrer une phrase");
			str = sc.nextLine();
			String[] mots = str.split("\\s");
			a = mots.length;
			System.out.println("Votre texte a une longueur de " + a + " mots");
			choixExo();
		} finally {

			if (sc != null) {
				sc.close();

			}

		}
	}
	/*
	 * 4. Ecrivez un algorithme qui demande un mot à l’utilisateur et qui
	 * affiche à l’écran le nombre de lettres de ce mot (c'est vraiment tout
	 * bête).
	 * 
	 */

	private static void exercice4() {
		try {
			String str;
			int a;
			System.out.println("Veuillez entrer un mot");
			str = sc.nextLine().trim();
			a = str.length();
			System.out.println("Le mot que vous avez entré fait " + a + " caractères");

			choixExo();
		} finally {

			if (sc != null) {
				sc.close();

			}

		}
	}
	/*
	 * 3. Ecrire un algorithme qui demande un nombre de d´epart, et qui calcule
	 * sa factorielle. NB : la factorielle de 8, not´ee 8 !, vaut 1 x 2 x 3 x 4
	 * x 5 x 6 x 7 x 8
	 * 
	 */

	private static void exercice3() {
		try {
			long somme = 1;
			long x = 1;
			System.out.println("Veuillez entrer un nombre");
			x = Integer.parseInt(sc.nextLine());
			for (int i = 1; i <= x; i++) {
				somme = somme * i;
			}
			System.out.println("La factorielle du nombre choisi est " + somme);

			choixExo();
		} finally {

			if (sc != null) {
				sc.close();

			}

		}
	}

	/*
	 * 2. Ecrire un algorithme qui demande un nombre de départ, et qui calcule
	 * la somme des entiers jusqu’`a ce nombre. Par exemple, si l’on entre 5, le
	 * programme doit calculer : 1 + 2 + 3 + 4 + 5 = 15 NB : on souhaite
	 * afficher uniquement le résultat, pas la décomposition du calcul.
	 * 
	 */
	private static void exercice2() {
		try {
			int somme = 0;
			int x = 0;
			System.out.println("Veuillez entrer un nombre");
			x = Integer.parseInt(sc.nextLine());
			for (int i = 0; i <= x; i++) {
				somme += i;

			}
			System.out.println("Le résultat de la somme des entiers jusqu'au nombre choisi est " + somme);
			choixExo();
		} finally {

			if (sc != null) {
				sc.close();

			}

		}
	}
	/*
	 * 1. Ecrire un programme qui échange la valeur de deux variables. Exemple,
	 * si a = 2 et b = 5, le programme donnera a = 5 et b = 2. Idem pour 3, puis
	 * généralisé à n
	 * 
	 */

	private static void exercice1() {
		try {
			int a, b;
			int temp = 0;
			System.out.println("Entrez un premier nombre A");
			a = Integer.parseInt(sc.nextLine());
			System.out.println("Entrez un second nombre B");
			b = Integer.parseInt(sc.nextLine());
			temp = a;
			a = b;
			b = temp;
			System.out.println("Le chiffre a est " + a + " et le chiffre b est " + b);
			choixExo();

		} finally {

			if (sc != null) {
				sc.close();

			}

		}
	}

}
