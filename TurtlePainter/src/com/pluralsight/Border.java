package com.pluralsight;

public class Border {

        private int size;


        public Border(int size) {

            this.size = size;

        }


        public int getSize() {

            return size;

        }


        public void setSize(int size) {

            this.size = size;

        }


        @Override

        public String toString() {

            return "Border Size: " + size;

        }

    }


}
