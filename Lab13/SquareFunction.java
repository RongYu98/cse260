import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
//import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.scene.shape.Polyline;
import javafx.collections.ObservableList;


public class SquareFunction extends Application{

	@Override 
	public void start(Stage primaryStage) {

		Pane pane = new Pane(); //  pane is the parent
		Scene scene = new Scene(pane, 500, 500);

		Polyline polyline = new Polyline();
		ObservableList<Double> list = polyline.getPoints();
		double scaleFactor = 0.0125;
		for (int x = -100; x <= 100; x++) {
			list.add(x + 250.0);
			list.add(500 - scaleFactor * x * x);
			/*
			 * list.add(x + 200.0);
list.add(scaleFactor * x * x);
			 */
		}
		
		pane.getChildren().add( polyline);
		

		primaryStage.setScene(scene);
		primaryStage.show();
	}

	/**
	 * The main method is only needed for the IDE with limited
	 * JavaFX support. Not needed for running from the command line.
	 */ /*
	public static void main(String[] args) {
		launch(	args);
	} */
}
