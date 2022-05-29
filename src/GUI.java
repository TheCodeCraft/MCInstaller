package me.reddev;

import javax.swing.*;
import java.awt.*;

public class GUI {

    public GUI() {
        open();
    }

    private static JLabel status;
    private static JProgressBar progressBar;

    private void open() {
        JFrame f = new JFrame();
        JPanel p = new JPanel();

        status = new JLabel("Installer");
        status.setForeground(new Color(30, 80, 98));
        status.setFont(new Font("Verdana", Font.PLAIN, 18));
        status.setHorizontalAlignment(JLabel.CENTER);
        status.setVerticalAlignment(JLabel.TOP);

        progressBar = new JProgressBar(0, 100);
        progressBar.setForeground(new Color(30, 80, 98));
        progressBar.setBackground(new Color(65, 65, 65));
        progressBar.setBorderPainted(false);
        progressBar.setFont(new Font("Verdana", Font.PLAIN, 18));
        progressBar.setValue(0);
        progressBar.setStringPainted(true);
        progressBar.setSize(Values.getWindowWidth() - 10, 20);

        p.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        p.setBackground(new Color(36, 36, 36));
        p.add(status);
        p.add(progressBar);

        f.add(p, null);
        f.setDefaultCloseOperation(3);
        f.setTitle("iLaya Installer");
        f.setPreferredSize(new Dimension(Values.getWindowWidth(), Values.getWindowHeight()));
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.pack();
        f.setVisible(true);

        /**
         * Install
         */
        Utils.install();
    }

    public static JProgressBar getProgressBar() {
        return progressBar;
    }

    public static JLabel getStatus() {
        return status;
    }

}
