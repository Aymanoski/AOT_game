package game.gui;

import java.io.IOException;
import java.util.Optional;

import game.engine.Battle;
import game.engine.exceptions.InsufficientResourcesException;
import game.engine.exceptions.InvalidLaneException;
import game.engine.lanes.Lane;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GamesceneHController {
	
	@FXML
    private Button PC;
    @FXML
    private Button VS;
    @FXML
    private Button SC;
    @FXML
    private Button WT;
    @FXML
    private Text PCX;
    @FXML
    private Text SCX;
    @FXML
    private Text VSX;
    @FXML
    private Text WTX;
    @FXML
    private Text PCX1;
    @FXML
    private Text SCX1;
    @FXML
    private Text VSX1;
    @FXML
    private Text WTX1;
    @FXML
    private Text PCX2;
    @FXML
    private Text SCX2;
    @FXML
    private Text VSX2;
    @FXML
    private Text WTX2;
    
    @FXML
    private Text CS ;
    @FXML
    private Text CT;
    @FXML
    private Text CP;
    @FXML
    private Text CR;
    @FXML
    private Text CH;
    @FXML
    private Text DL;
    @FXML
    private Text CH1;
    @FXML
    private Text DL1;
    @FXML
    private Text CH2;
    @FXML
    private Text DL2;
    @FXML
    private HBox L;
    @FXML
    private HBox L1;
    @FXML
    private HBox L2;
    @FXML
    private Button PT;
    
    
    
    
    
    private int PCC;
    private int VSC;
    private int SCC;
    private int WTC;
    private int PCC1;
    private int VSC1;
    private int SCC1;
    private int WTC1;
    private int PCC2;
    private int VSC2;
    private int SCC2;
    private int WTC2;
    
    private Stage stage;
	private Scene scene;
	private Parent root;
	Battle b;

   
    public void initalize(Battle n,Scene s) {
    	b=n;

    	

    }
   
	public void buyPC(ActionEvent ee) {
		TextInputDialog n= new TextInputDialog("");
		n.setTitle("lane selector");
		n.setHeaderText("lane selector");
		n.setContentText("select a lane to put the weapon in(1 or 2 or 3)");
		Optional<String> result = n.showAndWait();
		int s=Integer.parseInt(result.get());
		if((Integer.parseInt(result.get())-1)<0 || (Integer.parseInt(result.get())-1)>3){
			showAlert("invalid lane number");
		}
		Lane l= b.getOriginalLanes().get(Integer.parseInt(result.get())-1);
	    try {
			b.purchaseWeapon(1, l);
			
			if (s==1) {
				PCC++;
			PCX.setText("X"+PCC);}
			else if(s==2) {
			PCC1++;
				PCX1.setText("X"+PCC1);}
			else if(s==3) {
				PCC2++;
				PCX2.setText("X"+PCC2);}
			
			
		} catch (InsufficientResourcesException e) {
			showAlert(e.getMessage());
		} catch (InvalidLaneException e) {
			showAlert(e.getMessage());
		} CR.setText("current resources="+b.getResourcesGathered());}
	    public void buyVS(ActionEvent ee) {
			TextInputDialog n= new TextInputDialog("");
			n.setTitle("lane selector");
			n.setHeaderText("lane selector");
			n.setContentText("select a lane to put the weapon in(1 or 2 or 3)");
			Optional<String> result = n.showAndWait();
			int s=Integer.parseInt(result.get());
			if((Integer.parseInt(result.get())-1)<0 || (Integer.parseInt(result.get())-1)>3){
				showAlert("invalid lane number");
			}
			Lane l= b.getOriginalLanes().get(Integer.parseInt(result.get())-1)
					;
		    try {
				b.purchaseWeapon(3, l);
				
				if (s==1) {
					VSC++;
				VSX.setText("X"+VSC);}
				else if(s==2) {
				VSC1++;
					VSX1.setText("X"+VSC1);}
				else if(s==3) {
					VSC2++;
					VSX2.setText("X"+VSC2);}
				
				
			} catch (InsufficientResourcesException e) {
				showAlert(e.getMessage());
			} catch (InvalidLaneException e) {
				showAlert(e.getMessage());
			}CR.setText("current resources="+b.getResourcesGathered());
	    }
		    public void buySC(ActionEvent ee) {
				TextInputDialog n= new TextInputDialog("");
				n.setTitle("lane selector");
				n.setHeaderText("lane selector");
				n.setContentText("select a lane to put the weapon in(1 or 2 or 3)");
				Optional<String> result = n.showAndWait();
				int s=Integer.parseInt(result.get());
				if((Integer.parseInt(result.get())-1)<0 || (Integer.parseInt(result.get())-1)>3){
					showAlert("invalid lane number");
				}
				Lane l= b.getOriginalLanes().get(Integer.parseInt(result.get())-1);
			    try {
					b.purchaseWeapon(2, l);
					
					if (s==1) {
						SCC++;
					SCX.setText("X"+SCC);}
					else if(s==2) {
					SCC1++;
						SCX1.setText("X"+SCC1);}
					else if(s==3) {
						SCC2++;
						SCX2.setText("X"+SCC2);}
					
					
				} catch (InsufficientResourcesException e) {
					showAlert(e.getMessage());
				} catch (InvalidLaneException e) {
					showAlert(e.getMessage());
				}CR.setText("current resources="+b.getResourcesGathered());
		    }
			    public void buyWT(ActionEvent ee) {
					TextInputDialog n= new TextInputDialog("");
					n.setTitle("lane selector");
					n.setHeaderText("lane selector");
					n.setContentText("select a lane to put the weapon in(1 or 2 or 3)");
					Optional<String> result = n.showAndWait();
					int s=Integer.parseInt(result.get());
					if((Integer.parseInt(result.get())-1)<0 || (Integer.parseInt(result.get())-1)>3){
						showAlert("invalid lane number");
					}
					Lane l= b.getOriginalLanes().get(Integer.parseInt(result.get())-1);
				    try {
						b.purchaseWeapon(4, l);
						
						if (s==1) {
							WTC++;
						WTX.setText("X"+WTC);}
						else if(s==2) {
						WTC1++;
							WTX1.setText("X"+WTC1);}
						else if(s==3) {
							WTC2++;
							WTX2.setText("X"+WTC2);}
						
						
					} catch (InsufficientResourcesException e) {
						showAlert(e.getMessage());
					} catch (InvalidLaneException e) {
						showAlert(e.getMessage());
					}
				    CR.setText("current resources="+b.getResourcesGathered());
				
		
     
		
		
	}
			    public void Return(ActionEvent e) throws IOException {
			    	root = FXMLLoader.load(getClass().getResource("Main.fxml"));
			    	stage=(Stage)(((Node)e.getSource()).getScene().getWindow());
			    	scene= new Scene(root);
			    	stage.setScene(scene);
			    	stage.show();
			    	scene.setOnKeyPressed(event ->{
						if(event.getCode()==KeyCode.SPACE) {
							try {
								root = FXMLLoader.load(getClass().getResource("main3.fxml"));
							} catch (IOException e1) {
								
								e1.printStackTrace();
							}
							scene= new Scene(root);
							stage.setScene(scene);
							
						}
						
					});
			    }
			    public void passT() {
			    	b.passTurn();
			    	if (b.getOriginalLanes().get(0).getLaneWall().getCurrentHealth()<=0) {
			    		L.setVisible(false);
			    	}
			    	if (b.getOriginalLanes().get(1).getLaneWall().getCurrentHealth()<=0) {
			    		L1.setVisible(false);
			    	}
			    	if (b.getOriginalLanes().get(2).getLaneWall().getCurrentHealth()<=0) {
			    		L2.setVisible(false);
			    	}
			    	CS.setText("Current Health="+b.getScore());
			    	CT.setText("current Turn="+b.getNumberOfTurns());
			    	CP.setText("current turn="+b.getBattlePhase());
			    	CR.setText("current resources="+b.getResourcesGathered());
			    	CH.setText("health="+b.getOriginalLanes().get(0).getLaneWall().getCurrentHealth());
			    	CH1.setText("health="+b.getOriginalLanes().get(1).getLaneWall().getCurrentHealth());
			    	CH2.setText("health="+b.getOriginalLanes().get(2).getLaneWall().getCurrentHealth());
			    	DL.setText("danger level:"+b.getOriginalLanes().get(0).getDangerLevel());
			    	DL1.setText("danger level:"+b.getOriginalLanes().get(1).getDangerLevel());
			    	DL2.setText("danger level:"+b.getOriginalLanes().get(2).getDangerLevel());
			    	addtitan(L);
			       
			    	
			    	
			    }
	public void showAlert(String m) {
		Alert a= new Alert(AlertType.ERROR);
		a.setTitle("Error");
		a.setContentText(m);
		a.showAndWait();
	}
	public void addtitan(HBox l) {
		AnchorPane titan = new AnchorPane();
		ImageView t= new ImageView("file:path/E:/M2 Solution/src/game/gui/colossal.JPG");
		Text H= new Text("Health="+b.getApproachingTitans().get(0).getCurrentHealth());
	    t.setFitWidth(100);
        t.setFitHeight(100);

        // Set the positions using AnchorPane's static methods
        AnchorPane.setTopAnchor(t, 50.0);
        AnchorPane.setLeftAnchor(t, 50.0);

        AnchorPane.setTopAnchor(H, 110.0); // Positioning healthText below the image
        AnchorPane.setLeftAnchor(H, 0.0);

        // Add the Text and ImageView to the AnchorPane
        titan.getChildren().addAll(t, H);
        titan.setPrefSize(50, 50);
        
        l.getChildren().add(titan);
        
	}
 
}

