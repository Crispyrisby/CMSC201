/* 

 * Class: CMSC201  

 * Instructor: Grigoriy Grinberg

 * Description:a custom pane that manages the car’s movement, animation, and user interactions.

 * Due: 12/08/2025 (<04/29/2024>) 

 * I pledge that I have completed the programming assignment independently. 

   I have not copied the code from a student or any source. 

   I have not given my code to any student. 

   Print your Name here: Alex Nizeyimana 

*/

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.util.Duration;

public class CarPane extends BorderPane {
    private RaceCar car = new RaceCar(0, 100);
    private Pane pane = new Pane();
    private Timeline animation;
    private double speed = 5; // distance per tick

    public CarPane() {
        pane.getChildren().add(car.getCarShape());
        setCenter(pane);

        // Control button
        Button btPauseResume = new Button("Pause/Resume");
        HBox topBox = new HBox(btPauseResume);
        topBox.setAlignment(Pos.CENTER);
        setTop(topBox);

        animation = new Timeline(new KeyFrame(Duration.millis(50), e -> moveCar()));
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();

        // Pause/Resume button
        btPauseResume.setOnAction(e -> {
            if (animation.getStatus() == Timeline.Status.RUNNING) {
                animation.pause();
            } else {
                animation.play();
            }
        });
    }

    private void moveCar() {
        car.move(speed, pane.getWidth());
    }

    // Increase distance per tick
    public void increaseSpeed() {
        speed += 5; // or any increment you like
    }

    // Decrease distance per tick
    public void decreaseSpeed() {
        speed = Math.max(1, speed - 1); // prevent speed from going below 1
    }
}