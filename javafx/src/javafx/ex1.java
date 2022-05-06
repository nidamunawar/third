package javafx;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class ex1 extends Application{
public static void main(String[] args) {
		launch();
	}
@Override
	public void start(Stage stage) throws Exception {
		Button b1 = new Button("click on botoom");
		Button b2= new Button("click top");
		Button b3= new Button("cl 3");
		StackPane h = new StackPane();
		h.getChildren().addAll(b1,b2);
		h.getChildren().add(b3);
		Scene sc = new Scene(h);
		stage.setScene(sc);
		stage.setHeight(500);
		stage.setWidth(500);
		stage.setTitle("Nida's App");
		stage.show();
	}

}
