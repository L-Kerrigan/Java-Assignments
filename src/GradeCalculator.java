/* This file reads in a student's grades and prints their average grade
Assignment 8, Question 2 */
import java.io.*;
import java.util.StringTokenizer;

public class GradeCalculator {
	public static void readFile() throws IOException {
			File f = new File("src\\grades2.csv");
			BufferedReader in = new BufferedReader(new FileReader(f));
			String line;
			
			int student = 0;
			double result = 0;
			
			while((line = in.readLine()) != null) {
				StringTokenizer tokenizer = new StringTokenizer(line, ", ");
				while(tokenizer.hasMoreTokens()) {
					for(int i = 0; i < 4; i++) {
						if(i == 0) { 
							student = Integer.parseInt(tokenizer.nextToken());
						}
						
						if(i == 1) {
							double j = Double.parseDouble(tokenizer.nextToken());
							result = j * 0.2; 
						}
						
						if(i == 2) {
							double j = Double.parseDouble(tokenizer.nextToken());
							result += j * 0.3;
						}
						
						if(i == 3) {
							double j = Double.parseDouble(tokenizer.nextToken());
							result += j * 0.5;
						}
						
					}
					System.out.println("Student no: " + student + ", Grade: " + result);
				}
			}
			in.close();
	}
	
	public static void main(String[] args){
		try {
			  GradeCalculator.readFile();
			} catch (Exception ex) {
			  ex.printStackTrace();
			}
	}
}
