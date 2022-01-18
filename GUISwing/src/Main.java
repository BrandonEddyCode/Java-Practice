import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * GUI learning
 */
public class Main {

    public static void main(String[] args) {
        
        // JFrame = a GUI window to add components to
        
        JFrame frame = new JFrame(); // create a frame

        ImageIcon image = new ImageIcon("GUISwing/Kirby.png"); // create an image icon you have to put the SOURCE/NAME

        JLabel label = new JLabel(); // create a label
        label.setText("Bro, do you even code?"); // set text of label
        label.setIcon(image); // set

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        frame.setSize(1000,1000); // sets the x-dimension, and the y-dimension of the frame
        frame.setVisible(true); // make frame visable
        frame.add(label); // add label

        /*frame.setTitle("Title goes here"); // this is the title
        frame.setResizable(false); // prevents frame from being resized

        ImageIcon image = new ImageIcon("Kirby.png"); // create an image icon top left corner of page
        frame.setIconImage(image.getImage()); //change icon of frame
        frame.getContentPane().setBackground(new Color(122,33,250)); //change color of background ot "hex decimal" 0x123456
        */

       
    }
}