package application.controller;


import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import application.model.Advertisement;
import application.model.Classifieds;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/* ClassifiedController.java - Yash Kapoor
 * Is the Controller class for Classifieds.fxml
 * Has advertisements for the newspaper from ads.csv
 */


public class ClassifiedsController {
    @FXML
    private AnchorPane classifiedPage; //AnchorPane for whole scene
	
	@FXML
    private Button backHome; //button to go back to the home screen
	
	@FXML
    private Label jobT1, jobT2, jobT3, jobT4; //Job Title Labels
	
	@FXML
	private Label foP1, foP2, foP3, foP4; //Full Or Part Time Labels
	
	@FXML
	private Label p_Num1, p_Num2, p_Num3, p_Num4; //Phone Number Labels

    @FXML
    private Label n_d1, n_d2, n_d3, n_d4; //Name and Date Labels


    //initialize method: gets called before the scene opens
    //will call setAd1(), setAd2(), setAd3(), and setAd4()
    @FXML
    void initialize() throws IOException {
    	setAd1();
    	setAd2();
    	setAd3();
    	setAd4();
    }
    
    //puts the information of Ad1
    void setAd1() {
    	Classifieds cl = new Classifieds();
    	List<Advertisement> ads = cl.callMe();
    	//System.out.println(ads.get(0).getJobTitle());
    	jobT1.setText(ads.get(0).getJobTitle());
    	String fP = "";
    	if(ads.get(0).isFullOrPart()) {
    		fP = "(Full Time)";
    	}
    	else {
    		fP = "(Part Time)";
    	}
    	//System.out.println(fP);
    	foP1.setText(fP);
    	//System.out.println(ads.get(0).getPhoneNum());
    	p_Num1.setText(ads.get(0).getPhoneNum());
    	n_d1.setText("Posted by " + ads.get(0).getName() + ", " + ads.get(0).getDate());
    	//System.out.println("Posted by " + ads.get(0).getName() + ", " + ads.get(0).getDate());
    }
    //all the info of ad2
    void setAd2() {
    	Classifieds cl = new Classifieds();
    	List<Advertisement> ads = cl.callMe();
    	jobT2.setText(ads.get(1).getJobTitle());
    	String fP = "";
    	if(ads.get(1).isFullOrPart()) {
    		fP = "(Full Time)";
    	}
    	else {
    		fP = "(Part Time)";
    	}
    	foP2.setText(fP);
    	p_Num2.setText(ads.get(1).getPhoneNum());
    	n_d2.setText("Posted by " + ads.get(1).getName() + ", " + ads.get(1).getDate());
    }
    //all the info of ad3
    void setAd3() {
    	Classifieds cl = new Classifieds();
    	List<Advertisement> ads = cl.callMe();
    	jobT3.setText(ads.get(2).getJobTitle());
    	String fP = "";
    	if(ads.get(2).isFullOrPart()) {
    		fP = "(Full Time)";
    	}
    	else {
    		fP = "(Part Time)";
    	}
    	foP3.setText(fP);
    	p_Num3.setText(ads.get(2).getPhoneNum());
    	n_d3.setText("Posted by " + ads.get(2).getName() + ", " + ads.get(2).getDate());
    }
    //all the info of ad4
    void setAd4() {
    	Classifieds cl = new Classifieds();
    	List<Advertisement> ads = cl.callMe();
    	jobT4.setText(ads.get(3).getJobTitle());
    	String fP = "";
    	if(ads.get(3).isFullOrPart()) {
    		fP = "(Fart Time)";
    	}
    	else {
    		fP = "(Part Time)";
    	}
    	foP4.setText(fP);
    	p_Num4.setText(ads.get(3).getPhoneNum());
    	n_d4.setText("Posted by " + ads.get(3).getName() + ", " + ads.get(3).getDate());
    }
    

    //method for going back to the pain page
    @FXML
    void backtoMainPage(ActionEvent event) throws IOException {
    	URL url = new File("src/Main.fxml").toURI().toURL();
    	classifiedPage = FXMLLoader.load(url);
    	Scene mainScene = new Scene(classifiedPage);
    	Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
        window.setScene(mainScene);
        window.show();
    }
    
}
