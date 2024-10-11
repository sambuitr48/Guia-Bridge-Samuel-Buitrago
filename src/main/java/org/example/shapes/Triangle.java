package org.example.shapes;

import org.example.colors.Color;  // Esta es la interfaz que has creado


// Refinamiento de la abstracción: Triangle (nuevo)
public class Triangle extends Shape {
    /**
     * Constructor que recibe un color y lo asigna a la figura.
     *
     * @param color Implementación concreta de Color.
     */
    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.print("Dibujando un triángulo. ");
        color.applyColor();  // Aplica el color específico.
    }
}