import javax.swing.*;
//import java.awt.*;

public class Main extends JPanel {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Happy Birthday");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        Panel p = new Panel();
        frame.add(p);
        frame.pack();

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
