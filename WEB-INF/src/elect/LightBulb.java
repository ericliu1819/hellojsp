package elect;
import java.awt.*;
// A JavaBean must implement java.io.Serializable interface(a tag interface without declaring any method)
// It is to ensure that the internal state of a bean can be stored in an external persistent storage and later restored.
import java.io.Serializable;

public class LightBulb extends Canvas implements Serializable {
   
   public LightBulb() {     // constructor
       setSize(50,50);
       setBackground(Color.GRAY);
   }
   //This bean has two private properties: color (of the type Color) and on (of the type boolean).
   // Each of the private properties has its own public getter and setter, which follow the Javabeans property naming convention. 
   //The builder tool can discover (or introspect) these private properties based on the public getters and setters, based on the property naming convention.

   // Properties:color
   private static final Color COLOR_OFF = Color.BLACK;
   private Color color = Color.ORANGE;        // property with a default value
   public Color getColor() { return color; }  // getter
   public void setColor(Color color) { this.color = color; } // setter

   // Properties:on
   boolean on = false;                        // property with a default value
   public boolean isOn() { return on; }       // getter for boolean
   public void setOn(boolean on) { this.on = on; } // setter
   
   // Override the paint() method to draw the LightBulb
   public void paint(Graphics g) {
      if (on) g.setColor(color);
      else g.setColor(COLOR_OFF);
      g.fillOval(10, 10, 30, 30);
   }
   // Three public methods are defined: switchOn(), switchOff(), and toggle(). 
   //These methods can be used as event handlers, which will be fired upon triggering of a certain event.
   public void switchOn() {   // switch on the Light
      on = true;
      repaint();
   }
   
   public void switchOff() {  // switch off the Light
      on = false;
      repaint();
   }
   
   public void toggle() {   // If on turns off; else turns on
      on = !on;
      repaint();
   }
}