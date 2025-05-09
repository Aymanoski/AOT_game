package game.gui;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;	

public class Main extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		Parent root=FXMLLoader.load(getClass().getResource("Main.fxml"));
		Parent root2=FXMLLoader.load(getClass().getResource("Main2.fxml"));
		Parent root3=FXMLLoader.load(getClass().getResource("main3.fxml"));
		Parent root4=FXMLLoader.load(getClass().getResource("main4.fxml"));
		Scene scene= new Scene(root);
		Scene scene2=new Scene(root2);
		Scene scene3= new Scene(root3);
		Scene scene4= new Scene(root4);
		stage.setScene(scene);
		stage.show();
		scene.setOnKeyPressed(event ->{
			if(event.getCode()==KeyCode.SPACE) {
				stage.setScene(scene3);
				
			}
			
		});
		
		
		
		
		
	}
	public static void main(String [] args) {
		launch(args);
	}

}
