package application;
	
import java.io.File;
import java.net.URL;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;
/*Main.java - Yash Kapoor
 * Is the Main class for the Project
 */

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//gets the path for Main.fxml
			URL url = new File("src/Main.fxml").toURI().toURL();
			AnchorPane root = FXMLLoader.load(url);
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setTitle("Daily Bugle ");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
