import java.io.IOException; //import needed files
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class DuplicateCounter {  //main class

	HashMap<String, Integer> wordCounter = new HashMap<>();  //create string
	
	public void count(String dataFile) throws FileNotFoundException {  //counts the number of times the word is present
		
		File file = new File(dataFile);  //data file contains the words
		Scanner reader = new Scanner(file); //reader reads them
		
		while (reader.hasNext()) {
			String word = reader.next(); //word represents a word
			
			if (word != null && !word.isEmpty()) { //check to see if word is appearing more than once
				word = word.toLowerCase();
				
				if (wordCounter.containsKey(word)) {
					wordCounter.put(word, wordCounter.get(word) + 1); 
					
			}	else {
						wordCounter.put(word, 1);
						
			}
		}
	}
    
		reader.close();
		System.out.println(wordCounter);
	
	}
	
	public void write(String outputFile) throws IOException {  //displays output of how many times word is present
		
		FileWriter writer = new FileWriter(outputFile);
		
		for(Map.Entry<String, Integer> entry: wordCounter.entrySet()) {
			writer.write(entry.getKey() + "\t\t\t\t\t" + entry.getValue());
			writer.write("\n");
		}
		writer.close();
		}
	}

