package application.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



/*Classifieds.java - Yash Kapoor
 * Where the List of Advertisements, loadAd() and createAd() are houses
 * Will be called upon in ClassifiedsController.java
 */
public class Classifieds {
	//creates the list of Advertisement objects from the loadAds method and returns it
	public List<Advertisement> callMe() {
		List<Advertisement> ads = loadAds("data//ads.csv");
		return ads;
	}
	
	//loadAds method: takes in the file name and returns the list
	static List<Advertisement> loadAds(String fileName) {
		List<Advertisement> ads = new ArrayList<>();
		//instance of BufferedReader
		try {
			File file = new File(fileName); //creates a File variable that is connected to data.csv
			FileReader fReader = new FileReader(file);//fileReader object
			
			BufferedReader bR = new BufferedReader(fReader); //BufferReader object
			String rows; //String for the rows
			
			//String jobTitle, fOp, phoneNum, name, date; //variables
			while((rows = bR.readLine()) != null) {
				String[] info = rows.split(","); //splits the info from the commas and puts it into the different indexes
				Advertisement ad = createAd(info); //calls createAd method
				//adding ad to ArrayList
				ads.add(ad);
			}
			fReader.close();
			bR.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return ads;
	}
	
	//createAd method that adds the Strings into the info indexes and returns a new Advertisement object
	private static Advertisement createAd(String[] info) {
		String jobTitle = info[0];
		String fOp = info[1];
		String phoneNum = info[2];
		String name = info[3];
		String date = info[4];
		return new Advertisement(jobTitle, fOp, phoneNum, name, date);
	}
	
}
