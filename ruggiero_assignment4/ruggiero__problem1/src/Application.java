//import needed files

import java.io.IOException;

//main class

public class Application {
	
	public static void main(String[] args) {
		
		//create string
		
		DuplicateRemover duplicateRemover = new DuplicateRemover();
		
		//call the methods with try and catch
		
		try {
			duplicateRemover.remove("problem1.txt");
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
		try {
			duplicateRemover.write("unique_words.txt");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	
	}
	
}
