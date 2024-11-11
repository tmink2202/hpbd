import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    public static final int WIDTH = 1280;
    public static final int HEIGHT = 720;

    public Panel() {
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.setBackground(Color.black);
        this.setLayout(null);

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setFont(new Font("Monospaced", Font.ITALIC, 100));
        g.setColor(Color.white);

        g.drawString("Happy Birthday", 200, 350);

    }
}
