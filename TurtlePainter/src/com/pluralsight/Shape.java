package com.pluralsight;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Shape {

    abstract class Shape {

        protected Point location;

        protected Color color;

        protected int border;


        public Shape(Point location, Color color, int border) {

            this.location = location;

            this.color = color;

            this.border = border;

        }


        public abstract void paint(Graphics g);

    }

}
