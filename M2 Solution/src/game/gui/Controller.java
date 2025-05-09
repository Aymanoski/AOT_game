package game.gui;

import java.io.IOException;

import game.engine.Battle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class Controller {
	
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	Battle b;
	
	
public void switchtoME(ActionEvent e) throws IOException {

	FXMLLoader loader = new FXMLLoader(getClass().getResource("main4.fxml"));
	root=loader.load();
	b= new Battle(1,0,53,3,250);
	GamesceneEController controller= loader.getController();
	stage=(Stage)(((Node)e.getSource()).getScene().getWindow());
	scene=new Scene(root);
	controller.initalize(b,scene);
	stage.setScene(scene);
	stage.show();	
}
public void switchtoMH(ActionEvent e) throws IOException {

   FXMLLoader loader= new FXMLLoader(getClass().getResource("main5.fxml"));
	root=loader.load();
	b= new Battle(1,0,100,5,125);
	GamesceneHController controller= loader.getController();
    stage=(Stage)(((Node)e.getSource()).getScene().getWindow());
	scene=new Scene(root);
	controller.initalize(b,scene);
	stage.setScene(scene);
	stage.show();		
}



 
public void switchtoG(ActionEvent e) throws IOException {
	root = FXMLLoader.load(getClass().getResource("main2.fxml"));
	stage=(Stage)(((Node)e.getSource()).getScene().getWindow());
	scene= new Scene(root);
	stage.setScene(scene);
	stage.show();
	
}
  
 
  
  
 
}
