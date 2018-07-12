

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;

public class JavaFXEventDemo extends Application {
	
	Label response; 
	
	public static void main (String[] args) {
		//Starts the JavaFX application by calling launch()
		launch(args);
	}
	
	//override the start() method
	public void start(Stage myStage) {
		
		myStage.setTitle("JavaFX Buttons and Events.");
		
		FlowPane rootNode = new FlowPane(10,10);
		
		rootNode.setAlignment(Pos.CENTER);
		
		Scene myScene = new Scene(rootNode, 300, 100);
		
		myStage.setScene(myScene);
		
		//Create a label
		response = new Label("Push a button");
		
		//Create two push buttons
		Button btnUp = new Button("Up");
		Button btnDown = new Button("Down");
		
		//handle the action events for the Up button
		btnUp.setOnAction(new EventHandler<ActionEvent>() {
			public void handle (ActionEvent ae) {
				response.setText("You pressed Up.");
			}
		});
		
		//handle the action events for the Down button
		btnDown.setOnAction(new EventHandler<ActionEvent>() {
			public void handle (ActionEvent ae) {
				response.setText("You pressed Down.");
			}
		});
		
		//Add the label and buttons to the scene graph.
		rootNode.getChildren().addAll(btnUp, btnDown, response);
		
		myStage.show();
		
	}
}

		
