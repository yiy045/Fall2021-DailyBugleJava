//what package this class in
package application.controller;

//import lines
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
/*Main Controller - Yash Kapoor
 * Will house the buttons and AnchorPane for the main page
 */

public class MainController {
	@FXML
    private AnchorPane mainPage; //home page

    @FXML
    private Button buttonForClassPage; //button for classifieds page

    @FXML
    private Button buttonForCWPage; //button for crosswords page

    //handle method for changing to the Classifieds scene
    @FXML
    void handleClassSceneAction(ActionEvent event) throws IOException {
    	//gets the URL for Classifieds.fxml
    	URL url = new File("src/Classifieds.fxml").toURI().toURL(); 
    	mainPage = FXMLLoader.load(url);
    	Scene classScene = new Scene(mainPage);
    	Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
        window.setScene(classScene);
        window.show();
      
    }

    @FXML
    void handleCrossWordAction(ActionEvent event) throws IOException {
    	//gets the URL for Crossword.fxml
    	URL url = new File("src/Crossword.fxml").toURI().toURL();
    	mainPage = FXMLLoader.load(url);
    	Scene cwScene = new Scene(mainPage);
    	Stage w = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
        w.setScene(cwScene);
        w.show();
    }

}
