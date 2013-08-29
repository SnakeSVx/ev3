package be.svx.ev3;

import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.Sound;

/**
 * Created with IntelliJ IDEA.
 * User: Stijn
 * Date: 29/08/13
 * Time: 19:53
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorld {

    //run with jrun -cp HelloWorld.jar be.svx.ev3.HelloWorld
    public static void main(String[] args) {
        LCD.clear();
        LCD.drawString("First EV3 Program", 0, 5);
        Sound.beep();
        Button.waitForAnyPress();
        LCD.clear();
        LCD.refresh();

    }

}
