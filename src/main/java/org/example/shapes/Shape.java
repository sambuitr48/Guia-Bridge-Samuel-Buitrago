package org.example.shapes;

import org.example.colors.Color;  // Importación correcta

// Implementación de la abstracción Shape
public abstract class Shape {
    protected Color color;

    /**
     * Constructor que recibe un color.
     * La abstracción utiliza el color para aplicar el color a la forma.
     *
     * @param color Implementación concreta de la interfaz Color.
     */
    protected Shape(Color color) {
        this.color = color;
    }

    /**
     * Método abstracto que dibuja la figura.
     * Cada figura debe implementar su versión específica de cómo se dibuja.
     */
   public abstract void draw();
}
