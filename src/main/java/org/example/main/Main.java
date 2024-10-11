package org.example.main;

import org.example.colors.Blue;
import org.example.colors.Green;
import org.example.colors.Red;
import org.example.colors.Yellow;
import org.example.shapes.Circle;
import org.example.shapes.Square;
import org.example.shapes.Triangle;
import org.example.shapes.Shape;  // Asegúrate de importar Shape

public class Main {
    public static void main(String[] args) {
        // Creación de instancias de figuras con diferentes colores
        Shape redCircle = new Circle(new Red());
        Shape blueSquare = new Square(new Blue());
        Shape greenTriangle = new Triangle(new Green());
        Shape yellowCircle = new Circle(new Yellow());

        // Llamadas al método draw() para ver las figuras con sus colores
        redCircle.draw();    // Salida: Dibujando un círculo. Color rojo aplicado.
        blueSquare.draw();   // Salida: Dibujando un cuadrado. Color azul aplicado.
        greenTriangle.draw(); // Salida: Dibujando un triángulo. Color verde aplicado.
        yellowCircle.draw();  // Salida: Dibujando un círculo. Color amarillo aplicado.
    }
}
