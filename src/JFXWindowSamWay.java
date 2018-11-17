import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class JFXWindowSamWay extends Application{

	public void start(Stage primaryStage){
		//creates hbox
		HBox hBox = new HBox();
		
		//Create Start Game Button
		Button btnStartGame = new Button();
		
		//controls Start Game Button
		btnStartGame.setText("Start Game");
		btnStartGame.setOnAction(new HelloWorldHandler());
		
		//adds Start Game button to hBox
		hBox.getChildren().add(btnStartGame);
		
		//Create Exit button
		Button btnExit = new Button();
		
		//controls Exit Button
		btnExit.setText("Exit");
		btnExit.setOnAction(new ExitHandler());
		
		//adds Exit button to hBox
		hBox.getChildren().add(btnExit);
		
		//create borderpane
		BorderPane pane = new BorderPane();
		pane.setCenter(hBox);
		
		//set size of scene
		Scene scene = new Scene(pane, 500, 500);
		
		//set scene
		primaryStage.setTitle("Game Start Menu");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	//launches window
	public static void main(String[] args) {
		launch(args);
	}
}

//class that controls Game Start Button
class HelloWorldHandler implements EventHandler<ActionEvent>{
	public void handle(ActionEvent event) {
		
	}
}

//class that controls Exit Button
class ExitHandler implements EventHandler<ActionEvent>{
	public void handle(ActionEvent event) {
		//rimaryStage.close();
	}
}