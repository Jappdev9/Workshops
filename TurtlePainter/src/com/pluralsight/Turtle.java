package com.pluralsight;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Turtle {
    class Turtle extends JPanel {

        private Shape shape;


        public Turtle(Shape shape) {

            this.shape = shape;

        }


        @Override

        protected void paintComponent(Graphics g) {

            super.paintComponent(g);

            shape.paint(g);

        }

    }


    public class Main {

        public static void main(String[] args) {

// Example usage

            Point location = new Point(100, 100);

            Color color = Color.RED;

            int border = 2;


// Creating shapes

            Square square = new Square(location, color, border, 50);

            Triangle triangle = new Triangle(location, color, border, 50, 50);

            Circle circle = new Circle(location, color, border, 50);

            Hexagon hexagon = new Hexagon(location, color, border, 50);


// Creating Turtle objects

            Turtle turtle1 = new Turtle(square);

            Turtle turtle2 = new Turtle(triangle);

            Turtle turtle3 = new Turtle(circle);

            Turtle turtle4 = new Turtle(hexagon);



// frame.add(turtle1);

// frame.add(turtle2);

// frame.add(turtle3);

// frame.add(turtle4);

        }

    }

}


