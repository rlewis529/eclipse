
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;

public class JavaFXSkel extends Application {
	public static void main (String[] args) {
		System.out.println("Launching JavaFX application.");
		
		//Start the javaFX application by calling launch().
		launch(args);
	}
	
	public void init() {
		System.out.println("Inside the init() method.");
	}
	
	//Override the start() method.
	public void start(Stage myStage) {
		System.out.println("Inside the start() method.");
		
		//Give the stage a title
		myStage.setTitle("JavaFX woohoo");
		
		//Create a root node.  In this case, a flow layout is used,
		//  but several alternatives exist.
		FlowPane rootNode = new FlowPane();
		
		//Create a scene
		Scene myScene = new Scene(rootNode, 300, 200);
		
		//Set the scene on the stage.
		myStage.setScene(myScene);
		
		//Show the stage and its scene.
		myStage.show();
	}
	
	//override the stop() method
	public void stop() {
		System.out.println("Inside the stop() method.");
	}
}

