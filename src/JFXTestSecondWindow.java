import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class JFXTestSecondWindow {

	public Scene sceneview() {

		VBox layout1 = new VBox(800);
		Scene scene2 = new Scene(layout1, 800,800);
		return scene2;
	}

}

// public class LayoutOne {
//public VBox sceneView1(Label label, Button button) {
//
//    // Layout 1 - children are laid out in vertical column
//    VBox layout1 = new VBox(20);
//    layout1.getChildren().addAll(label, button);
//
//    return layout1;
//}
