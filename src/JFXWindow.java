import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class JFXWindow extends Application{

	public void start(Stage primaryStage){	
		HBox hBox = new HBox();
		
		Button btn = new Button();
		btn.setText("Say, Hello World");
		btn.setOnAction(new HelloWorldHandler());
		
		hBox.getChildren().add(btn);
		
		BorderPane pane = new BorderPane();
		pane.setCenter(hBox);
		
		Scene scene = new Scene(pane, 500, 500);
		
		primaryStage.setTitle("Hello World");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

class HelloWorldHandler implements EventHandler<ActionEvent>{
	public void handle(ActionEvent event) {
		System.out.println("Cunt");
	}
}