package game.gui;

import game.engine.Battle;
import game.engine.titans.AbnormalTitan;
import game.engine.titans.ArmoredTitan;
import game.engine.titans.ColossalTitan;
import game.engine.titans.PureTitan;
import game.engine.titans.Titan;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class TitanView extends VBox {
	
	private Titan titan;
	private String text;
		
	private static double WIDTH=60;
	private double HEIGHT;

	
	private ProgressBar healthBar;
	
	public TitanView(Titan myTitan) {
		this.titan=myTitan;
		ImageView imgv = new ImageView();
		healthBar=new ProgressBar(titan.getCurrentHealth());
		healthBar.setPrefWidth(WIDTH);
		healthBar.getStyleClass().add("green");
		
		if(titan instanceof ColossalTitan) {
			Image img=new Image("ColossalTitan.jpg");
			imgv=new ImageView(img);
			HEIGHT=titan.getHeightInMeters();
			imgv.setFitHeight(HEIGHT);
			text="ColossalTitan";
		}else if(titan instanceof PureTitan) {
			Image img=new Image("PureTitan.jpg");
			imgv=new ImageView(img);
			HEIGHT=titan.getHeightInMeters();
			imgv.setFitHeight(HEIGHT*3);
			text="PureTitan";	
		}else if(titan instanceof AbnormalTitan) {
			Image img=new Image("AbnormalTitan.png");
			imgv=new ImageView(img);
			HEIGHT=titan.getHeightInMeters();
			imgv.setFitHeight(HEIGHT*3);
			text="AbnormalTitan";
		}else if(titan instanceof ArmoredTitan) {
			Image img=new Image("ArmoredTitan.jpg");
			imgv=new ImageView(img);
			HEIGHT=titan.getHeightInMeters();
			imgv.setFitHeight(HEIGHT*3);
			text="ArmoredTitan";
		}
		healthBar=new ProgressBar(updateHealth());
		healthBar.setPrefWidth(WIDTH);
		healthBar.getStyleClass().add("green");
		
		imgv.setFitWidth(WIDTH);
		imgv.setPreserveRatio(true);
		Text name=new Text(text);
		this.getChildren().addAll(name, healthBar, imgv);
		this.setAlignment(javafx.geometry.Pos.CENTER);
		
	
		
	}
	public double updateHealth() {
		healthBar.setProgress(titan.getCurrentHealth());
		
			return titan.getCurrentHealth();
		}
		
	}


























