//import needed files

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.HashSet;

//main class 

public class DuplicateRemover {
	
//create string
	
	HashSet<String> uniqueWords = new HashSet<String>();
	
	//take input and remove duplicates
	
	public void remove(String dataFile) throws IOException {
		
		File file = new File(dataFile);
		Scanner reader = new Scanner(file);
		
		
		while (reader.hasNext()) {
			String[] word = reader.hasNextLine().split(" ");
			String edited = "";
			for (int i = 0; i < word.length; i++) {
				
				if (uniqueWords.add(word[i])) {
					edited += word[i] + " ";
					
				}
				
			}
			
			
			if (!edited.equals("")) {
				outputFile.add(edited);
			}
		}
		
		//write output of file after removal of duplication 
		
			public void write(String outputFile) throws IOException {
				
				FileWriter writer = new FileWriter(outputFile);
				writer.write(String.join("\n", outputFile));
				writer.close();
				System.out.println("File '" + writer + "' created!");
				
			}
		
	}
	
	


