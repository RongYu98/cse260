import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
//import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.scene.shape.Polyline;

public class JavaFX_Test extends Application {
	
	// 1.  (Two circles and their distance) draws two filled circles with radius 15 pixels, centered at random locations, with a line connecting the two circles. The distance between the two centers is displayed on the line.1.
	@Override 
	public void start(Stage primaryStage) {
		// 1.  (Two circles and their distance) 
		// Write a program that draws two filled circles with radius 15 
		// pixels, centered at random locations, with a line connecting the 
		//two circles. The distance between the two centers is displayed on the line.1.

		Pane pane = new Pane(); //  pane is the parent
		Scene scene = new Scene(pane, 500, 500);
		
		double x1 = pane.widthProperty().multiply(Math.random()).getValue();
		double y1 = pane.heightProperty().multiply(Math.random()).getValue();
		double x2 = pane.widthProperty().multiply(Math.random()).getValue();
		double y2 = pane.heightProperty().multiply(Math.random()).getValue();;
		
		Circle c1 = new Circle(x1, y1, 15);
		Circle c2 = new Circle(x2, y2, 15);
		
		Line line = new Line( x1, y1, x2, y2);
		double distance = ( Math.sqrt(x1*x1+x2*x2) );

		Text text = new Text( (x1+x2)/2, (y1+y2)/2, String.valueOf(distance));
		
		pane.getChildren().add(c1);
		pane.getChildren().add(c2);
		pane.getChildren().add(line);
		pane.getChildren().add(text);
		
	
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	/**
	* The main method is only needed for the IDE with limited
	* JavaFX support. Not needed for running from the command line.
	*/
	public static void main(String[] args) {
	launch(	args);
	}
}
