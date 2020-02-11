package com.dani452.game;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CapitalGame {

	static Scanner clavier = new Scanner(System.in);

	static Scanner clavier2 = new Scanner(System.in);

	public static void main(String[] args) {

		do {
			int NUMBER_QUESTIONS = 5;
			int index;

			ArrayList<String> questions = new ArrayList<String>();
			questions.add("Quelle est la capitale de ce pays: Allemagne?");
			questions.add("Quelle est la capitale de ce pays: Portugal?");
			questions.add("Quelle est la capitale de ce pays: Brésil?");
			questions.add("Quelle est la capitale de ce pays: France?");
			questions.add("Quelle est la capitale de ce pays: Angleterre?");
			questions.add("Quelle est la capitale de ce pays: Italie?");
			questions.add("Quelle est la capitale de ce pays: Canada?");
			questions.add("Quelle est la capitale de ce pays: Angola?");
			questions.add("Quelle est la capitale de ce pays: Arménie?");

			ArrayList<String> réponses = new ArrayList<String>();
			réponses.add("berlin");
			réponses.add("lisbonne");
			réponses.add("brasilia");
			réponses.add("paris");
			réponses.add("londre");
			réponses.add("rome");
			réponses.add("ottawa");
			réponses.add("luanda");
			réponses.add("erevan");

			ArrayList<Integer> indexesAlreadyTaken = new ArrayList<Integer>();

			int count = 0;

			for (int i = 0; i < NUMBER_QUESTIONS; i++) {

				do {
					Random random = new Random();
					index = random.nextInt(questions.size());
				} while (indexesAlreadyTaken.contains(index));

				System.out.println(questions.get(index));

				String reponse = clavier.nextLine().toLowerCase();
				indexesAlreadyTaken.add(index);

				if (reponse.contentEquals(réponses.get(index))) {
					System.out.println("Bonne réponse!");
					count += 1;

				} else {
					System.out.println("Mauvaise réponse, c'était " + réponses.get(index));
				}

			}

			System.out.println("Vous avez " + count + " bonnes réponses sur " + NUMBER_QUESTIONS + "!");
			System.out.println("Voulez vous rejouer? (O/N)");

		} while (clavier2.nextLine().equals("O"));
		System.out.println("Bye bye, see you later!");
	}
}
