import java.awt.Color;

import javax.swing.JFrame;

public class Transport {

    public Transport() {

        JFrame frame = new JFrame("Transport Example");
        frame.setSize(1920, 1080);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.BLACK);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Transport();
    }
}