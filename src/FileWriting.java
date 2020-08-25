/* 2 methods for writing and reading .txt files
Assignment 8, Question 1 */
import java.io.*;
import java.util.Scanner;

public class FileWriting {
	//A method to write to a file, making a new one if one doesn't already exist
	public static void writeFile() {
		System.out.println("Enter your line. ");
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		in.close();
		
		try { //Try to create a new file object to use to write
			File f = new File("src\\message.txt");
			PrintWriter out = new PrintWriter(new FileOutputStream(f));
			
			if(!f.exists()) { //Try to create a new file if it doesn't exist
				f.createNewFile();
			}
			
			out.print(input);
			out.close();
		} catch (IOException ex) { ex.printStackTrace(); }
	}

	//A method to read a file
	public static void outputFile() {
		try { //Try to find the specified file
			File f = new File("src\\message.txt");
			BufferedReader inn = new BufferedReader(new FileReader(f));
			String line;

			//Keep reading from the file until there's nothing less
			while((line = inn.readLine()) != null) {
				System.out.println(line);
			}
			inn.close();
		} catch (IOException ex) { ex.printStackTrace(); }
	}

	public static void main(String[] args) {
		writeFile();
		outputFile();
	}

}
