/* Finds the min, max and average of the numbers given in a file.
Assignment 8, Question 3 */
import java.io.*;
import java.util.StringTokenizer;

public class Averages {
	//ArrayList<String> tokens = new ArrayList<>(); //To hold tokens from the Tokenizer
	//ArrayList<Integer> numbers = new ArrayList<>(); //To hold the tokens that are turned into numbers
	
	public static void averageIntegers() throws IOException {
			File f = new File("src\\03.txt");
			BufferedReader in = new BufferedReader(new FileReader(f));
			String line; //To hold each line as it's read
			
			int size = 0; //To hold number of tokens/numbers
			int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
			double average = 0;
			
			while((line = in.readLine()) != null) { //To keep going as long as there is a line to read
				StringTokenizer tokenizer = new StringTokenizer(line, " ");
				size += tokenizer.countTokens();
				int temp; //To hold next token for comparison
				
				while(tokenizer.hasMoreTokens()) {
					temp = Integer.parseInt(tokenizer.nextToken());
					
					if(max < temp) { //Doing the comparisons
						max = temp;
					} else if (min > temp) {
						min = temp;
					}
					average += temp;
				}
			}
			
			in.close();
			average /= size;
			
			System.out.println("Min Value: " + min);
			System.out.println("Max Value: " + max);
			
			System.out.print("Average Value: ");
			System.out.printf("%.2f", average);
	}

	public static void main(String[] args) {
		try {
			  averageIntegers();
			} catch (Exception ex) {
			  ex.printStackTrace();
			}
	}
}
