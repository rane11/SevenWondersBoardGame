package gfkSTry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;


public class CardsInHand  {

	public CardsInHand() {
		super();

	}

	public void compareCardsInHand(String cards, String wonder) {

		String cardsInHand = cards;
		//setWonderCards(wonder);
		//String wondercard = getWonderCards();
		String wondercard = wonder;
		int tracker = 0;

		for (int i = 0; i < cardsInHand.length(); i++) {
			String whatCardinHand = String.valueOf(cardsInHand.charAt(i));
			for (int j = 0; j < wondercard.length(); j++) {
				String compareWonderCard = String.valueOf(wondercard.charAt(j));
				if (whatCardinHand.equals(compareWonderCard)) {
					System.out.println("card position: " + i + " has cardInHand" + whatCardinHand
							+ " matches with wonderCard " + compareWonderCard);
					tracker++;
					break;
				}
			}
		}

		System.out.println("Tracker Count =" + tracker);
	}

	public void buildWithAllOptions(List<String> myCards, String wonder) {

		ArrayList<String> options1 = new ArrayList<String>();
		ArrayList<String> options2 = new ArrayList<String>();
		ArrayList<String> options3 = new ArrayList<String>();
		ArrayList<String> options4 = new ArrayList<String>();
		ArrayList<String> options5 = new ArrayList<String>();
		ArrayList<String> options6 = new ArrayList<String>();
		ArrayList<String> options7 = new ArrayList<String>();
		ArrayList<String> options8 = new ArrayList<String>();

		options1.add("W, W, S, S");
		options2.add("B, W, S, S");
		options3.add("S, W, S, S");
		options4.add("O, W, S, S");
		options5.add("W, W, B, S");
		options6.add("B, W, B, S");
		options7.add("S, W, B, S");
		options8.add("O, W, B, S");

		List<ArrayList<String>> allOptionsbwss = new ArrayList<ArrayList<String>>();
		allOptionsbwss.add(options1);
		allOptionsbwss.add(options2);
		allOptionsbwss.add(options3);
		allOptionsbwss.add(options4);
		allOptionsbwss.add(options5);
		allOptionsbwss.add(options6);
		allOptionsbwss.add(options7);
		allOptionsbwss.add(options8);

		List<String> cardsInHand = myCards;
	//	setWonderCards(wonder);

		if (wonder.replaceAll("\\W+", "").equals("WWSS")) {

			ListIterator iterator = allOptionsbwss.listIterator();
			int tracker = 0;

			while (iterator.hasNext()) {
				String OptStr = iterator.next().toString();
				if (OptStr.equals(cardsInHand.toString())) {
					System.out.println("Yes WWSS");
					tracker++;

					break;

				}

			}
			if (tracker < 1) {
				System.out.println("No");
			}

		}

		else if (wonder.replaceAll("\\W+", "").equals("BSWW")) {

			ArrayList<String> options11 = new ArrayList<String>();
			ArrayList<String> options12 = new ArrayList<String>();
			ArrayList<String> options13 = new ArrayList<String>();
			ArrayList<String> options14 = new ArrayList<String>();
			ArrayList<String> options15 = new ArrayList<String>();
			ArrayList<String> options16 = new ArrayList<String>();
			ArrayList<String> options17 = new ArrayList<String>();
			ArrayList<String> options18 = new ArrayList<String>();

			options11.add("S, W, W, S");
			options12.add("S, B, W, S");
			options13.add("S, S, W, S");
			options14.add("S, O, W, S");
			options15.add("S, W, W, B");
			options16.add("S, B, W, B");
			options17.add("S, S, W, B");
			options18.add("S, O, W, B");

			List<ArrayList<String>> allOptionsbsww = new ArrayList<ArrayList<String>>();
			allOptionsbsww.add(options11);
			allOptionsbsww.add(options12);
			allOptionsbsww.add(options13);
			allOptionsbsww.add(options14);
			allOptionsbsww.add(options15);
			allOptionsbsww.add(options16);
			allOptionsbsww.add(options17);
			allOptionsbsww.add(options18);

			ListIterator iterator = allOptionsbsww.listIterator();
			int tracker = 0;

			while (iterator.hasNext()) {
				String OptStr = iterator.next().toString();
				if (OptStr.equals(cardsInHand.toString())) {
					System.out.println("Yes SWWB");
					tracker++;

					break;

				}

			}
			if (tracker < 1) {
				System.out.println("No");
			}

		}

		else if (wonder.replaceAll("\\W+", "").equals("OS")) {
			// Cards [B, S, W/B/O] Can you build OS?

			ArrayList<String> options21 = new ArrayList<String>();
			ArrayList<String> options22 = new ArrayList<String>();
			ArrayList<String> options23 = new ArrayList<String>();

			options21.add("B, S, W");
			options22.add("B, S, B");
			options23.add("B, S, O");

			List<ArrayList<String>> allOptionsos = new ArrayList<ArrayList<String>>();
			allOptionsos.add(options21);
			allOptionsos.add(options22);
			allOptionsos.add(options23);

			ListIterator iterator = allOptionsos.listIterator();
			int tracker = 0;

			while (iterator.hasNext()) {
				String OptStr = iterator.next().toString();
				if (OptStr.equals(cardsInHand.toString())) {
					System.out.println("Yes _SO");
					tracker++;

					break;

				}

			}
			if (tracker < 1) {
				System.out.println("No");
			}

		}
		
		
		else if(wonder.replaceAll("\\W+", "").equals("WWW")) {
			System.out.println("No");
		}
		
		else if(wonder.replaceAll("\\W+", "").equals("WWBSSOO")) {
			System.out.println("No");
		}
		
		
		
		
		

		else {
			System.out.println("Invalid wonder. Ask for correct Wonder!!!");
		}

	}

}
