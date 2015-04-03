package reader.java;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DataReader {

	/**
	 * This class contains a main method which will be able to read a file.
	 */
	public static void main(String[] args){
		/* Use java API to read a file from external sources(can be a text file 
		 * in your documents folder)
		 * You must use Try...catch and finally block.
		 * You must use while loop.Use String array for extra credit.
		 * 
		 */
		String fileName = "C:\\Users\\Zarif\\Documents\\test.txt";

          String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }    

            // Always close files.
            bufferedReader.close();            
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                   
            // Or we could just do this: 
            // ex.printStackTrace();
        }
    }
}
