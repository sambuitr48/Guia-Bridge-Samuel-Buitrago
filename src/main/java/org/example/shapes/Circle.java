package org.example.shapes;

import org.example.colors.Color;  // Importación correcta

// Refinamiento de la abstracción: Circle
public class Circle extends Shape {
    /**
     * Constructor que recibe un color y lo asigna a la figura.
     *
     * @param color Implementación concreta de Color.
     */
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.print("Dibujando un círculo. ");
        color.applyColor();  // Aplica el color específico.
    }
}
