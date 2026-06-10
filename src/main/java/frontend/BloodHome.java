package frontend;

import javax.swing.*;

public class BloodHome extends JFrame {
    public BloodHome() {
        setTitle("BloodCare - Home");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 550);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new BloodHome().setVisible(true));
    }
}
