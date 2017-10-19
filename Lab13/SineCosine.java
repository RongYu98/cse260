import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

public class SineCosine extends Application {
	@Override 
	public void start(Stage primaryStage) {
		
		Pane pane = new Pane(); //  pane is the parent
		Scene scene = new Scene(pane, 500, 500);

		Polyline polyline = new Polyline();
		Polyline polyline2 = new Polyline();
		
		ObservableList<Double> list = polyline.getPoints();
		ObservableList<Double> list2 = polyline2.getPoints();
		polyline.setStroke(Color.RED);
		polyline2.setStroke(Color.BLUE);
		
		for (int x = -100; x <= 100; x++) {
			list.add(x + 200.0);
			list.add( 100 - 50 * Math.sin((x / 100.0) * 2 * Math.PI));
		}
		for (int x = -100; x <= 100; x++) {
			list2.add(x + 200.0);
			list2.add( 100 - 50 * Math.cos((x / 100.0) * 2 * Math.PI));
		}
		
		pane.getChildren().add( polyline);
		pane.getChildren().add( polyline2);

		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(	args);
		}
}

