import processing.core.PApplet;
import processing.core.PVector;

import java.util.Random;

/*
    Damit HotSwap funktioniert, muss im Debug-Modus gestartet werden:
     - F9 (beim ersten Mal) bzw. Shift-F9 (selbe main wie beim letzten Mal)
     - Strg-Shift-F9 nach jeder Änderung: kompiliert mit HotSwap


     - Keymap geändert: Strg-S speichert
     - Plugin "Save Actions" installiert
     - das Plugin so eingestellt, dass bei Save die aktuelle Datei neu kompiliert wird



 */

public class Main extends PApplet {
    PVector lineStart = new PVector(55, 73);
    Random rnd = new Random();

    public static void main(String[] args) {
        PApplet.main("Main");    // Namen der Startklasse als Argument übergeben
    }

    public void settings() {
        size(600, 600);
    }

    public void setup() {
        stroke(0);
        background(255);
    }

    @Override
    public void draw() {
        line(lineStart.x, lineStart.y, mouseX, mouseY);
    }

    @Override
    public void mouseClicked() {
        stroke(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        lineStart.set(mouseX, mouseY);
    }
}
