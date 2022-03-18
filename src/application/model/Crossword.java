package application.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/*Crossword.java - yiy045
 * Crossword class, will create the ArrayLists for the Across and Down crosswords
 * has loadData()
 */
public class Crossword {
	//ArrayList for the across file
	public List<CrosswordData> across = new ArrayList<>();
	//ArrayList for the down file
	public List<CrosswordData> down = new ArrayList<>();
	
	public void loadData(String acrossFile, String downFile) {
		//file object for the across file and the down file
		try {
			//File objects created for across.csv and down.csv
			File acrF = new File(acrossFile);
			File dwnF = new File(downFile);
			
			//FileReader objects for acrF and dwnF
			FileReader acrFR = new FileReader(acrF);
			FileReader dwnFR = new FileReader(dwnF);
			
			//BufferedReader objects created for acrFR and dwnFR
			BufferedReader brA = new BufferedReader(acrFR);
			BufferedReader brD = new BufferedReader(dwnFR);
			
			String rows; //String for the rows
			while((rows = brA.readLine()) != null) {
				String[] acrossInfo = rows.split(",");
				CrosswordData acrossCW = createCW(acrossInfo);
				//adding acrossCW to across Array List
				across.add(acrossCW);
			}
			acrFR.close(); //closes the fileReader
			brA.close(); //closes the BufferedReader
			
			while((rows = brD.readLine()) != null) {
				String[] downInfo = rows.split(",");
				CrosswordData downCW = createCW(downInfo);
				//adding downCW to down ArrayList
				down.add(downCW);
			}
			
			dwnFR.close(); //closes the FileReader
			brD.close(); //closes the BufferedReader
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	private static CrosswordData createCW(String[] cwInfo) {
		String puzzleNum = cwInfo[0];
		String hint = cwInfo[1];
		String answer = cwInfo[2];
		return new CrosswordData(puzzleNum, hint, answer);
	}
	
}
