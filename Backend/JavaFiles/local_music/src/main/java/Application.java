

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.brownsoundtech.repository.GenerateLiveNationVenues;

public class Application {
	static String path = "/Users/williambrown/Development/LocalMusic/Backend/JavaFiles/LocalMusicServerApplet/src/main/";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stateCode[], apiKey[];
		
		apiKey = readFile(path + "apiKeys.txt", 1);
		stateCode = readFile(path + "stateCodes.txt", 59);
		new GenerateLiveNationVenues().gatherVenues(stateCode[0], apiKey[0]);
	}

	private static String[] readFile(String fileName, int size) {
		String information[] = new String[size];
		int i = 0;
		
		Scanner scan = null;
		
		try {
			File file = new File(fileName);
			scan = new Scanner(file);
			scan.useDelimiter("\n");
			
			while(scan.hasNext() && i < size) {
				information[i] = scan.next();
				i++;
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} finally {
			scan.close();
		}
		
		
		
		return information;
	}
	


}

