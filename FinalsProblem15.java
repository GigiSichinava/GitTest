import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import acm.program.ConsoleProgram;

public class FinalsProblem15 extends ConsoleProgram {
	public void run() {

        // Two HashMaps to store relationships between persons, their friends, and their favorite bands		
		HashMap<String, ArrayList<String>> personAndFrineds = new HashMap<>();
		HashMap<String, ArrayList<String>> friendAndBand = new HashMap<>();
        
		// Finding unique persons based on their music band preferences compared to their friends
		List<String> uniquePersons = findUniquePersons(personAndFrineds, friendAndBand);
		println(uniquePersons);
	}

	private List<String> findUniquePersons(HashMap<String, ArrayList<String>> personAndFrineds,
			HashMap<String, ArrayList<String>> friendAndBand) {
 
		// List to store the unique persons
		List<String> uniquePersons = new ArrayList<String>();

		for (String person : personAndFrineds.keySet()) {

			boolean isUnique = true;

			// Iterating through each person
			ArrayList<String> bands = friendAndBand.get(person);

			// If the person doesn't like any bands, skip to the next person
			if (bands == null) {
				continue;
			}

            // Checking each friend of the person
			for (String friend : personAndFrineds.get(person)) {
                // Getting the list of bands liked by the friend
				ArrayList<String> frindsBands = friendAndBand.get(friend);
				if (frindsBands == null) {
					continue;
				}
				for (String band : bands) {
					if (frindsBands.contains(band)) {
                        // If found a common band, the person is not unique						
						isUnique = false;
						break;
					}
				}
			}
           
			// If the person is unique, add them to the list of unique persons
			if (isUnique) {
				uniquePersons.add(person); 						 
			}
		}
		return uniquePersons;
	}
}