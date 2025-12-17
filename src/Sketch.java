import processing.core.PApplet;

/**
 * Template for programs with Processing graphics output.
 * @author Your Name
 */
public class Sketch extends PApplet {
    int overallTime;

    public static void main(String[] args) {
        PApplet.main("Sketch");
    }

    @Override
    public void settings() {
        size(600, 400); 
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
        overallTime = millis();

        System.out.println(overallTime);

    }

    /** Additional helper methods below */

}
