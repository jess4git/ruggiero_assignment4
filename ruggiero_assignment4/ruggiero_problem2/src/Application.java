import java.io.IOException; //import needed files

public class Application { //main class

	public static void main(String[] args) {
		
		String dataFile = "problem2.txt"; //call parameters
		String outputFile = "unique_word_counts.txt";
		
		DuplicateCounter duplicateCounter = new DuplicateCounter();
		
		try {
			duplicateCounter.count(dataFile); //call methods with try and catch
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			duplicateCounter.write(outputFile);
		}
		
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
