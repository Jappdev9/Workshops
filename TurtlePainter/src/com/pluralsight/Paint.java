package com.pluralsight;
import java.awt.Graphics;
public class Paint {

        public static void drawRect(Graphics g, int x, int y, int width, int height) {

            g.drawRect(x, y, width, height);

        }


        public static void drawFilledRect(Graphics g, int x, int y, int width, int height) {

            g.fillRect(x, y, width, height);

        }


        public static void drawOval(Graphics g, int x, int y, int width, int height) {

            g.drawOval(x, y, width, height);

        }


        public static void drawFilledOval(Graphics g, int x, int y, int width, int height) {

            g.fillOval(x, y, width, height);

        }


        public static void drawPolygon(Graphics g, int[] xPoints, int[] yPoints, int nPoints) {

            g.drawPolygon(xPoints, yPoints, nPoints);

        }


        public static void drawFilledPolygon(Graphics g, int[] xPoints, int[] yPoints, int nPoints) {

            g.fillPolygon(xPoints, yPoints, nPoints);

        }


        public static void drawLine(Graphics g, int x1, int y1, int x2, int y2) {

            g.drawLine(x1, y1, x2, y2);

        }


    }
}
