import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/** 
 * COMP 2503 Winter 2023 Assignment 1 
 * 
 * This program must read a input stream and keeps track of the 
 * frequency at which an avenger is mentioned either by name or alias.
 * 
 * @author Jackie Zheng, Jayden Eusebio-Wong, Jordan Mercurio
 * @date Winter 2023
*/

public class A1 {
	Scanner input;
	Avenger avenger = new Avenger(" "," ");


	public String[][] avengerRoster = { { "captainamerica", "rogers" }, { "ironman", "stark" },
			{ "blackwidow", "romanoff" }, { "hulk", "banner" }, { "blackpanther", "tchalla" }, { "thor", "odinson" },
			{ "hawkeye", "barton" }, { "warmachine", "rhodes" }, { "spiderman", "parker" },
			{ "wintersoldier", "barnes" } };

	private int topN = 4;
	private int totalwordcount = 0;
	private ArrayList<Avenger> avengersArrayList = new ArrayList<>();

	public static void main(String[] args) throws FileNotFoundException {
		A1 a1 = new A1();
		a1.run();
	}

	public void run() throws FileNotFoundException {
		
		readInput();
		printResults();
	}

	/**
	 * read the input stream and keep track  
	 * how many times avengers are mentioned by alias or last name.
	 * @throws FileNotFoundException 
	 */
	
	private void readInput() throws FileNotFoundException {
		/**
		 * In a loop, while the scanner object has not reached end of stream,
		 *	- read a word.
		 *	- clean up the word
		  *  - if the word is not empty, add the word count. 
		   * - Check if the word is either an avenger alias or last name then
			*	- Create a new avenger object with the corresponding alias and last name.
			*	- if this avenger has not been mentioned before, add the newly created avenger to the list, remember to set the frequency.	
		
		*/ 
		//input = new Scanner(System.in);
		Scanner input = new Scanner(new File("src/input2.txt"));
		while(input.hasNext()) {
		  String word = input.next().trim().toLowerCase().replaceAll("[^a-z]", "");
		  if (word.length()>0) {
		    totalwordcount++;
		    for (String[] avenger : avengerRoster) {
		      if (avenger[0].equals(word) || avenger[1].equals(word)) {
		        Avenger found = null;
		        for (Avenger a : avengersArrayList) {
		          if (a.alias.equals(avenger[0])) {
		            found = a;
		            
		          }
		        }
		        if (found != null) {
		          found.frequency++;
		        } else {
		          avengersArrayList.add(new Avenger(avenger[0], avenger[1]));
		        }
		        break;
		      }
		    } 
		  } 
		  printResults();
		} 
	
	}
	/**
	 * print the results
	 */
	private void printResults() {
		System.out.println("Total number of words: " + totalwordcount);
		System.out.println("Number of Avengers Mentioned: " + avengersArrayList.size());
		System.out.println();

		System.out.println("All avengers in the order they appeared in the input stream:");
		// Todo: Print the list of avengers in the order they appeared in the input
		// Make sure you follow the formatting example in the sample output
		
		// Looks for all the avengers that appeared in the input
		
			for(Avenger avenger:avengersArrayList) {
				System.out.println(avenger.getAlias() + " aka " + avenger.getLastName() + " mentioned " + avenger.getFrequency() + " times(s) ");
				
			}
		System.out.println();
		
		System.out.println("Top " + topN + " most popular avengers:");
		// Todo: Print the most popular avengers, see the instructions for tie breaking
		// Make sure you follow the formatting example in the sample output
		
		//Sorts the avengers that are the most popular to least
		
			Collections.sort(avengersArrayList, (avenger1, avenger2) -> avenger2.getFrequency() - avenger1.getFrequency());
				for(int i = 0; i < topN && i < avengersArrayList.size(); i++) {
					System.out.println(avengersArrayList.get(i).getAlias() + " aka " + avengersArrayList.get(i).getLastName() + " mentioned " + avengersArrayList.get(i).getFrequency() + " time(s) ");
		
				}
		System.out.println();

		System.out.println("Top " + topN + " least popular avengers:");
		// Todo: Print the least popular avengers, see the instructions for tie breaking
		// Make sure you follow the formatting example in the sample output
		
		//Sorts avengers that are least popular to most
		
			Collections.sort(avengersArrayList, (avenger1, avenger2) -> avenger2.getFrequency() - avenger1.getFrequency());
				for(int i = 0; i < topN && i < avengersArrayList.size(); i++) {
					System.out.println(avengersArrayList.get(i).getAlias() + " aka " + avengersArrayList.get(i).getLastName() + " mentioned " + avengersArrayList.get(i).getFrequency() + " time(s) ");
					
				}
		System.out.println();

		System.out.println("All mentioned avengers in alphabetical order:");
		// Todo: Print the list of avengers in alphabetical order
		// Make sure you follow the formatting example in the sample output
		
		//Sorts the avengers alphabetically 
		
			Collections.sort(avengersArrayList, (avenger1, avenger2) -> avenger1.getAlias().compareTo(avenger2.getAlias()));
				for(Avenger avenger : avengersArrayList) {
					System.out.println(avenger.getAlias() + " aka " + avenger.getLastName() + " mentioned " + avenger.getFrequency() + " time(s) ");
					
				}
		System.out.println();
	}
	
}