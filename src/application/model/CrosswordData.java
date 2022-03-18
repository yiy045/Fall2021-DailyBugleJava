package application.model;

/*CrosswordData.java - yiy045
 * Basically this is the same thing as Advertisement.java
 * Created for holding the data of the files
 */
public class CrosswordData {
	private int puzzleNum; //integer for the number of the Puzzle
	private String hint; //String for the hint
	private String answer; //String for the answer to the puzzle
	
	//constructor for CrosswordData info
	public CrosswordData(String puzzleNum, String hint, String answer) {
		this.puzzleNum = Integer.parseInt(puzzleNum);
		this.hint = hint;
		this.answer = answer;
	}

	/**
	 * @return the puzzleNum
	 */
	public int getPuzzleNum() {
		return puzzleNum;
	}

	/**
	 * @param puzzleNum the puzzleNum to set
	 */
	public void setPuzzleNum(int puzzleNum) {
		this.puzzleNum = puzzleNum;
	}

	/**
	 * @return the hint
	 */
	public String getHint() {
		return hint;
	}

	/**
	 * @param hint the hint to set
	 */
	public void setHint(String hint) {
		this.hint = hint;
	}

	/**
	 * @return the answer
	 */
	public String getAnswer() {
		return answer;
	}

	/**
	 * @param answer the answer to set
	 */
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	

}
