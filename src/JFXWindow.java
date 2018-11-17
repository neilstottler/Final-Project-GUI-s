import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text; 
import javafx.stage.Stage; 

public class JFXWindow extends Application {
	
    @Override public void start(Stage primaryStage) {
    	
    	//hBox is created
		HBox hBox = new HBox();
		
		//Create Exit Button
		Button btnExit = new Button();
		btnExit.setText("Exit");
		
		//create action for Exit button
		btnExit.setOnAction(new EventHandler<ActionEvent>() {
		
			//What Button Exit Does
			@Override 
			public void handle(ActionEvent e) {
				primaryStage.close();
			}
		});
		
		//Create Start Game Button
		Button btnStartGame = new Button();
		btnStartGame.setText("Start Game");
		
		//create action for Start Game button
		btnStartGame.setOnAction(new EventHandler<ActionEvent>() {
		
			//What Button Start Game Does
			@Override 
			public void handle(ActionEvent e) {
				
			}
		});
		
		//add button(s) to hBox
		hBox.getChildren().add(btnStartGame);
		hBox.getChildren().add(btnExit);
		
		hBox.setAlignment(Pos.CENTER);
		
		//create BorderPane with hBox
		BorderPane pane = new BorderPane();
		pane.setCenter(hBox);
		
		//make Scene with pane
		Scene scene = new Scene(pane, 500, 500);
		
		//create final stage for scene to be displayed
		primaryStage.setTitle("Game Menu");
		primaryStage.setScene(scene);
        primaryStage.sizeToScene(); 
        primaryStage.show(); 
        
        
}

    public static void main(String[] args) {
        Application.launch(args);
    }
}
