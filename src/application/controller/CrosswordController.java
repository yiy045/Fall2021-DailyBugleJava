package application.controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import application.model.Crossword;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/*CrosswordController.java - Yash Kapoor
 * Is the controller for the crossword scene
 * Will have initialize method and holds the crossword stuff
 */
public class CrosswordController {
	//AnchorPane for crossword page
    @FXML
    private AnchorPane cwPage;
    //private Button for getting back to the home page
    @FXML
    private Button backHome;
    
    @FXML
    private Button showAnswersButton;
    
    @FXML
    private Button checkAnswersButton;
    
    //private Label for the across Questions
    @FXML
    private Label aQ1, aQ2, aQ3, aQ4;
    
    //private Label for the down Questions
    @FXML
    private Label dQ1, dQ2, dQ3, dQ4, dQ5;
    
    @FXML
    private TextField ad1_T, a1_E, a1_X, a1_A, ad17_S, d1_X; //TEXAS AND TX
    @FXML
    private TextField d7_T, ad27_A, d7_R, ad37_S, a2_S, a2_G; //STARS & GAS
    @FXML
    private TextField ad35_C, ad36_O, a3_A, a3_T, a3_E, ad38_R; //COASTER
    @FXML
    private TextField a4_B, a4_E, ad45_E, ad46_F; //BEEF
    @FXML
    private TextField d5_A; //ACE
    @FXML
    private TextField d8_F, d8_A, d8_M; //FARM
    
    private boolean shown = false; //booleans for when the button is clicked again the textfields become blank
    private boolean checked = false;
    
    
    @FXML
    public void initialize() throws IOException {
    	num_Hint();
    }

    //handleHome method that will return to the home page
    @FXML
    private void handleHome(ActionEvent event) throws IOException {
    	URL url = new File("src/Main.fxml").toURI().toURL();
    	cwPage = FXMLLoader.load(url);
    	Scene mainScene = new Scene(cwPage);
    	Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
        window.setScene(mainScene);
        window.show();
    }
    
    //displays the answers and when clicked again turns the textfield black
    @FXML
    private void handleAnswers(ActionEvent event) throws IOException {
    	if(!shown) {
    	//TEXAS
    	ad1_T.setText("T");
    	a1_E.setText("E");
    	a1_X.setText("X");
    	a1_A.setText("A");
    	ad17_S.setText("S");
    	//TX
    	d1_X.setText("X");
    	//STARS
    	d7_T.setText("T");
    	d7_R.setText("R");
    	ad37_S.setText("S");
    	//GAS
    	a2_G.setText("G");
    	ad27_A.setText("A");
    	a2_S.setText("S");
    	//COASTER
    	ad35_C.setText("C");
    	ad36_O.setText("O");
    	a3_A.setText("A");
    	a3_T.setText("T");
    	a3_E.setText("E");
    	ad38_R.setText("R");
    	//BEEF
    	a4_B.setText("B");
    	a4_E.setText("E");
    	ad45_E.setText("E");
    	ad46_F.setText("F");
    	//ACE
    	d5_A.setText("A");
    	//FARM
    	d8_F.setText("F");
    	d8_A.setText("A");
    	d8_M.setText("M");
    	shown = true;
    	}
    	else {
    		ad1_T.setText("");
        	a1_E.setText("");
        	a1_X.setText("");
        	a1_A.setText("");
        	ad17_S.setText("");
        	//TX           ""
        	d1_X.setText("");
        	//STARS        ""
        	d7_T.setText("");
        	d7_R.setText("");
        	ad37_S.setText("");
        	//GAS          ""
        	a2_G.setText("");
        	ad27_A.setText("");
        	a2_S.setText("");
        	//COASTER      ""
        	ad35_C.setText("");
        	ad36_O.setText("");
        	a3_A.setText("");
        	a3_T.setText("");
        	a3_E.setText("");
        	ad38_R.setText("");
        	//BEEF
        	a4_B.setText("");
        	a4_E.setText("");
        	ad45_E.setText("");
        	ad46_F.setText("");
        	//ACE
        	d5_A.setText("");
        	//FARM
        	d8_F.setText("");
        	d8_A.setText("");
        	d8_M.setText("");
        	shown = false;
    	}
    }
    //aNumHint() fills the number and hint for the across labels
    void num_Hint() {
    	Crossword cw = new Crossword();
    	cw.loadData("data//across.csv", "data//down.csv");
    	//the across number and hints
    	aQ1.setText(cw.across.get(0).getPuzzleNum() + ". " + cw.across.get(0).getHint());
    	aQ2.setText(cw.across.get(1).getPuzzleNum() + ". " + cw.across.get(1).getHint());
    	aQ3.setText(cw.across.get(2).getPuzzleNum() + ". " + cw.across.get(1).getHint());
    	aQ4.setText(cw.across.get(3).getPuzzleNum() + ". " + cw.across.get(3).getHint());
    	//the down number and hints
    	dQ1.setText(cw.down.get(0).getPuzzleNum() + ". " + cw.down.get(0).getHint());
    	dQ2.setText(cw.down.get(1).getPuzzleNum() + ". " + cw.down.get(1).getHint());
    	dQ3.setText(cw.down.get(2).getPuzzleNum() + ". " + cw.down.get(2).getHint());
    	dQ4.setText(cw.down.get(3).getPuzzleNum() + ". " + cw.down.get(3).getHint());
    	dQ5.setText(cw.down.get(4).getPuzzleNum() + ". " + cw.down.get(4).getHint());
    }
    
