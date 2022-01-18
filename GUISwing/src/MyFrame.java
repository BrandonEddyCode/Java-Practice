import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
    
    MyFrame() {

        JFrame frame = new JFrame(); // create a frame
        this.setTitle("Title goes here"); // this is the title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        this.setResizable(false); // prevents frame from being resized
        this.setSize(420,420); // sets the x-dimension, and the y-dimension of the frame
        this.setVisible(true); // make frame visable

        ImageIcon image = new ImageIcon("Kirby.png"); // create an image icon
        this.setIconImage(image.getImage()); //change icon of frame
        this.getContentPane().setBackground(new Color(122,33,250)); //change color of background ot "hex decimal" 0x123456
    }
}
