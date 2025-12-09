/* 

 * Class: CMSC201  

 * Instructor: Grigoriy Grinberg

 * Description: a class that draws the car at given coordinates.

 * Due: 12/08/2025 (<04/29/2024>) 

 * I pledge that I have completed the programming assignment independently. 

   I have not copied the code from a student or any source. 

   I have not given my code to any student. 

   Print your Name here: Alex Nizeyimana 

*/ 

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;

public class RaceCar {
    private double x, y;
    private Group carShape;

    public RaceCar(double x, double y) {
        this.x = x;
        this.y = y;
        carShape = new Group();
        drawCar();
    }

    private void drawCar() {
        carShape.getChildren().clear();

        // Car body
        Rectangle body = new Rectangle(x, y - 20, 50, 10);
        body.setFill(Color.BLUE);

        // Car roof
        Polygon roof = new Polygon(
            x + 10, y - 20,
            x + 20, y - 30,
            x + 30, y - 30,
            x + 40, y - 20
        );
        roof.setFill(Color.BLUE);

        // Wheels
        Circle wheel1 = new Circle(x + 15, y - 5, 5);
        wheel1.setFill(Color.BLACK);
        Circle wheel2 = new Circle(x + 35, y - 5, 5);
        wheel2.setFill(Color.BLACK);

        carShape.getChildren().addAll(body, roof, wheel1, wheel2);
    }

    public void move(double dx, double paneWidth) {
        x += dx;
        if (x > paneWidth) {
            x = 0; // reset to left
        }
        drawCar();
    }

    public Group getCarShape() {
        return carShape;
    }
}
