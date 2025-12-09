/* 

 * Class: CMSC201  

 * Instructor: Grigoriy Grinberg

 * Description: the main application class that launches the JavaFX stage.

 * Due: 12/08/2025 (<04/29/2024>) 

 * I pledge that I have completed the programming assignment independently. 

   I have not copied the code from a student or any source. 

   I have not given my code to any student. 

   Print your Name here: Alex Nizeyimana 

*/ 
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

public class CarApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        CarPane carPane = new CarPane();

        Scene scene = new Scene(carPane, 600, 200);
        primaryStage.setTitle("Racing Car Simulation");
        primaryStage.setScene(scene);
        primaryStage.show();

        // Key events for speed control
        primaryStage.show();
        scene.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.UP) {
                carPane.increaseSpeed();
            } else if (e.getCode() == KeyCode.DOWN) {
                carPane.decreaseSpeed();
            }
        });

        // Request focus so key events work
        carPane.requestFocus();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
