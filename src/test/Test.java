package test;

import processing.core.PApplet;

public class Test extends PApplet {

    public static void main(String[] args) {
        PApplet.main(Test.class, args);
    }

    public void settings() {
        size(600, 600, P2D);
    }

    public void setup() {
 
    }

    public void draw() {
        background(255);
        fill(0);
        text(""+frameRate, width/2, height/2);
    }

}