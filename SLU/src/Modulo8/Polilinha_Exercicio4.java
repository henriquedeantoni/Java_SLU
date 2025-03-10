package Modulo8;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

public class Polilinha_Exercicio4 extends Application{
	private static final int MAX_POINTS = 40;

    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane(); 
        
        Polyline polyline = new Polyline();
        polyline.setStroke(Color.BLUE);
        polyline.setStrokeWidth(2);
        
        Circle cursorCircle = new Circle(5, Color.RED);
        
        root.getChildren().addAll(polyline, cursorCircle);

        root.setOnMouseMoved(event -> {
            double x = event.getX();
            double y = event.getY();
            
            cursorCircle.setCenterX(x);
            cursorCircle.setCenterY(y);
            
            polyline.getPoints().addAll(x, y);

            if (polyline.getPoints().size() > MAX_POINTS * 2) {
                polyline.getPoints().remove(0, 2);
            }
        });

        Scene scene = new Scene(root, 600, 400);
        primaryStage.setTitle("Polilinha Seguinte");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
