package org.example.shapes;

import org.example.colors.Color;  // Esta es la interfaz que has creado


// Refinamiento de la abstracción: Square
public class Square extends Shape {
    /**
     * Constructor que recibe un color y lo asigna a la figura.
     *
     * @param color Implementación concreta de Color.
     */
    public Square(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.print("Dibujando un cuadrado. ");
        color.applyColor();  // Aplica el color específico.
    }
}
