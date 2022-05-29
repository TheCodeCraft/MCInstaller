package me.reddev;

import javax.swing.*;
import java.awt.*;

public class GUIDone {

    public GUIDone() {
        open();
    }

    private static JLabel status;

    private void open() {
        JFrame f = new JFrame();
        JPanel p = new JPanel();

        status = new JLabel("Installer - Done");
        status.setForeground(new Color(30, 80, 98));
        status.setFont(new Font("Verdana", Font.PLAIN, 18));
        status.setHorizontalAlignment(JLabel.CENTER);
        status.setVerticalAlignment(JLabel.TOP);

        p.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        p.setBackground(new Color(36, 36, 36));
        p.add(status);

        f.add(p, null);
        f.setDefaultCloseOperation(3);
        f.setTitle("iLaya Installer - Done!");
        f.setPreferredSize(new Dimension(Values.getWindowWidth(), Values.getWindowHeight()));
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.pack();
        f.setVisible(true);
    }

    public static JLabel getStatus() {
        return status;
    }

}