    //handleCheckAnswers which checks the answers to see if the 
    @FXML
    private void handleCheckAnswers(ActionEvent event) {
    	if(!checked) {
    		//T for TEXAS/TX
    		String wrong = "-fx-text-fill: red; -fx-font-size: 20px;";
    		String right = "-fx-text-fill: green; -fx-font-size: 20px;";
    		//T FOR TEXAS AND TX
    		if(!(ad1_T.getText().equalsIgnoreCase("T"))) {ad1_T.setStyle(wrong);}
    		else {ad1_T.setStyle(right);}
    		//X for TX
    		if(!(d1_X.getText().equalsIgnoreCase("X"))) {d1_X.setStyle(wrong);}
    		else {d1_X.setStyle(right);}
    		//E for TEXAS
    		if(!(a1_E.getText().equalsIgnoreCase("E"))) {a1_E.setStyle(wrong);}
    		else {a1_E.setStyle(right);}
    		//X for TEXAS
    		if(!(a1_X.getText().equalsIgnoreCase("X"))) {a1_X.setStyle(wrong);}
    		else {a1_X.setStyle(right);}
    		//A for TEXAS
    		if(!(a1_A.getText().equalsIgnoreCase("A"))) {a1_A.setStyle(wrong);}
    		else {a1_A.setStyle(right);}
    		//S for TEXAS/STAR
    		if(!(ad17_S.getText().equalsIgnoreCase("S"))) {ad17_S.setStyle(wrong);}
    		else {ad17_S.setStyle(right);}
    		//T for STAR
    		if(!d7_T.getText().equalsIgnoreCase("T")) {d7_T.setStyle(wrong);}
    		else {d7_T.setStyle(right);}
    		//A for STAR AND GAS
    		if(!ad27_A.getText().equalsIgnoreCase("A")) {ad27_A.setStyle(wrong);}
    		else ad27_A.setStyle(right);
    		//R for STAR
    		if(!d7_R.getText().equalsIgnoreCase("R")) {d7_R.setStyle(wrong);}
    		else d7_R.setStyle(right);
    		//S for STAR AND COASTER
    		if(!ad37_S.getText().equalsIgnoreCase("S")) {ad37_S.setStyle(wrong);}
    		else ad37_S.setStyle(right);
    		//C for COASTER AND ACE
    		if(!ad35_C.getText().equalsIgnoreCase("C")) {ad35_C.setStyle(wrong);}
    		else ad35_C.setStyle(right);
    		//O for COASTER AND OF
    		if(!ad36_O.getText().equalsIgnoreCase("O")) {ad36_O.setStyle(wrong);}
    		else ad36_O.setStyle(right);
    		//A FOR COASTER 
    		if(!a3_A.getText().equalsIgnoreCase("A")) {a3_A.setStyle(wrong);}
    		else a3_A.setStyle(right);
    		//T FOR COATSER
    		if(!a3_T.getText().equalsIgnoreCase("T")) {a3_T.setStyle(wrong);}
    		else a3_T.setStyle(right);
    		//E FOR COASTER
    		if(!a3_E.getText().equalsIgnoreCase("E")) {a3_E.setStyle(wrong);}
    		else a3_E.setStyle(right);
    		//R FOR COASTER AND FARM
    		if(!ad38_R.getText().equalsIgnoreCase("R")) {ad38_R.setStyle(wrong);}
    		else ad38_R.setStyle(right);
    		//B FOR BEEF
    		if(!a4_B.getText().equalsIgnoreCase("B")) {a4_B.setStyle(wrong);}
    		else a4_B.setStyle(right);
    		//E FOR BEEF
    		if(!a4_E.getText().equalsIgnoreCase("E")) {a4_E.setStyle(wrong);}
    		else a4_E.setStyle(right);
    		//E FOR BEEF AND ACE
    		if(!ad45_E.getText().equalsIgnoreCase("E")) {ad45_E.setStyle(wrong);}
    		else ad45_E.setStyle(right);
    		//F FOR BEEF AND OF
    		if(!ad46_F.getText().equalsIgnoreCase("F")) {ad46_F.setStyle(wrong);}
    		else ad46_F.setStyle(right);
    		//G FOR GAS
    		if(!a2_G.getText().equalsIgnoreCase("G")) {a2_G.setStyle(wrong);}
    		else a2_G.setStyle(right);
    		//S FOR GAS
    		if(!a2_S.getText().equalsIgnoreCase("S")) {a2_S.setStyle(wrong);}
    		else a2_S.setStyle(right);
    		//A FOR ACE
    		if(!d5_A.getText().equalsIgnoreCase("A")) {d5_A.setStyle(wrong);}
    		else d5_A.setStyle(right);
    		//F FOR FARM
    		if(!d8_F.getText().equalsIgnoreCase("F")) {d8_F.setStyle(wrong);}
    		else d8_F.setStyle(right);
    		//A FOR FARM
    		if(!d8_A.getText().equalsIgnoreCase("A")) {d8_A.setStyle(wrong);}
    		else d8_A.setStyle(right);
    		//M FOR FARM
    		if(!d8_M.getText().equalsIgnoreCase("M")) {d8_M.setStyle(wrong);}
    		else d8_M.setStyle(right);
    		
    		checked = true;
    	}
    	else {
    		checked = false;
    	}
    }
    
}
