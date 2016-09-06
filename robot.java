package redesign;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
 
public class robot {
     
    public static void main(String[] args) throws IOException {
         
        try {
             
            Robot robot = new Robot();
            // Creates the delay of 5 sec so that you can open notepad before
            // Robot start writting
            // Robot start writting
            robot.delay(5000);
            robot.keyPress(KeyEvent.VK_DELETE);
           
              } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}