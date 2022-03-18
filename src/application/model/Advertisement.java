package application.model;
/*Advertisement.java - Yash Kapoor
 * Is essentially the variables for the ads.csv file
 */
public class Advertisement {
	private String jobTitle; //jobTitle
	private boolean fullOrPart; //full time or part time
	private String phoneNum; //phone number
	private String name; //name
	private String date; //date
	
	public Advertisement(String jobTitle, String fullOrPart, String phoneNum, String name, String date) {
		this.jobTitle = jobTitle;
		this.fullOrPart = fullOrPart.equals("Full")?true:false;
		this.phoneNum = phoneNum;
		this.name = name;
		this.date = date;
	}

	/**
	 * @return the jobTitle
	 */
	public String getJobTitle() {
		return jobTitle;
	}

	/**
	 * @param jobTitle the jobTitle to set
	 */
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	/**
	 * @return the fullOrPart
	 */
	public boolean isFullOrPart() {
		return fullOrPart;
	}

	/**
	 * @param fullOrPart the fullOrPart to set
	 */
	public void setFullOrPart(boolean fullOrPart) {
		this.fullOrPart = fullOrPart;
	}

	/**
	 * @return the phoneNum
	 */
	public String getPhoneNum() {
		return phoneNum;
	}

	/**
	 * @param phoneNum the phoneNum to set
	 */
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}
	
}
